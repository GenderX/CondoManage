package dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.StudentDao;
import domain.StuAndStuhouse;
import domain.Student;
import domain.out;
import domain.studenthouse;
import utils.DataSourceUtils;

public class StudentDaoImpl implements StudentDao {

	public void addStudent(Student s) throws SQLException {

		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into student values (?,?,?,?,?,?,?,?,?,?,?)";

		runner.update(sql, s.getSid(), s.getSex(), s.getYear(), s.getCollege(), s.getMajor(), s.getNote(), s.getName(),
				s.getAddress(), s.getCalendarYear(), s.getDedpartment(), s.getClasses());

	}

	public List<StuAndStuhouse> listStudent() throws SQLException {
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select s.*,sh.* from student s,studenthouse sh where s.sid=sh.stuid" ;
		List<StuAndStuhouse> list = runner.query(sql, new BeanListHandler<StuAndStuhouse>(StuAndStuhouse.class));
		
		
		System.out.println(list);
		
		
		
		
		return list;
	}

	public Student getStudentById(String sid) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from student where sid=?";
		Student student = runner.query(sql, new BeanHandler<Student>(Student.class),sid);
		
		
		
		return student;
	}

	public void upDateStudent(Student s) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="update  student set sex=?,year=?,college=?,major=?,note=?,"
				+ "name=?,address=?,calendarYear=?,dedpartment=?, classes=?  where sid=? ";
		
		
		
		
		
		
		runner.update(sql,s.getSex(),s.getYear(),s.getCollege(),s.getMajor(),s.getNote(),s.getName(),
				s.getAddress(),s.getCalendarYear(),s.getDedpartment(),s.getClasses(),s.getSid());
		
		
	}

	public void deleteStudent(String sid) throws SQLException {
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="DELETE FROM student WHERE sid = ? ";
		runner.update(sql,sid);
		
		
	}

	public void addStudenthouse(studenthouse sh) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into studenthouse values (?,?,?,?)";
        runner.update(sql,sh.getStuid(),sh.getHouseid(),sh.getBuildingid(),sh.getDate());
		
		
		
		
		
	}

	public void addOut(out o) throws SQLException {

		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into myweb.out values (?,?,?,?)";
		runner.update(sql,o.getBuildingid(),o.getHouseid(),o.getReason(),o.getDate());
		
		
	}

}
