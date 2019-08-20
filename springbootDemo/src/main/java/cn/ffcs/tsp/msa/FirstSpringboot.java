package cn.ffcs.tsp.msa;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/firstSpringboot")
public class FirstSpringboot {
	  @RequestMapping("/home")
	    String home() {
	        return "Hello World!";
	    }

	    @RequestMapping("/now")
	    String hehe() {
	        return "现在时间：" + (new Date()).toLocaleString();
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(FirstSpringboot.class, args);
	    }
}
