import transport.*;

public class Main {
    public static void main(String[] args) {


        Car myCar1 = new Car("Lada", "Granta", 1.7, "Жёлтый", 2015, "Россия",
                null, null, null, 0, false, null);
        Car myCar2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия",
                null, null, null, 0, false, new Car.Key(true, true));
        Car myCar3 = new Car("BMW", "Z8", 3.0, "Чёрный", 2021, "Германия",
                null, null, null, 0, false, null);
        Car myCar4 = new Car("KIA", "Sportage IV", 2.4, "Красный", 2018, "Южная Корея",
                null, null, null, 0, false, null);
        Car myCar5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея",
                null, null, null, 0, false, null);

        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());
        System.out.println(myCar4.toString());
        System.out.println(myCar5.toString());

    }


}