package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import domain.out;
import service.StudentService;
import service.Impl.StudentServiceImpl;

/**
 * Servlet implementation class addOutServlet
 */
public class addOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService ss = new StudentServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addOutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out o = new out();
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
			
			BeanUtils.populate(o, request.getParameterMap());

			o.setReason(o.getReason().trim());
			System.out.println(o.getDate());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	    try {
			ss.addOut(o);
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
