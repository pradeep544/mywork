package repository;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import model.Student;

public class StudentRepositoryJDBCImpl implements StudentRepositoryJDBC {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public List<Student> getAllDetails() {
		return getJdbcTemplate().query("select * from students",new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public Student getDetails(int id) {
		return getJdbcTemplate().queryForObject("select * from students where sid = ?", new Object[] {id}, new BeanPropertyRowMapper<Student>(Student.class));
	}

}
