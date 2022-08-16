package week6CustormerSystemExample;

public class Employee extends Person {
	
	// Employee extends Person
	// double salary
	// double totalSlaesToDate
	// constructors
	// getter and setters
	// toString
	
	private double salary;
	private double totalSalesToDat;
	
	
	public Employee() {
		super();
		this.salary=0;
		this.totalSalesToDat=0;
	}
	
	public Employee( double salary, double totalsalesToDate) {
		
		
		this();
		this.salary=salary;
		this.totalSalesToDat= totalsalesToDate;
		
	}

	public double getSalary () {
		return salary;
	}
	public double gettotalsalesToDate() {
		return totalSalesToDat;
	}
	
	public void setPhone(double salary) {
		this.salary=salary;
		
	}
	public void settotalsalesToDate(double totalsalesToDate) {
		this.totalSalesToDat=totalsalesToDate;
	}
	
	public String toString () {
		return"Employee [salary: "+ salary+", totalSalesToDate: "+totalSalesToDat+"]";
	}
}
