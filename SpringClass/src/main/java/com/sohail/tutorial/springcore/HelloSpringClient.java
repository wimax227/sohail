package com.sohail.tutorial.springcore;

//import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class HelloSpringClient {

	public static void main(String[] args) {
		 Resource  res = new ClassPathResource("applicationContext.xml");

	       BeanFactory  factory = new XmlBeanFactory(res);
	       HelloWorld helloworld= (HelloWorld)factory.getBean("hello");
	       
//	       helloworld.setCourseFee("400");
//	       helloworld.setDuration("5 days");
	       
	       System.out.println(helloworld.sayHello("zaman"));
	       
	       
	        
		

	}

}
