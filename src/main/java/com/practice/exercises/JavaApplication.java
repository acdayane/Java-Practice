package com.practice.exercises;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);		
      
		whatIsThisNumber();
		fibonacci();
		multiplication();
		pyramid();
		checkArray();

		Holidayzer holidayzer = new Holidayzer();
		holidayzer.getHoliday("12-02-2024");

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
				num2 = 1;
			} 
			else {
				num2 = num1;
				num1 = sum;
			}
		}
		System.out.println("");
	}

	public static void multiplication() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você quer ver a tabuada de que número? ");        
        Integer num = scanner.nextInt();

		System.out.println("Tabela de multiplicação do " + num);

		for (int i=0; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}

	public static void pyramid() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantas linhas você quer na pirâmide de números? ");
		Integer num = scanner.nextInt();

		for (int i=1; i<=num; i++) {
			System.out.println("");
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
		}
		System.out.println("");
	}

	public static void checkArray() {
		String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
		String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

		System.out.println("Quais são as frutas presentes nos dois arrays?");

		for (int i=0; i<array1.length; i++) {
			for (int j=0; j<array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}

}
