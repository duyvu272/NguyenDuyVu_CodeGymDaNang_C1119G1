package commons;

        import models.Customer;
        import java.util.*;
public class YearOldComarator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer, Customer customer1) {
        if(customer.getBirthOfDay().getYear()==customer1.getBirthOfDay().getYear())
            return 0;
        else if(customer.getBirthOfDay().getYear()>customer1.getBirthOfDay().getYear())
            return 1;
        else
            return -1;
    }

}
