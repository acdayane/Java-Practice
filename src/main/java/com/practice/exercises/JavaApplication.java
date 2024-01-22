package com.practice.exercises;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);		
      
		//whatIsThisNumber();
		fibonacci();

	}

	private static void whatIsThisNumber() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro para saber o que ele é: ");        
        Integer num = scanner.nextInt();

		if (num%2 == 0 && num<0) {
			System.out.println(num + " é par e negativo");
		}
		if (num%2 == 0 && num>=0) {
			System.out.println(num + " é par e positivo");
		}
		if (num%2 != 0 && num<0) {
			System.out.println(num + " é ímpar e negativo");
		}
		if (num%2 != 0 && num>=0) {
			System.out.println(num + " é ímpar e positivo");
		}
	}

	private static void fibonacci() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro para ver sequência de Fibonacci: ");        
        Integer size = scanner.nextInt();
		Integer num1 = 0;
		Integer num2 = 0;
		Integer sum = 0;

		for (int i=1; i<=size; i++) {
			sum = num1 + num2;
			System.out.print(sum + " ");

			if (sum == 0) {
				num1 = 1;
			} 
			else {
				// num2 = num1;
				// num1 = sum;
				num1 = num2;
				num2 = sum;
			}
		}
	}
}
