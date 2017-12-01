
/**
 * Write a description of class CCSImplementation here.
 *
 * @author (David Pitt)
 * @version (27/11/2017)
 */

import java.util.*;

public class CCSImplementation implements CCS
{
    
    //instance variables
    private static int currentId = 0;
    private ArrayList<Person> people = new ArrayList<Person>();
    private ArrayList<Submission> submissions = new ArrayList<Submission>();
    
    //Constructors
    public CCSImplementation(){};
    
    
     /**
     * Add a comment.
     * @param commentId the comment id
     * @param customerId the customer id
     * @param comment the description of the comment
     * @param date the date of the comment
     */
    public void addComment(int submissionId,int customerId, String comment,Date date){
        submissions.add(new Comment(submissionId,customerId,comment,date));
    }
    
    
    /**
     * Add a new customer
     * @param customerId the customer id
     * @param name the customer name
     * @param address the customer's address
     * @param email the customer's email
     * @param phone the customer's phone
     */
    public void addCustomer(int customerId, String name, String address, String email, String phone){
        people.add(new Customer(customerId, name, address, email, phone));
    }
    
    /**
     * Add a general complaint
     * @param submissionId the submission id
     * @param customerId the customer id
     * @param description the description of the complaint
     * @param date the date of the occurence
     */
    public void addGeneralComplaint(int submissionId,int customerId,String description,Date date){
        submissions.add(new Complaint(submissionId, customerId, description, date));
    }
    
    /**
     * add a lift complaint
     * @param submissionId the submission id
     * @param customerId the customer id
     * @param description the desciption of the complaint
     * @param lift the lift name
     * @param floor the lift floor
     * @param date the date of the occurence
     */
    public void addLiftComplaint(int submissionId,int customerId,String description,String lift,int floor,Date date){
        submissions.add(new LiftComplaint(submissionId, customerId, description, lift, floor, date));
    }
    
    /**
     * add a new member of staff
     * @param staffId the staff id
     * @param name the staff name
     * @param role the staff role
     * @param departmenr the staff department
     */
    public void addStaff(int staffId,String name,String role,String department){
        people.add(new Staff(staffId,name,role,department));
    }
    
    /**
     * add a Staff complaint
     * @param subissionId the submission id
     * @param customerId the customerId
     * @param description the description
     * @param staffId the staff member id
     * @param the date of the occurence
     */
    public void addStaffComplaint(int submissionId,int customerId,String description,int staffId,Date date){
        submissions.add(new StaffComplaint(submissionId,customerId,description,staffId,date));
    }
    
    /**
     * Archive submissions
     */
    public void archiveSubmissions(){
        
    }
    
    /**
     * Assign or re-assign a Resolver to a complaint
     * @param complaintId the id of the complaint
     * @param staffId the id of the resolver
     * @param deadline the date for the resolution of the complaint
     */
    public void assignResolver(int complaintId,int staffId,Date deadLine){
        /**
         * find the complaint of comaplintId
         * find the staff member of staffId
         * 
         * 
        for (Submission i : submissions) {
            if (get(i).getSubmissionId() == complaintId){
                
                {
        }
        */
    }
    
    /**
     * Get a list of all actions for a complaint
     * @param complaintId the complaint id
     * @return the actions for the complaint
     */
    public List<Action> getActionsForComplaint(int complaintId){
        
        for (Submission c : submissions){
               if (c.getSubmissionId() == complaintId){
                return c.getActions();
            }          
        }
        return null;
    }
    
    
    /**
     * Get the customer with the specified id
     * @param customerId the customer id
     * @return the customer
     */
    public Customer getCustomer(int customerId){
        for (Person p : people){
            if ((p.getId() == customerId) && (p instanceof Customer)){
                return (Customer)p;
            }
        }
        
        return null;
    }   
   
    /**
     * Get a list of customers
     * @return the customers
     * 
     */
    public List<Customer> getCustomerList(){
        List<Customer> customerList = new ArrayList<Customer>(); // temp to be returned
        for (Person p : people){
            if (p instanceof Customer){
                customerList.add((Customer)p);
            }
        }
        
        return customerList;
    }
    
    /**
     * Get an unused customer id
     * @return the unused customer id 
     */
    public int getNewCustomerId(){
        currentId += 1;
        return currentId;
    }
    
    /**
     * Get an unused staff id
     * @return the unused staff id
     */
    public int getNewStaffId(){
        currentId += 1;
        return currentId;
    }
    
    /**
     * get an unused submission id
     * @return the unused submission id
     */
    public int getNewSubmissionId(){
        currentId += 1;
        return currentId;
    }
    
    /**
     * Get the staff member with the specified id
     * @param staffId the staff id
     * @return the staff member
     */
    public Staff getStaff(int staffId){
        for (Person p : people){
            if (p.getId() == staffId){
                return (Staff)p;
            }
        }
        return null;
    }
    
    /**
     * Get a list of staff.
     * @return the staff
     */
    public List<Staff> getStaffList(){
        List <Staff> staffList = new ArrayList<Staff>(); 
        for (Person p : people){
            if (p instanceof Staff) {
                staffList.add((Staff)p);
            }
        }
        return staffList;
    }
    
    /**
     * Get the submission with the specified id.
     * @param submissionId  the submission id
     * @redurn the submission
     */
    public Submission getSubmission(int submissionId){
        for (Submission s : submissions){
            if (s.getSubmissionId() == submissionId){
                return s;
            }
        }
        return null; // submission has not been found.
    }
    
    /**
     * Get a list of submissions
     * @return the submissions
     */
    public List<Submission> getSubmissionList(){
        return submissions;
    }

    /**
     * Record an action to a complaint.
     * @param complaintId the id of the complaint
     * @param actionTaken a description of the action taken
     * @param date the date of the action
     */
    public void recordAction(int complaintId,String actionTaken,Date date){
        //find the complaint with complaintId, then add the new action to its Action arrayList. 
        //for (Complaint c : complaints
        boolean found = false;
        for (Submission s : submissions){
            if ((s.getSubmissionId() == complaintId)){
                s.addAction(new Action(actionTaken, date));
                found = true;
            }
        }
        if (!found){
            System.out.println("The complaint was not found");
        }
    }
    
    /**
     * Record a complaint resolved
     * @param complaintId the id of the complaint
     */
    public void recordComplaintResolved(int complaintId){
        
    }
    
    /**
     * Remove an existing customer.
     * @param customerId the customer id
     */
    public void removeCustomer(int customerId){
        
    }
    
}
