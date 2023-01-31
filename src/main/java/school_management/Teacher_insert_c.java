package school_management;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher_insert_c  {
	
	@Id

	private int id;
	private String Teacher_name;
	private String Subject;
	private String Phone_no;
	private String Teacher_email;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacher_name() {
		return Teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		Teacher_name = teacher_name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getTeacher_email() {
		return Teacher_email;
	}
	public void setTeacher_email(String teacher_email) {
		Teacher_email = teacher_email;
	}
	
}
