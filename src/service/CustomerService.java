package service;
import model.Customer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class CustomerService {
    private static CustomerService customerService = null;
    public CustomerService() {
    }
    public static CustomerService getInstance() {
        if (null == customerService) {
            customerService = new CustomerService();
        }
        return customerService;
    }
    private static List < Customer > customerList = new ArrayList < Customer >( );
    public void addCustomer ( String firstName, String lastName, String email ) {
        try {
            customerList.add ( new Customer ( firstName, lastName, email ) );
        } catch ( IllegalArgumentException exception ) {
            exception.getLocalizedMessage ( );
        }
    }
    public Customer getCustomer ( String customerEmail ) {
        try {
            for ( int i = 0; i < customerList.size ( ); i++ ) {
                if ( customerList.get ( i ).getEmail ( ) == customerEmail ) {
                    return customerList.get ( i );
                }
            }
        } catch ( ArrayIndexOutOfBoundsException exception ) {
            System.out.println ( "This email does not match any customer in our database, please try again" );
        }
        return null;
    }
    public Collection< Customer > getAllCustomers ( ) {
        return customerList;
    }
}
