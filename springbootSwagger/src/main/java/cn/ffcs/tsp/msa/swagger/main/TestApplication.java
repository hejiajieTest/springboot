package cn.ffcs.tsp.msa.swagger.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
//该注解用来注入bean，@SpringBootApplication其实已经包括@EnableAutoConfiguration，但是不加@EnableAutoConfiguration会报Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
@ComponentScan(basePackages={"cn.ffcs.tsp.msa.swagger"})
@EnableFeignClients(basePackages={"cn.ffcs.tsp.msa.swagger.remote"})
@EnableDiscoveryClient
@SpringBootApplication
public class TestApplication {
	
	 public static void main(String[] args) {	
	        SpringApplication.run(TestApplication.class, args);
	    }
}
