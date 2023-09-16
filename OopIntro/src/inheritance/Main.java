package inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer customer1 = new IndividualCustomer();
        customer1.customerNumber = "12345";

        CorporateCustomer customer2 = new CorporateCustomer();
        customer2.customerNumber = "456";

        Customer[] customers = {customer1, customer2};

        CustomerManager customerManager = new CustomerManager();

        customerManager.multipleAdd(customers);

    }
}
