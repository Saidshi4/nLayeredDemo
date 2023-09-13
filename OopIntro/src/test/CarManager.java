package test;

public class CarManager {
    public void contact(Car car){
        System.out.println("Call to " + car.number);
    }

    public void like(Car car){
        System.out.println(car.name + " is liked.");
    }
}
