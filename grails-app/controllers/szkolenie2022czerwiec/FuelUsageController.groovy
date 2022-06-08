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

    def saveNewCar() {
        Car car = fuelCostService.saveNewCar("Focus", "Ford", "Diesel", 6.2, 1.6)
        render car as JSON
    }

    def showAllCars(){
        render view: 'showAllCars', model: [carList: Car.list()]
    }

    def newCarForm(){
        render view 'carForm'
    }
}
