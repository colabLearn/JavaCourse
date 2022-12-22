

public class Main {
    public static void main(String[] args) {

        Car Car1 = new Car(
                "Toyota",
                Car.InputPrice(1300.50),
                CarEngineType.Petrol
        );

        Car Car2 = new Car();
        Car2.setManufacturer("Vauxhall");
        Car2.setPrice(Car.InputPrice(1300.40));
        Car2.setEngineType(CarEngineType.Diesel);

        Car Car3 = new Car();
        Car3.setManufacturer("Mercedes");
        Car3.setEngineType(CarEngineType.Hybrid);

//        System.out.println(Car1);
//        System.out.println(Car2);
//        System.out.println(Car3);
//        System.out.println(Car2.getPrice().getClass() );

        Car [] KaratuStock = {Car1,Car2};
        CarDealership dealer1 = new CarDealership(
                "Karatu Cars",
                5,
                KaratuStock
        );

//        System.out.println(dealer1.countCarsInStock());
//        dealer1.displayStock();
//        dealer1.addCarToStock(Car3);
//        System.out.println(dealer1.countCarsInStock());
//        dealer1.displayStock();

        Car ToyotaInStock = dealer1.findCarByManufacturer("Toyota");
        Car MazdaInStock = dealer1.findCarByManufacturer("Mazda");
        System.out.println(ToyotaInStock);
        System.out.println(MazdaInStock);


    }
}