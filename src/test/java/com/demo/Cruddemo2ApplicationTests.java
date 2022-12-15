package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Registration;
import com.demo.repositories.RegistrationRepository;

@SpringBootTest
class Cruddemo2ApplicationTests {
      @Autowired
	private RegistrationRepository registrationRepo;
	@Test
	void saveOneRegistration() {
		
		Registration r=new Registration();
		
		r.setName("Pushpak");
		r.setCity("Mauda");
		r.setCollege_name("DBACER");
		
		registrationRepo.save(r);
	}
	@Test
	public void deleteOneRegistration() {
		
		registrationRepo.deleteById(7);
	}
     @Test
	public void getOneRegistration() {
    	 Optional<Registration> findById = registrationRepo.findById(1);
    	 Registration r = findById.get();
    	System.out.println(r.getRoll_no()); 
    	 System.out.println(r.getName());
    	System.out.println(r.getCity()); 
    	 System.out.println(r.getCollege_name());
    	
	}
     
     @Test
     public void updateOneRegistration() {
    	 Registration r=new Registration();
 		r.setRoll_no(6);;
 		r.setName("Manoj");
 		r.setCity("Gondia");
 		r.setCollege_name("YCCE");
 		registrationRepo.save(r);
     }
}
