package interfaces.learning;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new EmailLogger(), new DatabaseLogger(), new FileLogger(), new SmsLogger()};

        Customer customer = new Customer(1, "Said", "Gulizada");
        CustomerManager customerManager = new CustomerManager(loggers);

        customerManager.add(customer);








    }
}
