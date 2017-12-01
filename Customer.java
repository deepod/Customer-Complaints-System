
/**
 * Represents a Customer.
 *
 * @author (David Pitt)
 * @version (28/11/2017)
 */
public class Customer extends Person
{
    // instance variables 
    private String address;
    private String email;
    private String phoneNumber;
    
    
    public Customer(int iD,String name, String address, String email, String phoneNumber){
        super(iD,name);
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber; 
    }
    
    public Customer(){
        //super();
    }
    
    public String toString(){
        return (super.toString() + "\n Address: " + address + "\n Email: " + email 
                 + "\n Phone number: " + phoneNumber);
    }
    
    
}
