package com.emp;

public class Employee {

	private int empId;
	private String emapName;
	private int deptId;
	private String status = "active";
	private int salary;

	public Employee(int empId, String emapName, int deptId, String status, int salary) {
		super();
		this.empId = empId;
		this.emapName = emapName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmapName() {
		return emapName;
	}

	public void setEmapName(String emapName) {
		this.emapName = emapName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", emapName=" + emapName + ", deptId=" + deptId + ", status=" + status
				+ ", salary=" + salary + "]";
	}

}
