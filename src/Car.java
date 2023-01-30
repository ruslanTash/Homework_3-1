public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    @Override
    public String toString() {
        return brand + " " + model + ", " + engineVolume + "L\nЦвет: " + color + "\nГод выпуска: " + year + "\nСтрана приозводства: " + country + "\n";
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
        this.color = (color == null || color.isEmpty()) ? "White" : color;
        this.year = (year <= 0) ? 2000: year;
        this.country = (country == null || country.isEmpty()) ? "defalt" : country;
    }

    public Car() {
        this.brand = "default";
        this.model = "default";
        this.engineVolume = 1.5;
        this.color = "White";
        this.year = 2000;
        this.country = "default";
    }
}

