package service;

import java.sql.SQLException;
import java.util.List;

import domain.StuAndStuhouse;
import domain.Student;
import domain.out;
import domain.studenthouse;

public interface StudentService {

	void addStudent(Student s) throws SQLException;

	List<StuAndStuhouse> listStudent() throws SQLException;

	Student getStudentById(String sid) throws SQLException;

	void upDateStudent(Student s) throws SQLException;

	void deleteStudent(String sid) throws SQLException;

	void addStudenthouse(studenthouse sh) throws SQLException;

	void addOut(out o) throws SQLException;

}
