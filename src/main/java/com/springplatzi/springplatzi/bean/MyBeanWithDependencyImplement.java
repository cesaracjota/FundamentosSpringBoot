package com.springplatzi.springplatzi.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

	private MyOperation myOperation;
	
	public MyBeanWithDependencyImplement(MyOperation myOperation) {
		this.myOperation = myOperation;
	}

	@Override
	public void printWithDependency() {
		// TODO Auto-generated method stub
		int numero=1;
		System.out.println(myOperation.sum(numero));
		System.out.println("Hola desde la implementacion de un bean con dependencia");
	}

}
