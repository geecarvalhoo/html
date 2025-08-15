package primeiroProjeto;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// Resultado de dois números
	System.out.println("Informe um número: ");
	   double num1 = scanner.nextDouble();
	   double num2;
	   System.out.println("Digite um segundo número: ");
	   num2 = scanner.nextDouble();
	   double soma = num1 + num2;
       double subtracao = num1 - num2;
       double multiplicacao = num1 * num2;
       double divisao = num1 / num2;
       System.out.println("Soma: " + soma);
       System.out.println("Subtração: " + subtracao);
       System.out.println("Multiplicação: " + multiplicacao);
       System.out.println("Divisão: " + divisao);
       
       // Cálculo de temperatura
      System.out.println("\n");
		System.out.println("Informe a temperatura? ");
		  double celsius = scanner.nextDouble();
		  double fahrenheit = (celsius * 1.8) + 32;
		  System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		  System.out.println("\n");
		  
		 // Conversão de valor
System.out.println("Informe o valor em reais: ");
double reais = scanner.nextDouble();
System.out.println("Digite o valor do dólar: ");
double dolar = scanner.nextDouble();
double valorDolar = reais / dolar; 
System.out.println("O valor em dólar é:  " + valorDolar);

          // Área do retângulo
System.out.println("Digite a base do retângulo: ");
double base = scanner.nextDouble();
System.out.println("Digite a altura do retângulo: ");
double altura = scanner.nextDouble();
double area = base * altura;
System.out.println("A area do retângulo é: " + area);
System.out.println("\n");

// Conversor de idade
System.out.print("Digite sua idade em anos: ");
int idade = scanner.nextInt();
int meses = idade * 12;
System.out.println("Você já viveu aproximadamente " + meses + " meses.");

//  Conversor de minutos para segundos
System.out.print("Digite o tempo em minutos: ");
int minutos = scanner.nextInt();
int segundos = minutos * 60;
System.out.println(minutos + " minutos equivalem a " + segundos + " segundos.");

// Custo da compra
System.out.print("Digite o preço do produto: ");
double preco = scanner.nextDouble();
System.out.print("Digite a quantidade comprada: ");
int quantidade = scanner.nextInt();
double total = preco * quantidade;
System.out.printf("O custo total é R$"+ total);

//  Divisão da conta de restaurante
System.out.print("Digite o valor total da conta: ");
double valorTotal = scanner.nextDouble();
System.out.print("Digite o número de pessoas: ");
int pessoas = scanner.nextInt();
double valorPP = valorTotal / pessoas;
System.out.printf("Cada pessoa deve pagar R$" + valorPP);

// Cálculo de troco
System.out.print("Digite o valor da compra: ");
double valorCompra = scanner.nextDouble();
System.out.print("Digite o valor pago: ");
double valorPago = scanner.nextDouble();
double troco = valorPago - valorCompra;
System.out.printf("O troco é R$" + troco);

	}

}
