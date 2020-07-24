package com.example.pattern.strategy;

import com.example.pattern.strategy.service.Context;
import com.example.pattern.strategy.service.OperationAdd;
import com.example.pattern.strategy.service.OperationMultiply;
import com.example.pattern.strategy.service.OperationSubstract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyApplication.class, args);

		Context addContext = new Context(new OperationAdd());
		System.out.println("10 + 5 = " +addContext.executeStrategy(10, 5));

		Context subContext = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " +subContext.executeStrategy(10, 5));

		Context multContext = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " +multContext.executeStrategy(10, 5));
	}



}
