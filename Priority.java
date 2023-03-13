/**
 * Priority interface consists of constants of different levels of priorities and methods to access and modify an objects priority value.
 * 
 * @author nicholasromano
 * @version 1.0
 * Module 2 Programming Lab
 * CS131 Spring 2023
 */
public interface Priority {
	final int MIN_PRIORITY = 1; //Constant variable used to represent a task or priority of low priority.
	final int MED_PRIORITY = 5; //Constant variable used to represent a task or priority of medium priority.
	final int MAX_PRIORITY = 10; //Constant variable used to represent a task or priority of high priority.
	
	/**
	 * Accessor method that returns the priority level of either a Process or Task object
	 * @return priority - the current priority level
	 */
	public int getPriority();
	
	/**
	 * Mutator method that sets the priority level to a new level.
	 * @param priority - the new priority level to be set to
	 */
	public void setPriority(int priority);
}
