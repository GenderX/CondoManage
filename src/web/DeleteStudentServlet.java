package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StudentService;
import service.Impl.StudentServiceImpl;

/**
 * Servlet implementation class DeleteStudentServlet
 */
public class DeleteStudentServlet extends HttpServlet {
	private StudentService ss=new StudentServiceImpl();
	private static final long serialVersionUID = 1L;
       
    public DeleteStudentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String sid = request.getParameter("sid");
		try {
			ss.deleteStudent(sid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/listStudentServlet");
		
	
	
	
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
