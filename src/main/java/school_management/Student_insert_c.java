package school_management;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_insert_c {
	@Id
	private int id;
	private String Student_name;
	private String Student_email;
	private String Branch;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_email() {
		return Student_email;
	}
	public void setStudent_email(String student_email) {
		Student_email = student_email;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	

}
