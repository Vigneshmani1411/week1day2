package week1.day2;

public class Employeedetails {
	
public void printempName(String empName, int empId) {
	System.out.println("employeeName :" +empName+" " +"Emp id:" +empId);
}
public void printempAddress(String empAddress) {
	System.out.println("Employee Address : "+ empAddress);
}
public void printempSalary(double empSalary) {
	System.out.println("Employee Salary :"+ empSalary);
}
public void printempMobileno(long mobileNumber) {
	System.out.println("Employee Mobile Number :"+mobileNumber);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeedetails empdet = new Employeedetails();			
		empdet.printempName("Vasanth", 6454);
		empdet.printempAddress("Chennai");
		empdet.printempSalary(5000.236);
		empdet.printempMobileno(652364256l);
		
	}

}
