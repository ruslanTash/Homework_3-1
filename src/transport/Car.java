package transport;

public class Car {
    //    Объявление значений по умолчанию:
    private String defaultBrand = "default";
    private String defaultModel = "default";
    private double defaultEngineVolume = 1.5;
    private String defaultColor = "Белый";
    private int defaultYear = 2000;
    private String defaultCountry = "default";
    private String defaultGearBox = "МКПП";
    private String defaultBodyType = "седан";
    private String defaultRegistrationNumber = "";
    private int defaultSeats = 4;
    private boolean defaultIsWinterTires = false;
    //    Объявление констант класса:
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final int seats;
    private final String bodyType;
    //     Объявление переменных класса:
    private double engineVolume;
    private String color;
    private String registrationNumber;
    private String gearBox;
    private boolean isWinterTires;
    private Key key;

    //    Переопределение метода toString:
    @Override
    public String toString() {
        return "Марка: " + brand + "\nМодель:  " + model + ", " + engineVolume + "L\nЦвет: " + color + "\nГод выпуска: " + year + "\nСтрана приозводства: " + country + "\nТип КП: "
                + gearBox + "\nКузов: " + bodyType + "\nГос.номер: " + registrationNumber + "\nКоличество мест: " + seats
                + "\nВид резины: " + getTypeOfTires() + "\n" + key + "\n";
    }

    private void setKey(Key key) {
        this.key = key == null ? new Key(false, false) : key;
    }

    //    Конструктор класса:
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String gearBox,
               String bodyType,
               String registrationNumber,
               int seats,
               boolean isWinterTires,
               Key key) {
        this.brand = (brand == null || brand.isEmpty()) ? defaultBrand : brand;
        this.model = (model == null || model.isEmpty()) ? defaultModel : model;
        this.engineVolume = (engineVolume <= 0) ? defaultEngineVolume : engineVolume;
        this.color = (color == null || color.isEmpty()) ? defaultColor : color;
        this.year = (year < 0) ? defaultYear : year;
        this.country = (country == null || country.isEmpty()) ? defaultCountry : country;
        this.gearBox = (gearBox == null || gearBox.isEmpty()) ? defaultGearBox : gearBox;
        this.bodyType = (bodyType == null || bodyType.isEmpty()) ? defaultBodyType : bodyType;
        this.registrationNumber = (registrationNumber == null || registrationNumber.isEmpty()) ? defaultRegistrationNumber : registrationNumber;
        this.seats = (seats < 1) ? defaultSeats : seats;
        this.isWinterTires = isWinterTires;
        setKey(key);
    }


    //Геттеры класса:
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    public String getGearBox() {
        return this.gearBox;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int getSeats() {
        return this.seats;
    }

    public String getTypeOfTires() {
        return this.isWinterTires ? "Зимняя резина" : "Летняя резина";
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWinterTires(boolean isWinterTyres) {
        this.isWinterTires = isWinterTyres;
    }

    public boolean changeTiresToSeasonal(int mounth) {
        if (isWinter(mounth)) {
            this.isWinterTires = true;
        }
        return this.isWinterTires;
    }

    private boolean isWinter(int mounth) {
        return mounth < 5 || mounth > 10;
    }

    public static class Key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "дистанционный запуск двигателя" : "без удалённого запуска двигателя") + ", "
                    + (keylessEntry ? "безключевой доступ" : "безключевой доступ отсутствует");
        }
    }
}




