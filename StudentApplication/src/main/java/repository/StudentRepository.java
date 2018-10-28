package repository;

import java.util.List;

import model.Student;

public interface StudentRepository {
	
	List<Student> getAllDetails();	
	Student getDetails(int id);
}