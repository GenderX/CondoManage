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
 * Servlet implementation class addStudentServlet
 */
public class addStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService ss=new StudentServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudentServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Student s=new Student();
		try {
			BeanUtils.populate(s, request.getParameterMap());			
			s.setNote(s.getNote().trim());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		try {
			ss.addStudent(s);
		} catch (SQLException e) {
			request.getRequestDispatcher("/fail.jsp");
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/room.jsp");
	
	
	
	
	
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
