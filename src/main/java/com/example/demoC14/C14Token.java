package com.example.demoC14;

import com.example.demoC14.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class C14Token {

	public static void main(String[] args) {
		SpringApplication.run(C14Token.class, args);
	}
	@Bean
	public FilterRegistrationBean filterBeand()
	{
		FilterRegistrationBean filterreg = new FilterRegistrationBean();
		filterreg.setFilter(new JwtFilter());
		filterreg.addUrlPatterns("/userdata/users");
		return filterreg;
	}

}
