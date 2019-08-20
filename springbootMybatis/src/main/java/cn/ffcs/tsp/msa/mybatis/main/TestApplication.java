package cn.ffcs.tsp.msa.mybatis.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
//该注解用来注入bean，@SpringBootApplication其实已经包括@EnableAutoConfiguration，但是不加@EnableAutoConfiguration会报Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan(basePackages={"cn.ffcs.tsp.msa.mybatis"})
@MapperScan("cn.ffcs.tsp.msa.mybatis.mapper")
@SpringBootApplication
public class TestApplication {
	
	 public static void main(String[] args) {	
	        SpringApplication.run(TestApplication.class, args);
	    }
}
