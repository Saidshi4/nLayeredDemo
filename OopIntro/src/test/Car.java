package test;
public class Car {
    int id;
    String name;
    String model;
    double engineVolume;
    String color;
    int year;
    String number;

    public Car() {
        System.out.println("Sold");
    }

    public Car(int id, String name, String model, double engineVolume, String color, int year, String number) {
        this();
        this.id = id;
        this.name = name;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.number = number;
    }
}
