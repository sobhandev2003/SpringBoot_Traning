package com.sobhan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB"); //reading the jdbc configuration
		
		EntityManager em=emf.createEntityManager();//Insert ,update,delete operation;
		EntityTransaction tx = null;
		tx=em.getTransaction();//Connection Establish
		tx.begin(); //transaction initiate
		
////		Customer cs1=new Customer("C2", "Anup", "222222");// create a Customer class object
//		Employee emp1=new Employee();
//		Employee emp2=new Employee();
//		emp1.setEname("Sobhan");
//		emp1.setEdedsig("Maneger");
//		emp1.setEmail("rj@email.com");
//		emp1.setJoindate(new Date());
//		emp1.setWorkhr(new Date());
//		
//		emp2.setEname("Dev");
//		emp2.setEdedsig("Student");
//		emp2.setEmail("sobahn@email.com");
//		emp2.setJoindate(new Date());
//		emp2.setWorkhr(new Date());
		
//		Teacher t1=new Teacher("t1","Krishna");
//		Teacher t2=new Teacher("t2","Shiva");
//		
//		Student st1=new Student();
//		Student st2=new Student();
//		
//		
//		st1.setSname("dev");
//		st1.setTrs(t1);
//		
//		st2.setSname("Sobhan");
//		st2.setTrs(t2);
//		
//		em.persist(t1); //table created an data inserted
//		em.persist(t2);
//		
//		em.persist(st1);//table created an data inserted
//		em.persist(st2);
		
//		Candidate c1=new Candidate("c1","Sobahn");
//		Candidate c2=new Candidate("c2","Dev");
//
//		
//		Adhar ad1=new Adhar("123456","Magra",c1);
//		Adhar ad2=new Adhar("123987","Nandanpur",c2);
//		em.persist(c1);
//		em.persist(c2);
//		em.persist(ad1);
//		em.persist(ad2);
		
		System.out.println("Curd oparetin");
		
//		System.out.println("Insert data in to the database_____________");
		
//		Product pdt1=new Product("p1","Phone",1,50000.0);
//		Product pdt2=new Product("p2","Laptop",2,90000.0);
//		Product pdt3=new Product("p3","bag",5,5000.0);
//		Product pdt4=new Product("p4","Pen",100,500.0);
//		Product pdt5=new Product("p5","TV",1,5000.0);
//		Product pdt6=new Product("p6","Tab",3,30000.0);
//
//		
//		em.persist(pdt1);
//		em.persist(pdt2);
//		em.persist(pdt3);
//		em.persist(pdt4);
//		em.persist(pdt5);
//		em.persist(pdt6);
		
//		System.out.println("Fetch data========================================================================================================");
//		System.out.println();
//		String hql="from Product";
//		Query query=em.createQuery(hql);
//		List<Product> pList=query.getResultList();
//		pList.stream().forEach(System.out::println);
//		
//		System.out.println();
//		
////		System.out.println("Delete data=======================================================================================================");
////		System.out.println();
////		Product pds=em.find(Product.class, "p6");//Find p6 available or not
////		if(pds!=null) {
////			em.remove(pds);
////		}
//		
//		System.out.println("Update data=======================================================================================================");
//		System.out.println();
//		Product pds1=em.find(Product.class, "p5");//Find p6 available or not
//		if(pds1!=null) {
//			pds1.setPname("Coffe");
//			pds1.setPqty(200);
//			pds1.setPrice(2000.0);
//			em.persist(pds1);
//		}
//		
//		System.out.println();
//		System.out.println("Fetch data========================================================================================================");
//		System.out.println();
////		String hql="from Product";
////		Query query=em.createQuery(hql);
//		List<Product> newList=query.getResultList();
//		newList.stream().forEach(System.out::println);
		
//		===============================================================================================================================================
		
		System.out.println("INSER ITEM =========================================");
		System.out.println();
		
		Item it1=new Item();
		Item it2=new Item();
		Item it3=new Item();
		Item it4=new Item();
		Item it5=new Item();
		
		it1.setIname(" Mibile");
		it1.setIqty(5);
		it1.setOrderDT(new Date());
		
		it2.setIname("Laptop");
		it2.setIqty(1);
		it2.setOrderDT(new Date());
		
		it3.setIname("Tab");
		it3.setIqty(2);
		it3.setOrderDT(new Date());
		
		it4.setIname("TV");
		it4.setIqty(3);
		it4.setOrderDT(new Date());
		
		it5.setIname("AC");
		it5.setIqty(1);
		it5.setOrderDT(new Date());
		
		em.persist(it1);
		em.persist(it2);
		em.persist(it3);
		em.persist(it4);
		em.persist(it5);
//		tx.commit();//save 
		System.out.println();
		System.out.println();
		System.out.println("Fetch data========================================================================================================");
		System.out.println();
		
		String hql="from Item";
		Query query=em.createQuery(hql);
		List<Item> iList=query.getResultList();
		iList.stream().forEach(System.out::println);
		
		System.out.println();
		System.out.println();
		System.out.println("Delete data=======================================================================================================");
	System.out.println();
	Item it=em.find(Item.class,3);//Find p6 available or not
	if(it!=null) {
		em.remove(it);
				}
	
	System.out.println();
	System.out.println();
	System.out.println("Fetch data========================================================================================================");
	List<Item> iList1=query.getResultList();
	iList1.stream().forEach(System.out::println);
	
	Item item1=em.find(Item.class,4);//Find p6 available or not
	if(item1!=null) {
		item1.setIname("FRIDGE");
		item1.setIqty(5);
		em.persist(item1);
	}
		
	System.out.println("Fetch data========================================================================================================");
	List<Item> iList2=query.getResultList();
	iList2.stream().forEach(System.out::println);
		
	tx.commit();//save 
		
	emf.close();
		
		
	}

}
