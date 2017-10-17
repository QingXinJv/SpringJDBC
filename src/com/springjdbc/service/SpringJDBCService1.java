package com.springjdbc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ͨ�������ļ��������ݿ�
 * @author TongZhou
 *
 */
// ʹ�� Spring �� JUnit �Ĳ���
//ͨ�� ContextConfiguration ��ȡ�����ļ�
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringJDBCService1 {
	
	@Autowired
	//ע�� �����ݿ������� id="jdbcTemplate"
	@Qualifier("jdbcTemplate")
	//���ݿ����Ӷ���
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * �������ݿ� 
	 */
	@Test
	public void dome(){
		
		//ִ�� SQL
		jdbcTemplate.execute("create table dashuju (id int primary key auto_increment,name varchar(20))");
	}
}
