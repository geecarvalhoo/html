package primeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		/* >= maior ou igual           <= menor ou igual
		 * > maior                     < menor	 
		 * == igual                    != diferente */
 int idade = 18; 
 if(idade >= 18) {
	 System.out.println("Você é maior de idade");
 } else {
	 System.out.println("Você é menor de idade");
	 
	 Scanner scanner = new Scanner(System.in);
	 
	 // Verificação de desconto 
	 System.out.println("Quanto você pagou? ");
	 double valor = scanner.nextDouble();
	 if(valor >= 200) {
		 System.out.println("Você ganhou desconto");
	 } else {
		 System.out.println("Você não ganhou desconto");
		 //-----------------------------------//
		 String continuar;
		 System.out.println("Deseja continuar? ");
		 continuar = scanner.next();
				 if(continuar =="sim") {
		 System.out.println("Você escolher continuar");
				 } else {
					 System.out.println("Você escolher sair");
					
					 * Aplicação de desconto: Peça o valor da compra para o usuário se o valor for maior ou igual a 200. o usuário recebe um desconto de 15%, senão não tem desconto. Mostro se ele teve algum desconto e quanto deve pagar*
					 
					 double ValorCompra;
							 double desconto = 0; 
							 System.out.println("Qual o valor da compra? "); 
							 valor = scanner.nextDouble()
									 if
							 
							 
							 
		 
	 }
 }
 
 }
	}
	
}
