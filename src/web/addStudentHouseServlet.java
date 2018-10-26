package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import domain.studenthouse;
import service.StudentService;
import service.Impl.StudentServiceImpl;

/**
 * Servlet implementation class addStudentHouseServlet
 */
public class addStudentHouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  //  private StudenthouseService ss = new StudenthouseServiceImpl(); 
	private StudentService ss=new StudentServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudentHouseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		studenthouse sh = new studenthouse();
		 String string = request.getParameter("date");
		    System.out.println(string);
		  try {
				//自己指定一个类型转换器（将String转成Date）
				ConvertUtils.register(new Converter() {
					@Override
					public Object convert(Class clazz, Object value) {
						//将string转成date
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
						Date parse = null;
						try {
							parse = format.parse(value.toString());
						} catch (Exception e) {
							e.printStackTrace();
						}
						return parse;
					}
				}, Date.class);
				//映射封装
				BeanUtils.populate(sh, request.getParameterMap());
				System.out.println(sh.getDate());
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
            try {
				ss.addStudenthouse(sh);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    response.sendRedirect(request.getContextPath()+"/listStudentServlet");        

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
