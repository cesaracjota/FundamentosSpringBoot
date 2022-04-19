package com.springplatzi.springplatzi.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo desde mi componente dos");
	}

}
