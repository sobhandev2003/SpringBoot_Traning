package com.sobhan.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.sobhan.bean.Category;
import com.sobhan.bean.Customer;
import com.sobhan.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(SpringConfig.class);
		Customer cst=(Customer)ac.getBean("cs");
		System.out.println(cst);
//		Category ct=(Category)ac.getBean("cgs");
//		System.out.println(ct);
		ac.close();
		}

}
