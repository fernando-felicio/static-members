package application;

import java.util.Scanner;

import java.util.Locale;

import entities.CurrencyConverter;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Recebendo inputs do usuario
		System.out.println("What is the dollar price? ");
		CurrencyConverter.price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.qtd = sc.nextDouble();
		
		CurrencyConverter.showResult();
		
		sc.close();

	}

}
