package web;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Register;
import service.AdminService;
import service.Impl.AdminServiceImpl;

/**
 * Servlet implementation class RegServletshowdate
 */
public class RegServletshowdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServletshowdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String da  = request.getParameter("reportDate");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(da);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		AdminService as = new AdminServiceImpl();
		List<Register> list=null;
		try {
			list = as.getRegisterByDate(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("listid", list);
		request.getRequestDispatcher("/regshowid.jsp").forward(request, response);;
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
