package week1day2;

public class employeedetails {
	public void EmployeeName() {
		String EmployeeName="Vimal";
		int employeeId=1703;
		System.out.println("Employee Name="+EmployeeName);
		System.out.println("employee Id="+employeeId);
	}
	public void EmployeeAddress() {
		String EmployeeAddress="Mayiladuthurai";
		System.out.println("Employee Address="+EmployeeAddress);
	}
	public void EmployeeSalary() {
		float EmployeeSalary=25000.89f;
		System.out.println("Employee Salary="+EmployeeSalary);
	}
	public void EmployeeMobileNO() {
		long EmployeeMobileNo=1234567890;
		System.out.println("Employee Mobile No="+EmployeeMobileNo);
	}
	public static void main(String[] args)
	{
		employeedetails details=new employeedetails();
		details.EmployeeName();
		details.EmployeeAddress();
		details.EmployeeSalary();
		details.EmployeeMobileNO();
	}
}
