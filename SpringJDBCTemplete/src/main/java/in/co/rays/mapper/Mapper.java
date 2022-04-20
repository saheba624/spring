package in.co.rays.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.co.rays.bean.UserBean;

public class Mapper implements RowMapper<UserBean>{

	public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UserBean bean = new UserBean();
		bean.setId(rs.getLong(1));
		bean.setFname(rs.getString(2));
		bean.setLname(rs.getString(3));
		
		return bean;
	}
	
	

}
