package pack2;

import pack2.Employee;
import pack2.Job;

class Job{
	String title;
	Double salary;
	public Job(String title, Double salary) {
		super();
		this.title = title;
		this.salary = salary;
	}
}

class Employee{
	String name;
	Job[] jobs ;
	private int pointer ;
	public Employee(String name, Job[] jobs) {
		super();
		this.name = name;
		this.jobs = jobs;
	}
	
	public boolean hashMoreJobs() {
		if( pointer == jobs.length) {
			pointer = 0;
			return false;
		}
		return true;
	}
	
	public Job nextJob() {
		return jobs[pointer ++];
	}
}
public class M2 {
	public static void main(String[] args) {
		Job j1 = new Job("software", 45000.0 );
		Job j2 = new Job("hardware", 25000.0 );
		Job j3 = new Job("sale", 15000.0 );
		Job j4 = new Job("marketing", 10000.0 );
		Job[] allJobs = {j1, j2, j3, j4};
		
		Employee e1 = new Employee("manu", allJobs);
		
		Job job;
		
		while(e1.hashMoreJobs()) {
			job = e1.nextJob();
			System.out.println(job.title + ":"+ job.salary);
		
		}
		System.out.println("------------------");
		
		while(e1.hashMoreJobs()) {
			job = e1.nextJob();
			System.out.println(job.title + ":"+ job.salary);
		}
		
	}

}