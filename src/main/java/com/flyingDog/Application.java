package com.flyingDog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
* Title: Application
* Description:
* springBoot 主程序 
* Version:1.0.0  
* @author pancm
* @date 2018年1月5日
 */
@SpringBootApplication
@EnableTransactionManagement//事务注解
@MapperScan("com.flyingDog.dao")
public class Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


//		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		GetSpringBean springBean=new GetSpringBean();
//		springBean.setApplicationContext(context);
//		TopologyApp app = context.getBean(TopologyApp.class);
//       app.main(args);
	}
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }

}
