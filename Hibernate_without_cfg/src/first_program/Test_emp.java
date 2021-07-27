package first_program;

import org.hibernate.Session;

public class Test_emp {

	public static void main(String[] args) {
		
		
		Session ss1 = Hibernate_uti.getses().openSession();
		Employee emp=new Employee();
		emp.setEmp_id(223);
		emp.setEmp_name("Ramesh");
		emp.setEmp_designation("Manager");
		
		ss1.save(emp);
		ss1.beginTransaction().commit();

	}

}
