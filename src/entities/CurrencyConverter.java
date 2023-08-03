package entities;

public class CurrencyConverter {
	
	//Declarando os atributos da classe
	
	public static double price;
	public static double qtd;
	
	
	//Criando metodo de conversão
	public static double toConversion() {
		double totalConversion = (price * qtd) + (price * qtd * 0.06);
		return totalConversion;
	}
	
	//Criando metodo de retorno das informações
	public static void showResult() {
		System.out.printf("Amount to be paid in reais = R$%.2f%n", toConversion());
	}

}
