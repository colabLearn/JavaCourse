

public class Main {
    public static void main(String[] args) {

        Car obaCar = new Car(
                "Toyota",
                Car.InputPrice(1300.50),
                CarEngineType.Petrol
        );

        Car semiCar = new Car();
        semiCar.setManufacturer("Vauxhall");
        semiCar.setPrice(Car.InputPrice(1300.40));
        semiCar.setEngineType(CarEngineType.Diesel);

        Car timiCar = new Car();
        timiCar.setManufacturer("Mercedes");
        timiCar.setEngineType(CarEngineType.Hybrid);

        System.out.println(obaCar);
        System.out.println(semiCar);
        System.out.println(timiCar);
        System.out.println(semiCar.getPrice().getClass() );

    }
}