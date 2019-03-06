package cn.itcast.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void add() {
		System.out.println("dao............");
		String sql = "insert into user value(?,?)";
		jdbcTemplate.update(sql,"张三" ,"232");
	}


}
