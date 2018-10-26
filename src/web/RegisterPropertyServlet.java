package web;

import java.io.IOException;
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

import domain.Register;
import service.AdminService;
import service.Impl.AdminServiceImpl;

/**
 * Servlet implementation class RegisterPropertyServlet
 */
public class RegisterPropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterPropertyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Register rs = new Register();

		try {
			
			ConvertUtils.register(new Converter() {
				
				public Object convert(Class clazz, Object value) {
					
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

			BeanUtils.populate(rs, request.getParameterMap());
			rs.setReason(rs.getReason().trim());
			System.out.println(rs);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		AdminService as = new AdminServiceImpl();
		try {
			as.regReason(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
