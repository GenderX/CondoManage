package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import domain.housething;
import service.AdminService;
import service.StudentService;
import service.Impl.AdminServiceImpl;
import service.Impl.StudentServiceImpl;

/**
 * Servlet implementation class addHousethingServlet
 */
public class addHousethingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminService ss=new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addHousethingServlet() {
        super();
        //尼玛币
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> map = request.getParameterMap();
		System.out.println(map);
		housething ht = new housething();
			try {
				BeanUtils.populate(ht, request.getParameterMap());
				System.out.println(ht);
			} catch (IllegalAccessException | InvocationTargetException e1) {
				e1.printStackTrace();
			}
		try {
			ss.addHousething(ht);
		} catch (Exception e) {
			request.getRequestDispatcher("/fail.jsp");
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/student.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
