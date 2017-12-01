
/**
 * Write a description of class Comment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comment extends Submission
{
    // instance variables
    private String comment; // represents a comment

    /**
     * Constructor for objects of class Comment
     */
    public Comment(int submissionId, int customerId, String comment, Date submissionDate)
    {
        super(submissionId, customerId, submissionDate);
        this.comment = comment;
        
    }

    /**
     * A String representation of a Comment.
     * @return Comment as a String
     */
    public String toString()
    {
        // put your code here
        return (super.toString() + "\nComment: " + comment);      
    }
}
