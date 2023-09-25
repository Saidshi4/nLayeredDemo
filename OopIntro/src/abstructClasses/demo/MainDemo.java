package abstructClasses.demo;

public class MainDemo {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}
