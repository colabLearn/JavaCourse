import java.util.Arrays;
import java.util.Objects;

public class CarDealership {
    private String dealerName;
    private int maxCarDisplay;
    private Car [] carInStock;

    public CarDealership() {
    }

    public CarDealership(String dealerName, int maxCarDisplay) {
        this.dealerName = dealerName;
        this.maxCarDisplay = maxCarDisplay;
    }

    public CarDealership(String dealerName, int maxCarDisplay, Car[] carInStock) {
        this.dealerName = dealerName;
        this.maxCarDisplay = maxCarDisplay;
        this.carInStock = carInStock;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public int getMaxCarDisplay() {
        return maxCarDisplay;
    }

    public void setMaxCarDisplay(int maxCarDisplay) {
        this.maxCarDisplay = maxCarDisplay;
    }

    public Car[] getCarInStock() {
        return carInStock;
    }

    public void setCarInStock(Car[] carInStock) {
        this.carInStock = carInStock;
    }
    public  int countCarsInStock (){
        return this.carInStock.length;
    }

    public void addCarToStock(Car car) {
        int oldLength = this.carInStock.length;
        int newLength = oldLength+1;
        Car [] newStock = new Car[newLength];

        for (int i=0; i<=newLength-2; i++){
            newStock[i]=this.carInStock[i];
        }
        newStock[newLength-1] =car;

        this.setCarInStock(newStock);
    }
    public void displayStock(){
        if (this.carInStock.length<=this.maxCarDisplay) {
            for (Car car: carInStock) {
                System.out.println(car);
            }
        }else {
            for (int i=0; i<this.maxCarDisplay-1; i++){
                System.out.println(carInStock);
            }
        }
    }
}
