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
    public Car (String brand, String model, double engineVolume, String color, int year, String country){
        if (brand.equals(null) || brand.equals("")) {
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if (model.equals(null) || model.equals("")){
            this.model = "default";
        }else{
            this.model = model;
        }
        if (engineVolume <= 0){
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }
        if (color.equals(null) || color.equals("")){
            this.color = "White";
        }else{
            this.color = color;
        }
        if (year <= 0){
            this.year = 2000;
        }else{
            this.year = year;
        }
        if (country.equals(null) || country.equals("")){
            this.country = "default";
        }else{
            this.country = country;
        }
    }
    public  Car (){
        this.brand = "default";
        this.model = "default";
        this.engineVolume = 1.5;
        this.color = "White";
        this.year = 2000;
        this.country = "default";
    }
}

