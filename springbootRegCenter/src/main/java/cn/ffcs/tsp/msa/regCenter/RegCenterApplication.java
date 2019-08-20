package cn.ffcs.tsp.msa.regCenter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegCenterApplication
{
  public static void main(String[] args)
  {
    new SpringApplicationBuilder(new Object[] { RegCenterApplication.class }).web(true).run(args);
  }
}