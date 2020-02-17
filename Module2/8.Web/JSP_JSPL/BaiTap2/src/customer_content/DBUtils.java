package customer_content;

import java.util.ArrayList;
import java.util.List;

public class DBUtils {
    private static  List<Customer> list = new ArrayList<>();

    static {
        Customer e = new Customer("Goku", "01/02/1991", "Da Nang", "src/image/goku.jpg");
        Customer e1 = new Customer("Vegeta", "06/02/1992", "Da Nang", "src/image/cadic.jpg");
        list.add(e);
        list.add(e1);
    }

    public List<Customer> querryEm() {
        return list;
    }
}
