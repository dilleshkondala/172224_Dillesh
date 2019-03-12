//package com.org.implementation;
//
//import java.util.List;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.ResultSetExtractor;
//
//import com.dillesh.RowMapperServices.UserRowMapper;
//import com.dillesh.UserPojoServices.Login;
//import com.dillesh.UserPojoServices.User;
//import com.dillesh.UserServiceInterfaces.UserServiceInterface;
//
//public class UserServicesImpl implements UserServiceInterface {
//
//	ApplicationContext context = new ClassPathXmlApplicationContext("spring-web-config.xml");
//	UserDaoImpl userdao = (UserDaoImpl) context.getBean("userdao");
//
//	@Autowired
//	DataSource datasource;
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//
//	@Override
//	public User validateUser() {
//		Login login;
//		String sql = "select * from userdata where mobilenumber='" + login.getMobileNum() + "' and password='"
//				+ login.getPassword() + "'";
//		List<User> userList = jdbcTemplate.query(sql, new UserRowMapper());
//
//		return userList.size() > 0 ? userList.get(0) : null;
//
//	}
//
//	@Override
//	public boolean addUser(User user) {
//		userdao.insert(user);
//		return true;
//	}
//
//}
