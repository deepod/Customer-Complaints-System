
/**
 * This class is to test the system.
 *
 * @author (David Pitt)
 * @version (27/11/2017)
 */

import java.util.*;

public class Tester
{
    private static int iD = 0;
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int iD = 0;
        String name, email, address, phoneNumber, role, department;
        
        
        System.out.println("Enter name");
        name = sc.next();
        
        
            
        //System.out.println("Enter email");
        //email = sc.next();
            
        //System.out.println("Enter Address");
        //address = sc.next();
        
        //System.out.println("Enter phone number");
        //phoneNumber = sc.next();
       
        //Customer cust1 = new Customer(getId(),name,address,email, phoneNumber);
        //Customer cust2 = new Customer(getId(),name,address,email, phoneNumber);
       
        System.out.println("Enter role");
        role = sc.next();
        
        System.out.println("Enter department");
        department = sc.next();
        
        
        Staff staffMember = new Staff(iD,name, role, department);
        
        System.out.println(staffMember);
        //System.out.println(cust2);
    }
    
    private static int getId(){
        iD += 1;
        return iD;
    }
}
