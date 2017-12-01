
/**
 * Write a description of class LiftComplaint here.
 *
 * @author (David Pitt)
 * @version (28/11/2017)
 */
public class LiftComplaint extends Complaint
{
    // instance variables 
    private String lift; // the name of the lift
    private int floor; // the floor the lift is on

    /**
     * Constructor for objects of class LiftComplaint
     */
    public LiftComplaint(int submissionId, int customerId, String description,String lift, int floor, Date submissionDate)
    {
        super(submissionId, customerId,description, submissionDate);
        this.lift = lift;
        this.floor = floor;
    }

    /**
     * A String representation of a Lift Complaint
     *
     * @return LiftComplaint as a String.
     */
    public String toString()
    {
        // put your code here
        return (super.toString() + "\nLift: " + lift + "\nFloor: " + floor);
    }
}
