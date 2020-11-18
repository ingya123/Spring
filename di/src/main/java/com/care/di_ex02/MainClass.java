package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean stBean = new STBean();
		//Student st = new Student();
		String config = "classpath:applicationST.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(config);
		STBean stBean = ctx.getBean("stb",STBean.class);
		
		//String name = "홍길동";
		//int age = 20;
		//stBean.setName(name);
		//stBean.setAge(age);
		//stBean.setSt(st);
		stBean.print();
	}
}
