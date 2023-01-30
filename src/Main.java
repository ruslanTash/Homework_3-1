public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.brand = "Lada";
        myCar1.model = "Granta";
        myCar1.engineVolume = 1.7;
        myCar1.color = "Yellow";
        myCar1.year = 2015;
        myCar1.country = "Russia";

//        Car myCar1 = new Car("Lada", "Granta", 1.7, "Yellow", 2015, "Russia" );
        Car myCar2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany");
        Car myCar3 = new Car("BMW", "Z8", 3.0, "Black", 2021, "Germany");
        Car myCar4 = new Car("KIA", "Sportage IV", 2.4, "Red", 2018, "South Korea");
        Car myCar5 = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea");

        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());
        System.out.println(myCar4.toString());
        System.out.println(myCar5.toString());

        Car myCar6 = new Car("", "", -5, "", -1, "");
        System.out.println(myCar6.toString());

    }
}