package repository;

import java.util.List;

import model.Student;

public interface StudentRepositoryJDBC {

	List<Student> getAllDetails();

	Student getDetails(int id);

}