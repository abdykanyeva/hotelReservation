package model;

import java.util.Collection;
import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String Email;

    private final String EmailRegex = "^(.+)@(.+).com$";
    private final Pattern pattern = Pattern.compile(EmailRegex);

    public Customer(String firstName, String lastName, String Email){
        if(!pattern.matcher(Email).matches()){
            throw new IllegalArgumentException("Invalid Email, Error");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
    }

    public static void put(String email, Customer customer) {
        System.out.println(email + customer);
    }

    public static String get(String customerEmail) {
        return customerEmail;
    }

    public static Collection<Customer> values() {
        return values();
    }

    public String toString(){
        return firstName + " " + lastName +" " + "Email: " + Email;
    }

    public String getEmail() {
        return Email;
    }
}
