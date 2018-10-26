package web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import domain.visitor;
import service.AdminService;
import service.Impl.AdminServiceImpl;

/**
 * Servlet implementation class serachVistor
 */
public class serachVistorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminService as = new AdminServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serachVistorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String string = request.getParameter("date");
		System.out.println(string);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sf.parse(string);
			System.out.println();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<visitor> list = null;
		try {
			list = as.listVisitor(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/showVistor.jsp").forward(request, response);
		response.sendRedirect(request.getContextPath()+"/showVistor.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
