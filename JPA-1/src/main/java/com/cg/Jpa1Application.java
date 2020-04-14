package com.cg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.IProductDao;
import com.cg.entity.Product;

@SpringBootApplication
public class Jpa1Application{
	
	public static void main(String[] args) {
		SpringApplication.run(Jpa1Application.class, args);
	}

//	@Autowired
//	IProductDao prodao;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		Product s1 = new Product(1001,"iphone","50000.0");
//		Product s2 = new Product(2007,"laptop","200000.0");
//		Product s3 = new Product(3002,"samsung galaxy","60000.0");
//		Product s4 = new Product(4992,"redmi","87383.0");
//		Product s5 = new Product(6003,"ipad","117383.0");
//		prodao.create(s1);
//		prodao.create(s2);
//		prodao.create(s3);
//		prodao.create(s4);
//		prodao.create(s5);
//		System.out.println("record inserted");
//		
//	}

}
	

