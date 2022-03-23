package cg.feb18.spring.lab1_4;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext c= new AnnotationConfigApplicationContext(Test.class);

		Employee emp2 =  context.getBean("employee2",Employee.class);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp2);
		//

		((AbstractApplicationContext) context).close();
	}
}