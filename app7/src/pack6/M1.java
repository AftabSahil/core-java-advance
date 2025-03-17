package pack6;

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
	Job[] jobs;
	public Employee(String name, Job[] jobs) {
		super();
		this.name = name;
		this.jobs = jobs;
	}
	Iterator iterator() {
		return new Iterator(jobs);
	}
	class Iterator{
		Job[] jobs;
		int pointer;
		Iterator(Job[] jobs){
			this.jobs = jobs;
		}
		public boolean hasMoreJobs() {
			return pointer < jobs.length;
		}	
		public Job nextJob() {
			return jobs[pointer ++];
		}
	}
}
public class M1 {
	public static void main(String[] args) {
		Job j1 = new Job("software", 45000.0);
		Job j2 = new Job("hardware", 25000.0);
		Job j3 = new Job("sale", 15000.0);
		Job j4 = new Job("marketing", 10000.0);
		Job[] allJobs = {j1, j2, j3, j4};		
		Employee e1 = new Employee("manu", allJobs);
		Employee.Iterator it1 = e1.iterator();
		Job job;		
		while(it1.hasMoreJobs()) {
			job = it1.nextJob();
			System.out.println(job.title + job.salary);
		}
		
		System.out.println("------------");
		Employee.Iterator it2 = e1.iterator();
		while(it2.hasMoreJobs()) {
			job = it2.nextJob();
			System.out.println(job.title + job.salary);
		}
	}
}
