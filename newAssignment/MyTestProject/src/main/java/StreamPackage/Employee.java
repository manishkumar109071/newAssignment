package StreamPackage;

public class Employee {
	
	private String employeeId;
	private String employeeName;
	private String employeeCountry;
	private String EmployeeMobile;
	private Double employeeSalary;
	private int yearOfJoining;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCountry() {
		return employeeCountry;
	}
	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}
	public String getEmployeeMobile() {
		return EmployeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		EmployeeMobile = employeeMobile;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeCountry="
				+ employeeCountry + ", EmployeeMobile=" + EmployeeMobile + ", employeeSalary=" + employeeSalary
				+ ", yearOfJoining=" + yearOfJoining + "]";
	}
	public Employee(String employeeId, String employeeName, String employeeCountry, String employeeMobile,
			Double employeeSalary, int yearOfJoining) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeCountry = employeeCountry;
		EmployeeMobile = employeeMobile;
		this.employeeSalary = employeeSalary;
		this.yearOfJoining = yearOfJoining;
	}
	
	
	
	

}
