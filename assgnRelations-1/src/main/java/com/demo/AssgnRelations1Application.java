package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.relations.Locations;
import com.demo.relations.Users;
import com.demo.repo.LocRepo;
import com.demo.repo.UserRepo;

@SpringBootApplication
public class AssgnRelations1Application implements CommandLineRunner {

	@Autowired
	private LocRepo locrepo;

	
	@Autowired
	private UserRepo urepo;

	public static void main(String[] args) {
		SpringApplication.run(AssgnRelations1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		/*
		 * Locations l1=new Locations("vskp"); Users u1=new
		 * Users("kavya","sudha",l1,"ks@gmail.com"); Users u2=new
		 * Users("gathvik","reyansh",l1,"gr@gmail.com");
		 * 
		 * Locations l2=new Locations("sklm"); Users u3=new
		 * Users("nandini","gedela",l2,"nk@gmail.com"); Users u4=new
		 * Users("kishore","pativada",l2,"kr@gmail.com");
		 * 
		 * l1.getUsers().add(u1); l1.getUsers().add(u2);
		 * 
		 * l2.getUsers().add(u3); l2.getUsers().add(u4);
		 * 
		 * 
		 * 
		 * 
		 * urepo.save(u1); urepo.save(u2); urepo.save(u3); urepo.save(u4);
		 * 
		 * 
		 * locrepo.save(l1); locrepo.save(l2);
		 * 
		 * 
		 */
	}

}
