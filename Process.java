/**
 * Process class represents a given process.
 * The Process class implements the Priority interface to set the priority value of the Process.
 * The Process class implements the Comparable interface to compare the priority of different Process.
 * 
 * @author nicholasromano
 * @version 1.0
 * Module 2 Programming Lab
 * CS131 Spring 2023
 */
public class Process implements Priority, Comparable<Process>{
	final String processID; //represents the current Process
	private int priority; //represents priority level of the Process
		
	/**
	 * Preferred constructor that sets the processID to the string value passed in through the parameter list and sets the priority to one.
	 * @param processID
	 */
	public Process(String processID)
	{
		this.processID = processID;
		this.priority = 1;
	}

	/**
	 * Accessor method that returns the processID value
	 * @return the current processID value
	 */
	public String getProcessID() {
		return processID;
	}

	/**
	 * Accessor method that returns the priority level of either a Process or Task object
	 * @return priority - the current priority level
	 */
	@Override
	public int getPriority() {
		return priority;
	}

	/**
	 * Mutator method that sets the priority level to a new level.
	 * @param priority - the new priority level to be set to
	 */
	@Override
	public void setPriority(int priority) 
	{
		if(priority < 1)
		{
			this.priority = Priority.MIN_PRIORITY;
		}
		
		else if (priority > 10)
		{
			this.priority = Priority.MAX_PRIORITY;
		}
		
		else
		{
			this.priority = priority;
		}
	}

	
	/**
	 * compareTo method compares the priority of two Process objects.
	 * @param operation - another Process object to compare priorities with
	 * @return 0 is returned if both priorities are equal.
	 * 1 is returned if the priority of the Process object to the left of the dot operator is greater than Process task object passed in the parameter list. 
	 * -1 is returned if the priority of the Process object passed in the parameter list is greater than the Process object to the left of the dot operator.
	 */
	@Override
	public int compareTo(Process operation) {
		int result;
		if(priority == operation.priority)
    	{
    		result = 0;
    	}
    	else
    	{
    		if(priority > operation.priority)
    		{
    			result = 1;
    		}
    		else
    		{
    			result = -1;
    		}
    	}
    	
    	 return result;	
	}

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}
	
	

}
