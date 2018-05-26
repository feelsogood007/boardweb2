package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	
	public static void main(String[] args){
		
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();

//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);
//		tv.powerOn();
//		tv.powerOff();

		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
		TV tv = (TV)factory.getBean("ltv");
		tv.powerOn();
		tv.powerOff();
				
		factory.close();
		
	}
	
}
