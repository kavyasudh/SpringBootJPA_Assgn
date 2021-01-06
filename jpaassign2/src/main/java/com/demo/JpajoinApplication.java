package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Course;
import com.demo.entities.Customer;
import com.demo.entities.Product;
import com.demo.entities.Review;
import com.demo.entities.Student;
import com.demo.repos.CourseRepo;
import com.demo.repos.CustomerRepo;
import com.demo.repos.ProductRepo;
import com.demo.repos.ReviewRepo;
import com.demo.repos.StudentRepo;
@SpringBootApplication
public class JpajoinApplication implements CommandLineRunner{

	@Autowired
	private CustomerRepo custRepo;
	
	@Autowired
	private ProductRepo prodRepo;
	
	
	  @Autowired private ReviewRepo reRepo;
	  
	  @Autowired private CourseRepo cRepo;
	  
	  @Autowired private StudentRepo sRepo;
	 
	public static void main(String[] args) {
		SpringApplication.run(JpajoinApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product p1=new Product("Mobile");
		Product p2=new Product("Clothes");
		Product p3=new Product("Computers");
		
		Product p4=new Product("Laptop");
		Product p5=new Product("Car");
		Product p6=new Product("House");
		
		
		
		Customer cust1=new Customer("gathvik");
		Customer cust2=new Customer("reyansh");
		
		
		List<Product> customer1=new ArrayList<>();
		customer1.add(p1);
		customer1.add(p2);
		customer1.add(p3);
		
		List<Product> customer2=new ArrayList<>();
		customer2.add(p4);
		customer2.add(p5);
		customer2.add(p6);
		
	cust1.setProducts(customer1);
	cust2.setProducts(customer2);	
	custRepo.save(cust1);
	custRepo.save(cust2);
	
	
	prodRepo.save(p3);
	
	
	  Review r1=new Review("Good product"); Review r2=new
	  Review("value for the money"); Review r3=new Review("long lasting battery");
	  
	 
prodRepo.save(p1);
prodRepo.save(p2);


  List<Review> prod1=new ArrayList<>(); prod1.add(r1); prod1.add(r2);
  prod1.add(r3);
 

  List<Review> prod2=new ArrayList<>(); prod2.add(r1); prod2.add(r2);
 

  p1.setReview(prod1); p2.setReview(prod2);
 
prodRepo.save(p1);
prodRepo.save(p2);



  reRepo.save(r1); reRepo.save(r2); reRepo.save(r3);
 


  Student s1=new Student("kavya"); Student s2=new Student("sudha");
  
  Course c1=new Course("Java"); Course c2=new Course("Python");
  
  List<Course> stud1=new ArrayList<>(); stud1.add(c1); stud1.add(c2);
  
  List<Course> stud2=new ArrayList<>(); stud2.add(c1); stud2.add(c2);
  
  s1.setCourse(stud1); s2.setCourse(stud2);
  
  List<Student> course1=new ArrayList<>(); course1.add(s1); course1.add(s2);
  
  List<Student> course2=new ArrayList<>(); course2.add(s1); course2.add(s2);
  
  c1.setStud(course1); c2.setStud(course2);
  
  
  cRepo.save(c1); cRepo.save(c2);
  
  sRepo.save(s1); sRepo.save(s2);
  
  
  
 
		
	}
	

}
