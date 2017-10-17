package com.springjdbc.service;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Ĭ�� spring �������ݿ�ķ�ʽ
 * @author TongZhou
 *
 */
public class SpringJDBCService {

	/**
	 * ʹ�� Spring Ĭ�ϵ����ݿⷽʽ
	 */
	@Test
	public void JDBCTest(){
		
		//�������ݿ����ӵ�����Դ
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		//�������ݿ��������Ϣ
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///adminmanger");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		//��������Դ
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		
		//ִ��SQL
		jdbcTemplate.execute("create table user(id int primary key auto_increment,name varchar(20))");
	}
}
