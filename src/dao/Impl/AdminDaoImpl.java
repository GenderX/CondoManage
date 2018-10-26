package dao.Impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dao.AdminDao;
import domain.Register;
import domain.Standard;
import domain.User;
import domain.housething;
import domain.visitor;
import utils.DataSourceUtils;

public class AdminDaoImpl implements AdminDao {

	public User login(String name, String password) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from users where name=? and password=?";
		User query = runner.query(sql, new BeanHandler<User>(User.class), name, password);
		return query;
	}

	public void addHousething(housething ht) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into housethings values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		runner.update(sql, ht.getBuildingid(), ht.getRoomid(), ht.getDoor_num(), ht.getDoor_stat(), ht.getCab_num(),
				ht.getCab_stat(), ht.getDesk_num(), ht.getDesk_stat(), ht.getChair_num(), ht.getChair_stat(),
				ht.getLight_num(), ht.getLight_stat(), ht.getFan_num(), ht.getFan_stat(), ht.getOthers());

	}

	public void addVisitor(visitor v) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into visitor values (?,?,?,?,?,?,?,?,?)";
		 //Timestamp timeStamp = new Timestamp(v.getDate().getTime()); 
		 runner.update(sql,v.getBuildingid(),v.getHouseid(),v.getBevistname(),v.getVistname(),v.getRelative()
				 ,v.getDate(),v.getIdnumber(),v.getIdtype(),v.getDutyname());
		
		
		
		
		
		
		
		
		
	}

	public List<visitor> listVisitor(Date date) throws SQLException {
		
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from visitor where date = ?";
		List<visitor> list = runner.query(sql, new BeanListHandler<visitor>(visitor.class),date);
		return list;
	}

	public void regReason(Register rs) throws SQLException {
		
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into myweb.register values(?,?,?,?,?,?)";

		runner.update(sql, rs.getBuildingId(), rs.getRoomId(), rs.getReason(), rs.getRegisterDate(), false,null);
		System.out.println("3");
		
	}

	public List<Register> getRegisterByroomId(String id) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from myweb.register where buildingid=?";
		
		List<Register> reg = runner.query(sql, new BeanListHandler<Register>(Register.class), id);

		return reg;
		
		
	}

	public List<Register> getRegisterByDate(Date date) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from myweb.register where registerdate=?";
		List<Register> reg = runner.query(sql, new BeanListHandler<Register>(Register.class), date);

		return reg;
		
		
		
	}

	public void setcost(Standard st) throws SQLException {
		
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into myweb.standard values(?,?,?,?,?,?,?)";

		runner.update(sql, st.getBuildingId(), st.getWaterBase(), st.getWaterPrice(), st.getEleBase(), st.getElePrice(),
				st.getLivingFee(), st.getNote());
		
	}

}
