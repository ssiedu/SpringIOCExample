package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		
		//creating the bean instance at your own
		//TestBean testBean=new TestBean();
		//testBean.show();
		
		//out-sourcing bean instantiation to IoC Container
		
		//using BeanFactory
		/*
		//BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("d:\\conf\\spring.xml"));
		TestBean testBean=(TestBean) beanFactory.getBean("myObj");
		testBean.show();
		*/
		
		//using ApplicationContext
		
		//ApplicationContext context=new FileSystemXmlApplicationContext("d:\\conf\\spring.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		TestBean testBean=(TestBean) context.getBean("myObj");
		testBean.show();
		
		DemoBean demoBean=context.getBean("demoObj",DemoBean.class);
		demoBean.display();
		
		
		
		
		

	}

}
