package in.co.rays.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import in.co.rays.bean.*;

import in.co.rays.bean.UserBean;
import in.co.rays.mapper.Mapper;

public class UserDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(final UserBean dto) {

		final String sql = "INSERT INTO USER (ID,FNAME,LNAME) VALUES(?,?,?)";

		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.setLong(1, dto.getId());
				ps.setString(2, dto.getFname());
				ps.setString(3, dto.getLname());

				return ps;
			}
		}, holder);

		System.out.println("successfully added");

	}

	public UserBean List(int UserID) {

		String query = "select * from User where ID =?";
		RowMapper<UserBean> rowMapper = new Mapper();
		UserBean user = jdbcTemplate.queryForObject(query, rowMapper, UserID);

		return user;

	}

}