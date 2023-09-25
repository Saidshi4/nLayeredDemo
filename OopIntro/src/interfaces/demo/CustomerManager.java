package interfaces.demo;

public class CustomerManager {
    private final ICustomerDal iCustomerDal;

    CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal = iCustomerDal;
    }
    public void add(){
        iCustomerDal.add();
    }
}
