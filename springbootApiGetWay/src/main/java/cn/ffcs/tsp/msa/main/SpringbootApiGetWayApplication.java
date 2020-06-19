package cn.ffcs.tsp.msa.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
@SpringBootApplication
public class SpringbootApiGetWayApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(new Object[] { SpringbootApiGetWayApplication.class }).web(true).run(args);
    }
}
