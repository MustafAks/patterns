package com.example.pattern.singleton;

import com.example.pattern.singleton.service.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton Exp 1 ===> " + singleton1);
        System.out.println("Singleton Exp 2 ===> " + singleton2);

	}

}
