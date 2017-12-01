
/**
 * Write a description of class StaffComplaint here.
 *
 * @author (David Pitt)
 * @version (28/11/2017)
 */
public class StaffComplaint extends Complaint
{
    // instance variables
    private int staffId;
    /**
     * Constructor for objects of class StaffComplaint
     */
    public StaffComplaint(int submissionId, int customerId,  String description, int staffId, Date submissionDate)
    {
        super(submissionId,customerId, description, submissionDate);
        this.staffId = staffId;
    }
    
    //accessor methods
    /**
     * Returns the id if the staff member involved.
     * @return staffId as int
     */
    public int getStaffId()
    {
        return staffId;
    }

    /**
     * Returns string representation of a staff complaint
     * @return staffComplaint as a string
     */
    public String toString()
    {
        return (super.toString() + "\n Staff ID: " + staffId);
    }
}
