package szkolenie2022czerwiec

class FuelUsageController {

    FuelCostService fuelCostService

    def index() {
        render "Litwo ojczyzno moja itp"
    }

    def drivingPrice() {
        render fuelCostService.calculateCostByModel(params.model)

        // insert into car values ( nextval('hibernate_sequence'), 0, 'VW','Golf'...
    }

    def saveNewCar(){
        render fuelCostService.saveNewCar("Focus","Ford","Diesel",6.2, 1.6)

    }
}
