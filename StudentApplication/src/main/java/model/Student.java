package model;

public class Student {

	private int sid;
	private String firstName;
	private String secondName;
	
	public Student(int sid, String firstName, String secondName) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", secondName=" + secondName + "]";
	}
	
}
