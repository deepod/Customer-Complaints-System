
/**
 * Represents a person.
 *
 * @author (David Pitt)
 * @version (28/11/2017)
 */
public class Person
{
    // instance variables 
    private int id;
    private String name;
    private static int latestId; // holds the latest iD generated
    
    /**
     * Constructor for objects of class Person
     */
    public Person(int id, String name)
    {
        this.id = generateId();
        this.name = name;       
    }
    
    public Person(){};

    // Accessor methods
    /**
     * get a person's Id
     * @return the person's iD
     */
    public int getId(){
        return id;
    }
    
    /**
     * get a person's name
     * @return the person's namae
     */
    public String getName(){
        return name;
    }
    
    /**
     * Person toString()
     * @return a String representation of Person
     */
    public String toString(){
        return ("ID: " + id + "\n Name: " + name);
    }
    
    private static int generateId(){
        latestId += 1;
        return latestId;
    }
    

}