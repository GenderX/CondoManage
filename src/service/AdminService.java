package service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import domain.Register;
import domain.Standard;
import domain.User;
import domain.housething;
import domain.visitor;

public interface AdminService {

	User login(String string, String string2) throws SQLException;

	void addHousething(housething ht) throws SQLException;

	void addVisitor(visitor v) throws SQLException;

	List<visitor> listVisitor(Date date) throws SQLException;

	void regReason(Register rs) throws SQLException;

	List<Register> getRegisterByroomId(String id) throws SQLException;

	List<Register> getRegisterByDate(Date date) throws SQLException;

	void setcost(Standard st) throws SQLException;

}
