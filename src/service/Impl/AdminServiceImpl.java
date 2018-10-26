package service.Impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import dao.AdminDao;
import dao.Impl.AdminDaoImpl;
import domain.Register;
import domain.Standard;
import domain.User;
import domain.housething;
import domain.visitor;
import service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminDao ad=new AdminDaoImpl();

	public User login(String name, String password) throws SQLException {
		
		User u=ad.login(name,password);
		
		
		return u;
	}

	public void addHousething(housething ht) throws SQLException {
		
		
		
				ad.addHousething(ht);
			}

	public void addVisitor(visitor v) throws SQLException {
		ad.addVisitor(v);
		
	}

	public List<visitor> listVisitor(Date date) throws SQLException {
		List<visitor> list = ad.listVisitor(date);
		return list;
	}

	public void regReason(Register rs) throws SQLException {
		
		ad.regReason(rs);
		
	}

	public List<Register> getRegisterByroomId(String id) throws SQLException {
		
		
		
		
		return ad.getRegisterByroomId(id);
	}

	public List<Register> getRegisterByDate(Date date) throws SQLException {
		
		
		
		
		return ad.getRegisterByDate(date);
	}

	public void setcost(Standard st) throws SQLException {
		
		ad.setcost(st);
		
	}
		
	}




