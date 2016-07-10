package com.jerin.spin.entity.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jerin.spin.entity.customer.Customer;
public class CustomerTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spin_entity-context.xml");
		
		CustomerDaoTest customerDao = (CustomerDaoTest)context.getBean("customerDaoTest");
		System.out.println("customerDao: "+customerDao.getCustomerList());
		
		for(Customer c:customerDao.getCustomerList()){
			System.out.println("Name: "+c.getFirstName());
		}

		
	}

}
