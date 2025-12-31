package com.excelr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Car carDataMtd()
	{
		Car c1=new Car();
		c1.setCarPrice(400000);
		c1.setCarName("Defender");
		return c1;
	}
}
