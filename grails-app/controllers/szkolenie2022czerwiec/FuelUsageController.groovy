package szkolenie2022czerwiec

import grails.converters.JSON
import grails.converters.XML

class FuelUsageController {

    FuelCostService fuelCostService

    def index() {
        render "Litwo ojczyzno moja itp"
    }

    def drivingPrice() {
        render fuelCostService.calculateCostByModel(params.model)

        // insert into car values ( nextval('hibernate_sequence'), 0, 'VW','Golf'...
    }

    def newCarForm(){
        render view: 'carForm'
    }

    def saveNewCar() {
        fuelCostService.saveNewCar(params.model, params.producer, params.fuelTypeMyszjolen, 6.2, 1.6)
        redirect action: 'showAllCars'
    }

    def showAllCars(){
        render view: 'showAllCars', model: [carList: Car.list()]
    }

}
