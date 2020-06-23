package com.altimatrik.authentication.model;

/**
 * The Class EmployeeDetails.
 */
public class EmployeeDetails {

	private String employeeName;
	private String department;
	private String band;
	private int salary;

	/**
	 * @param employeeName
	 * @param department
	 * @param band
	 * @param salary
	 */
	public EmployeeDetails(String employeeName, String department, String band, int salary) {
		super();
		this.employeeName = employeeName;
		this.department = department;
		this.band = band;
		this.salary = salary;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the band
	 */
	public String getBand() {
		return band;
	}

	/**
	 * @param band the band to set
	 */
	public void setBand(String band) {
		this.band = band;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
