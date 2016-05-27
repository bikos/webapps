// default package
// Generated May 24, 2016 7:12:57 PM by Hibernate Tools 5.1.0.Alpha3
package com.jspwebapps.DatabasePojos;
import java.util.HashSet;
import java.util.Set;

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Integer departmentId;
	private String departmentName;
	private String departmentAddress;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Department() {
	}

	public Department(String departmentName, String departmentAddress) {
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
	}

	public Department(String departmentName, String departmentAddress, Set<Employee> employees) {
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.employees = employees;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return this.departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
