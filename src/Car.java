public class Car {
    String brand;
    String model;
    String productionYear;
    String productionCountry;
    String color;
    String engineVolume;

    public Car(String brand, String model, String productionYear, String productionCountry, String color, String engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                '}';
    }
}
