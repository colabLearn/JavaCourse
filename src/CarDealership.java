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
}
