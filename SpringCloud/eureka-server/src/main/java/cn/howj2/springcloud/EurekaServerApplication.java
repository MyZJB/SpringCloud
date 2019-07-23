package cn.howj2.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	
	public static void main(String[] args) {
		//SpringApplication.run(EurekaServerApplication.class, args);
		
		new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port="+8761).run(args);
	}

}
