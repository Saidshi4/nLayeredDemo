package inheritance;

public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + " added!");
    }

    public void multipleAdd(Customer[] customers){
        for (Customer customer : customers){
            add(customer);
        }
    }
}
