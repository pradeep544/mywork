package repository;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.ResourceUtils;

import model.Student;

public class StudentRepositoryImpl implements StudentRepository {
	
private static Map<Integer, Student> students = new HashMap<>();
	
	static {
		String path = "classpath:studentlist/students.csv";
		
		try(Stream<String> stream = Files.lines(ResourceUtils.getFile(path).toPath())){
			students = stream.map(line -> line.split(","))
							.map(arr -> new Student(Integer.parseInt(arr[0]),arr[1],arr[2]))
							.collect(Collectors.toMap(student -> student.getSid(), student -> student));
		} catch (IOException e) {
			System.out.println("error reading file from reseources directory" + e);
		}
	}

	@Override
	public List<Student> getAllDetails() {
		return students.values().stream().collect(Collectors.toList());
	}

	@Override
	public Student getDetails(int id) {
		return students.get(id);
	}

	
}
