package srl.neotech.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "srl.neotech")
public class SpringBootTomcatApplication  extends SpringBootServletInitializer{
	  
	public static void main(String[] args) {

        SpringApplication.run(SpringBootTomcatApplication.class, args);
 
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	
    	
    	
        return builder.sources(SpringBootTomcatApplication.class);
    }
    
   
}
