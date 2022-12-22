import java.math.BigDecimal;
import java.util.Objects;

public class Car {
    private String manufacturer;
    private BigDecimal price;

    private CarEngineType engineType;

    public Car(String manufacturer, BigDecimal price, CarEngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    public Car() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CarEngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(CarEngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(manufacturer, car.manufacturer) && Objects.equals(price, car.price) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, engineType);
    }

    public static BigDecimal InputPrice(double price) {
        return BigDecimal.valueOf(price);
    }
}

