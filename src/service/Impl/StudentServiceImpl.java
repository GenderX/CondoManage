package service.Impl;

import java.sql.SQLException;
import java.util.List;

import dao.StudentDao;
import dao.Impl.StudentDaoImpl;
import domain.StuAndStuhouse;
import domain.Student;
import domain.out;
import domain.studenthouse;
import service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao sd=new StudentDaoImpl();

	public void addStudent(Student s) throws SQLException {
		sd.addStudent(s);
		
		

	}

	public List<StuAndStuhouse> listStudent() throws SQLException {
	List<StuAndStuhouse>	list= sd.listStudent();
		return list;
	}

	public Student getStudentById(String sid) throws SQLException {
		
	return	sd.getStudentById(sid);
		
		
	}

	public void upDateStudent(Student s) throws SQLException {
		
		sd.upDateStudent(s);
		
		
	}

	public void deleteStudent(String sid) throws SQLException {
		sd.deleteStudent(sid);
		
	}

	public void addStudenthouse(studenthouse sh) throws SQLException {
		sd.addStudenthouse(sh);	
		
		
		
		
		
	}

	public void addOut(out o) throws SQLException {
		
		
		sd.addOut(o);
		
	}

}
