
/**
 * Write a description of interface CCS here.
 *
 * @author (David Pitt)
 * @version (Version 1.0)
 */

import java.util.*;
public interface CCS
{
   
    //private static int currentStaffID = 0;
    //private static int currentCustomerID = 0;
    
    /**
     * Add a comment.
     * @param commentId the comment id
     * @param customerId the customer id
     * @param comment the description of the comment
     * @param date the date of the comment
     */
    public void addComment(int submissionId,int customerId, String comment,Date date);
    
    /**
     * Add a new customer
     * @param customerId the customer id
     * @param name the customer name
     * @param address the customer's address
     * @param email the customer's email
     * @param phone the customer's phone
     */
    public void addCustomer(int customerId, String name, String address, String email, String phone);
    
    /**
     * Add a general complaint
     * @param submissionId the submission id
     * @param customerId the customer id
     * @param description the description of the complaint
     * @param date the date of the occurence
     */
    public void addGeneralComplaint(int submissionId,int customerId,String description,Date date);
    
    /**
     * add a lift complaint
     * @param submissionId the submission id
     * @param customerId the customer id
     * @param description the desciption of the complaint
     * @param lift the lift name
     * @param floor the lift floor
     * @param date the date of the occurence
     */
    public void addLiftComplaint(int submissionId,int customerId,String description,String lift,int floor,Date date);
    
    /**
     * add a new member of staff
     * @param staffId the staff id
     * @param name the staff name
     * @param role the staff role
     * @param departmenr the staff department
     */
    public void addStaff(int staffId,String name,String role,String department);
    
    /**
     * add a Staff complaint
     * @param subissionId the submission id
     * @param customerId the customerId
     * @param description the description
     * @param staffId the staff member id
     * @param the date of the occurence
     */
    public void addStaffComplaint(int submissionId,int customerId,String description,int staffId,Date date);
    
    /**
     * Archive submissions
     */
    public void archiveSubmissions();
    
    /**
     * Assign or re-assign a Resolver to a complaint
     * @param complaintId the id of the complaint
     * @param staffId the id of the resolver
     * @param deadline the date for the resolution of the complaint
     */
    public void assignResolver(int complaintId,int staffId,Date deadLine);
    
    /**
     * Get a list of all actions for a complaint
     * @param complaintId the complaint id
     * @return the actions for the complaint
     */
    public java.util.List<Action> getActionsForComplaint(int complaintId);
    
    /**
     * Get the customer with the specified id
     * @param customerId the customer id
     * @return the customer
     */
    public Customer getCustomer(int customerId);
   
    /**
     * Get a list of customers
     * @return the customers
     * 
     */
    public java.util.List<Customer> getCustomerList();
    
    /**
     * Get an unused customer id
     * @return the unused customer id 
     */
    public int getNewCustomerId();
    
    /**
     * Get an unused staff id
     * @return the unused staff id
     */
    public int getNewStaffId();
    
    /**
     * get an unused submission id
     * @return the unused submission id
     */
    public int getNewSubmissionId();
    
    /**
     * Get the staff member with the specified id
     * @param staffId the staff id
     * @return the staff member
     */
    public Staff getStaff(int staffId);
    
    /**
     * Get a list of staff.
     * @return the staff
     */
    public List<Staff> getStaffList();
    
    /**
     * Get the submission with the specified id.
     * @param submissionId  the submission id
     * @redurn the submission
     */
    public Submission getSubmission(int submissionId);
    
    /**
     * Get a list of submissions
     * @return the submissions
     */
    public List<Submission> getSubmissionList();

    /**
     * Record an action to a complaint.
     * @param complaintId the id of the complaint
     * @param actionTaken a description of the action taken
     * @param date the date of the action
     */
    public void recordAction(int complaintId,java.lang.String actionTaken,Date date);
    
    /**
     * Record a complaint resolved
     * @param complaintId the id of the complaint
     */
    public void recordComplaintResolved(int complaintId);
    
    /**
     * Remove an existing customer.
     * @param customerId the customer id
     */
    public void removeCustomer(int customerId);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
}
