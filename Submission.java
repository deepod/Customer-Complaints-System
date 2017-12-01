import java.util.*;
/**
 * Write a description of class Submission here.
 *
 * @author (David Pitt)
 * @version (28/11/2017)
 */
public class Submission
{
    // instance variables
    private int submissionId;
    private int customerId;
    private static int latestSubmissionId = 0;
    private Date submissionDate;
    private ArrayList<Action> actions = new ArrayList<Action>();
    

    
    public Submission(){
        
    }
    /**
     * Constructor for objects of class Submission
     */
    public Submission( int submissionId, int customerId, Date submissionDate)
    {
        this.submissionId = submissionId;
        this.customerId = customerId;
        this.submissionDate = submissionDate;
    }
    
    // accessor methods
    
    /**
     * Accessor method to return the submission id.
     * @return  the submission id
     */
    public int getSubmissionId(){
        return submissionId;
    }
    
    /**
     * Returns th list of actions for the current complaint
     * @return actions as an ArrayList
     */
    public List<Action> getActions(){
        return actions;
    }

    /**
     * An example of a method - replace this comment with your own
     * @return  a String representation of a Submission
     */
    public String toString()
    {
        return ("Submission ID: " + submissionId + "\nCustomer ID: " + customerId + "\n");
    }
    
    /**
     * A method to generate a submission ID.
     * @return  a new submission id
     */
    public static int generateSubmissionId(){
        latestSubmissionId += 1;
        return latestSubmissionId;
        
    }
    
    public void addAction(Action action){
        actions.add(action);
    }
}
