
public class Application {
	public static void main(String[] args) {
		/**
		 * Running code from Program 1 (RationalNumber)
		 */
		System.out.println("Program 1 (RationalNumber):");
		RationalNumber rn1 = new RationalNumber(1, 2);
		RationalNumber rn2 = new RationalNumber(3, 7);
		
		System.out.println("Number 1: " + rn1);
		System.out.println("Number 2: " + rn2);
		System.out.print("Comparison: ");
		
		int rationalNumComparison = rn1.compareTo(rn2);
		if(rationalNumComparison == 1)
		{
			System.out.println(rn1 + " is greater than " + rn2 + "\n");
		}
		else if(rationalNumComparison == 0)
		{
			System.out.println(rn1 + " and " + rn2 + " are essentially equal to one another \n");
		}
		else if(rationalNumComparison == -1)
		{
			System.out.println(rn2 + " is greater than " + rn1 + "\n");
		}	
		
		
		/**
		 * Running code from Program 2 (Task Class and Process Class)
		 */
		System.out.println("Program 2 (Task, Process): ");
		System.out.println("Task Class");
		Task paper = new Task("Ethics Paper");
		paper.setPriority(7);
		paper.setStatus(Task.Status.NOT_STARTED);
		System.out.println("Task Name: " + paper.getName());
		System.out.println("Task Priority: " + paper.getPriority());
		System.out.println("Task Status: " + paper.getStatus());
		System.out.println(paper.toString() + "\n");
		
		Task program = new Task("Programming Assignment");
		program.setPriority(1);
		program.setStatus(Task.Status.COMPLETE);
		System.out.println("Task Name: " + program.getName());
		System.out.println("Task Priority: " + program.getPriority());
		System.out.println("Task Status: " + program.getStatus());
		System.out.println(program.toString() + "\n");
		
		int taskComparsion = paper.compareTo(program);
		if(taskComparsion > 0)
		{
			System.out.println("Prioritize working on " + paper.getName() + " rather than " + program.getName() + "\n");
		}
		else if(taskComparsion < 0)
		{
			System.out.println("Prioritize working on " + program.getName() + " rather than on " + paper.getName() + "\n");
		}
		else
		{
			System.out.println("Devote half your time working on both " + paper.getName() + " and " + program.getName() + "\n");
		}
		
		
		System.out.println("Process Class");
		Process update = new Process("Update System Software");
		update.setPriority(10);
		System.out.println("Process Name: " + update.getProcessID());
		System.out.println("Process Priority: " + update.getPriority());
		System.out.println(update.toString() + "\n");
		
		Process reconfigure = new Process("Reconfigure Monitor Visuals");
		reconfigure.setPriority(3);
		System.out.println("Process Name: " + reconfigure.getProcessID());
		System.out.println("Process Priority: " + reconfigure.getPriority());
		System.out.println(reconfigure.toString() + "\n");
		
		int processComparsion = update.compareTo(reconfigure);
		if(processComparsion > 0)
		{
			System.out.println("Prioritize more time for " + update.getProcessID() + " rather than " + reconfigure.getProcessID() + "\n");
		}
		else if(processComparsion < 0)
		{
			System.out.println("Prioritize more time for " + reconfigure.getProcessID() + " rather than on " + update.getProcessID() + "\n");
		}
		else
		{
			System.out.println("Devote half your time working on both " + update.getProcessID() + " and " + reconfigure.getProcessID() + "\n");
		}
		
		
	}
}
