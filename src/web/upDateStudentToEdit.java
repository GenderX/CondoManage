package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Student;
import service.StudentService;
import service.Impl.StudentServiceImpl;

public class upDateStudentToEdit extends HttpServlet {
	private StudentService ss=new StudentServiceImpl();
	private static final long serialVersionUID = 1L;
    public upDateStudentToEdit() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String sid = request.getParameter("sid");
		System.out.println(sid);
		request.setAttribute("sid", sid);
		Student s=null;
		try {
			s=ss.getStudentById(sid);
			request.setAttribute("student", s);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(s);
		request.getRequestDispatcher("/upDateStudent.jsp").forward(request, response);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
