package com.upc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka7001 {
	public static void main(String[] args) {
		SpringApplication.run(Eureka7001.class, args);
	}
	
	public void test1() {
		System.out.println("这是第一次修改");
	}
	public void test2() {
		System.out.println("master的第二次修改");
	}
	
	public void test3() {
		System.out.println("这是temp的第一次修改");
	}
}
