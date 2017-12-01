import java.util.*;
/**
 * Deals with complaints.
 *
 * @author (David Pitt)
 * @version (28/11/2017)
 */
public class Complaint extends Submission
{
    // instance variables 
    private String description; // to represent a complaint
    private boolean resolved = false;
    private Staff resolver;
    private Date resolvedBy;
    //private ArrayList<Action> actions = new ArrayList<>(); // list of complaint's actions


    

    /**
     * Constructor for objects of class Complaint
     */
    public Complaint(int submissionId, int customerId,  String description, Date submissionDate)
    {
        super(submissionId,customerId,submissionDate);
        this.description = description;    
    }
    
    //accessors
    /**
     * @return returns true if resolved, otherwise false
     */
    public boolean getResolved()
    {
        return resolved;
    }
    
    //mutators
    /**
     * @param resolved set the value
     */
    public void setResolved(boolean resolved){
        this.resolved = resolved;
    }
    
    /**
     * Returns string representation of a complaint
     * @return the complaint as a String
     */
    public String toString()
    {
        return (super.toString() + "\nDescription: " + description);
    }
    
    
    

}
