
/**
 * This class represents a staff member.
 *
 * @author (David Pitt)
 * @version (28/11/2017)
 */
public class Staff extends Person
{
    // instance variables
    private String role;
    private String department;

    /**
     * Constructor for objects of class Staff
     */
    public Staff(int staffId,String name, String role, String department)
    {
        super(staffId,name);
        this.role = role;
        this.department = department;
    }
    
    public Staff(){};
    
    
    /**
     * Person toString()
     * @return a String representation of Staff member
     */
    public String toString(){
        return (super.toString() + "\n Role: " + role + "\n Department: " + department);
    }
}

    



