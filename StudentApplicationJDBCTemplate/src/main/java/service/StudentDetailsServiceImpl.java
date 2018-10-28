package service;

import java.util.List;

import model.Student;
import repository.StudentRepositoryJDBC;

public class StudentDetailsServiceImpl implements StudentDetailsService {
	
	private StudentRepositoryJDBC studentRepositoryJDBC;
	
	public StudentDetailsServiceImpl(){
		
	}	
	
	public StudentRepositoryJDBC getStudentRepositoryJDBC() {
		return studentRepositoryJDBC;
	}

	public void setStudentRepositoryJDBC(StudentRepositoryJDBC studentRepositoryJDBC) {
		this.studentRepositoryJDBC = studentRepositoryJDBC;
	}

	
	@Override
	public List<Student> getAllDetails(){
		return studentRepositoryJDBC.getAllDetails();
	}
	

	@Override
	public Student getDetails(int id) {
		return studentRepositoryJDBC.getDetails(id);
	}


}
