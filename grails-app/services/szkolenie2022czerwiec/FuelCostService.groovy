package szkolenie2022czerwiec

import grails.gorm.transactions.Transactional
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

@Transactional
class FuelCostService {

    static final String FUEL_SERVICE_ADDRESS = "https://www.autocentrum.pl/paliwa/ceny-paliw/";


    def calculateCostByFuelUsage(Double fuelUsage) {
        Document doc = Jsoup.connect(FUEL_SERVICE_ADDRESS).get()
        String priceText = doc.select('div.price').first().text()
        Double price = Double.parseDouble(priceText.split(" ")[0].replace(",", "."))
        return price * fuelUsage

    }

    def calculateCostByModel(String model) {
        if (model == "ford") {
            return calculateCostByFuelUsage(7.6)
        } else if (model == "vw") {
            return calculateCostByFuelUsage(6.9)
        } else {
            return 0
        }
    }

    def saveNewCar(String model, String producer,
                   String fuelType, Double fuelConsumption, Double engineVolume) {

        Car car = new Car(model: model,
                producer: producer,
                fuelType: fuelType,
                fuelConsumption: fuelConsumption,
                engineVolume: engineVolume)

        car.save()
    }
}
