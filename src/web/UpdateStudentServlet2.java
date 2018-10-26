package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import domain.Student;
import service.StudentService;
import service.Impl.StudentServiceImpl;

/**
 * Servlet implementation class UpdateStudentServlet2
 */
public class UpdateStudentServlet2 extends HttpServlet {
	private StudentService ss=new StudentServiceImpl();
	private static final long serialVersionUID = 1L;
       
    public UpdateStudentServlet2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Student s=new Student();
		try {
			BeanUtils.populate(s, request.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
			
		}
		try {
			ss.upDateStudent(s);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect(request.getContextPath()+"/listStudentServlet");
		
	
	
	
	
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
