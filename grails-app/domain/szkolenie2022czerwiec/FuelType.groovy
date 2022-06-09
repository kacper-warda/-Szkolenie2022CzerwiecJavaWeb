package szkolenie2022czerwiec

class FuelType {
    String name
    Double price

    static constraints = {
        price nullable: true
    }

    public String toString(){
        return name
    }
}
