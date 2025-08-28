import java.util.Scanner;

public class operadoresLogicos2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); // java.util 

	System.out.println("Qual sua idade? ");
	int idade = scanner.nextInt();
	System.out.println("Tem título de eleitor? ");
	String resposta = scanner.next();
	
	if(idade >= 16 && resposta.equalsIgnoreCase("SIM")) {
	System.out.println("Pode votar");
	} else {
		System.out.println("Não pode votar");
	}
	int numero;
	System.out.println("Informe um número: ");
	numero = scanner.nextInt();
	
	if(numero >= 10 || numero <= 20) {
		System.out.println("O número está entre 10 e 20");
	} else { 
		System.out.println("O número está fora");
	}
	// Compra maior que 200
	System.out.println("Qual o valor da compra? ");
	double valor = scanner.nextDouble();
	System.out.println("é cliente VIP? ");
	boolean vip = scanner.nextBoolean();
	if(valor > 200 && vip == true) { //false 
		double desconto = valor * 0.15;
		double valorFinal = valor - desconto;
		System.out.printf("Vai pagar: %.2f", valorFinal);
	} else {
		System.out.println("Não tem desconto ");
	}
	/* Para participar de um workshop precisa ter idade entre 20 e 40 anos e 
	 * possuir experiência. Se as informações forem a verdadeiras exiba "inscrição aceita", senão "inscrição rejeitada*/
	
	System.out.println("Qual sua idade? ");
	int idade2 = scanner.nextInt();
	System.out.println("Você tem experiência? ");
	String workshop = scanner.next();
	if (idade2 >= 20 && idade2 <= 40 && workshop.equalsIgnoreCase("Sim")) {
		System.out.println("Incrição Aceita");
	} else {
		System.out.println("Inscrião Rejeitada");
	}
	
	
	
	
	}
	
} 

	