package com.cy.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
//数据层配置类
@Configuration
@MapperScan("com.cy.dao")
public class SpringRespostoryConfig {
	//整合连接池对象
	@Bean(value="durid")
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///dbgoods?serverTimezone=GMT");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
		
	}
	//整合mybatis
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource ) throws Exception {
		SqlSessionFactoryBean factoryBean= new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		
		return factoryBean.getObject(); 
	}

}
