package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import domain.User;
import service.AdminService;
import service.Impl.AdminServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminService  as=new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	System.out.println("========================");
	User u=new User();
	try {
		BeanUtils.populate(u, request.getParameterMap());
	} catch (IllegalAccessException | InvocationTargetException e) {
		e.printStackTrace();
	}
	User user=null;
	try {
		user=as.login(u.getName(),u.getPassword());
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	if(user!=null) {


		session.setAttribute("user", user);
		
		
		response.sendRedirect(request.getContextPath()+"/home.html");
	
	}else {
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
