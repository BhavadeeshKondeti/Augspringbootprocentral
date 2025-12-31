package com.excelr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringbootappaug8to11amApplication {

	public static void main(String[] args) {
		
		//IOC STARTS
	ApplicationContext	con=SpringApplication.run(FirstSpringbootappaug8to11amApplication.class, args);
	
	//getBean() for Car
	Car c1=con.getBean("carDataMtd",Car.class);
	System.out.println(c1);
	
	
	System.out.println("Happy new year");
<<<<<<< Updated upstream
			System.out.println("Thanks and same to you");

		System.out.println("what is your plan??");
=======
	System.out.println("Thanks and same to you");
			
	System.out.println("Going to home town....");
>>>>>>> Stashed changes
	}

}
