package com.interview;

public class Employee {

	private int empId;
	private String empName;
	private int deptId;
	private int salary;
	private String status = "active";

	public Employee(int empId, String empName, int deptId, int salary, String status) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.salary = salary;
		this.status = status;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return " [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", salary=" + salary + ", status="
				+ status + "]";
	}

}
