package cn.ffcs.tsp.msa.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class SpringbootConfigApplication 
{
    public static void main( String[] args )
    {
    	new SpringApplicationBuilder(new Object[] { SpringbootConfigApplication.class }).web(true).run(args);
    }
}
