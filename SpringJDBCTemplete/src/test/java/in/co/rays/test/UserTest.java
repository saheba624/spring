package in.co.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.co.rays.bean.UserBean;
import in.co.rays.dao.UserDao;

public class UserTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/rays/springJDBC/configuration.xml");

		UserDao dao = context.getBean("UserDao", UserDao.class);

		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		UserBean bean = new UserBean();
		bean.setId(1);
		bean.setFname("saheba");
		bean.setLname("ansari");
		dao.add(bean);

		/*
		 * UserBean bean = dao.List(2); System.out.println(bean);
		 */

		/*
		 * int result= template.update(query, 102,"milli",
		 * "Kaushal","milli365@gmail.com", "milli@123456", "female");
		 */

	}

}
