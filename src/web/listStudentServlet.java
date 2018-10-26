package web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.StuAndStuhouse;
import domain.Student;
import domain.studenthouse;
import service.StudentService;
import service.Impl.StudentServiceImpl;

/**
 * Servlet implementation class listStudentServlet
 */
public class listStudentServlet extends HttpServlet {
	private StudentService ss=new StudentServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	List<StuAndStuhouse> list=null;
	try {
		list = ss.listStudent();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	request.setAttribute("list", list);
	request.getRequestDispatcher("/show.jsp").forward(request, response);;
	
	
	
	
	
	
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
