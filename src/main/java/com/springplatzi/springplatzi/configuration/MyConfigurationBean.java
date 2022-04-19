package com.springplatzi.springplatzi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springplatzi.springplatzi.bean.MyBean;
import com.springplatzi.springplatzi.bean.MyBean2Implement;
import com.springplatzi.springplatzi.bean.MyBeanImplement;
import com.springplatzi.springplatzi.bean.MyBeanWithDependency;
import com.springplatzi.springplatzi.bean.MyBeanWithDependencyImplement;
import com.springplatzi.springplatzi.bean.MyOperation;
import com.springplatzi.springplatzi.bean.MyOperationImplement;

@Configuration
public class MyConfigurationBean {
	
	@Bean
	public MyBean beanOperation() {
		return new MyBean2Implement();
	}
	
	@Bean
	public MyOperation beanOperationOperation() {
		return new MyOperationImplement();
	}
	
	@Bean
	public MyBeanWithDependency beanOperationOperationwithDependency(MyOperation myOperation) {
		return new MyBeanWithDependencyImplement(myOperation);
	}

}
