package lambdaExpression;

class Employee {
	
//	Instance Variables
	public int id;
	public String name;
	public int salary;
	public double yearsInOrg;
	public String role;
	public String gender;

//	Constructor
	public Employee(int id, String name, int salary, double years, String role, String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.yearsInOrg = years;
		this.role = role;
		this.gender = gender;
	}

//	Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getYearsInOrg() {
		return yearsInOrg;
	}
	public void setYearsInOrg(double yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
