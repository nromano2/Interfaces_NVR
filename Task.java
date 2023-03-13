/**
 * Task class represents a given task.
 * The Task class implements the priority interface to set the priority value of the task.
 * The Task class implements the Comparable interface to compare the priority of different tasks.
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 2 Programming Project
 * CS131 Spring 2023
 */
public class Task implements Priority, Comparable<Task>{
	/**
	 * Status is a enumerated data type that stores the three stages of progression for a Task object.
	 * NOT_STARTED - represents a task that has not been started.
	 * IN_PROGRESS - represents a task that is currently being worked on.
	 * COMPLETE - represents a task that has been finished.
	 */
	enum Status {NOT_STARTED, IN_PROGRESS, COMPLETE};

	final String name; //represents the name of the task
	private int priority; //represents the priority of the task
	private Status s; //represents the progression status of the task
	
	public Task(String taskName)
	{
		this.name = taskName;
		setPriority(1);
		this.s = Status.NOT_STARTED;
	}
	
	/**
	 * Accessor method that returns the current name of the task
	 * @return name - the current name of the task
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Accessor method that returns the current progression status of the task
	 * @return status - the status progression of the task
	 */
	public Status getStatus()
	{
		return s;
	}
	
	/**
	 * Mutator method that enables the user to update the status of the task by 
	 * passing in a new progression status of the task in the parameter list.
	 * @param taskStatus
	 */
	public void setStatus(String taskStatus)
	{
		this.s = Status.valueOf(taskStatus);
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
	 * compareTo method compares the priority of two Task objects.
	 * @param assignment - another Task object to compare priorities with
	 * @return 0 is returned if both priorities are equal, 
	 * 1 is returned if the priority of the task object to the left of the dot operator is greater than the task object passed in the parameter list 
	 * -1 is returned if the priority of the task object passed in the parameter list is greater than the task object to the left of the dot operator
	 */
	@Override
	public int compareTo(Task assignment)
	{
		if(this.priority == assignment.priority)
    	{
    		return 0;
    	}
    	else
    	{
    		if(this.priority > assignment.priority)
    		{
    			return 1;
    		}
    		else
    		{
    			return -1;
    		}
    	}	
	}
	
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", status=" + s + "]";
	}
	
	
}
