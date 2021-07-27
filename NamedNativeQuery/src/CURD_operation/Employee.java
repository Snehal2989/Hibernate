package CURD_operation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQueries({
	 @NamedNativeQuery(name="Insert_data",query="Insert into Employee values (?,?,?,?)",resultClass = Employee.class),
	 @NamedNativeQuery(name="Retreive_single",query="select * from employee where eid=:ed",resultClass = Employee.class),
	 @NamedNativeQuery(name="Update_data",query="Update Employee set salary=:sal where eid=:ed" ,resultClass = Employee.class),
	 @NamedNativeQuery(name="delete_data",query="delete from Employee where eid=:ed",resultClass = Employee.class),
	 @NamedNativeQuery(name="All_data",query="Select * from Employee",resultClass = Employee.class),
	 @NamedNativeQuery(name="Ins_data",query="Insert into Employee (eid,ename,edesg,salary) values(:ed,:en,:edsg,:esal)",resultClass = Employee.class)
})

public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private String edesg;
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee \neid=" + eid + "\nename=" + ename + "\nedesg=" + edesg + "\nsalary=" + salary + "]";
	}
	
	

}
