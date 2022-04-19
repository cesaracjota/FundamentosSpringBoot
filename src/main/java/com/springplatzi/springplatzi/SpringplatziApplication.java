package com.springplatzi.springplatzi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springplatzi.springplatzi.bean.MyBean;
import com.springplatzi.springplatzi.bean.MyBeanWithDependency;
import com.springplatzi.springplatzi.component.ComponentDependency;

@SpringBootApplication
public class SpringplatziApplication implements CommandLineRunner {
	
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	
	public SpringplatziApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringplatziApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}

}
