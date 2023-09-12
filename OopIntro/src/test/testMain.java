package test;

public class testMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.id = 101;
        car1.name = "Mercedes";
        car1.model = "Maybach";
        car1.engineVolume = 4.0;
        car1.color = "Black";
        car1.year = 2023;
        car1.number = "012 496 50 50";

        Car car2 = new Car(102, "BMW", "X5", 2.0, "white", 2021,"050 210 10 95");

        Car[] cars = {car1, car2};

        for (Car car : cars) {
            System.out.println(car.name);
        }

        Category category1 = new Category();
        category1.id = 1001;
        category1.name = "Sedan";

        Category category2 = new Category();
        category2.id = 1002;
        category2.name = "SUV";

        Category[] categories = {category1,category2};

        for (Category category : categories){
            System.out.println(category.id + "\t" +category.name);
        }

        CarManager carManager = new CarManager();

        carManager.Contact(car1);
        carManager.Contact(car2);

    }
}
