
/**
 * Write a description of class Action here.
 *
 * @author (David Pitt)
 * @version (29/11/2017)
 */
public class Action
{
    // instance variables - replace the example below with your own
    
    private String actionTaken;
    private Date date;

    /**
     * Constructor for objects of class Action
     */
    public Action(String actionTaken, Date date)
    {
        this.actionTaken = actionTaken;
        this.date = date;
    }

    /**
     * A string representation of an Action
     * @return    Action as a String
     */
    public String toString()
    {
        return ("Date: " + date + "\tAction taken: " + actionTaken);
    }
}
