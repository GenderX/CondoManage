package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

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
 * Servlet implementation class addVistorServlet
 */
public class addVistorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminService as= new AdminServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addVistorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    visitor v = new visitor();
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
			BeanUtils.populate(v, request.getParameterMap());
			System.out.println(v.getDate());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	    try {
	    	as.addVisitor(v);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
