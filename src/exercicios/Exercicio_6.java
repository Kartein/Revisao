package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i, aux;
		
		try {
		
		do {
			
			System.out.println("\t----- MENU -----");	
			System.out.println("Escolha qual exercício deseja resolver: ");
			System.out.println("Exercício 1. (Diga Olá!)");
			System.out.println("Exercício 2. (Repetindo a frase))");
			System.out.println("Exercício 3. (Repetindo a frase v2)");
			System.out.println("Exercício 4. (Geometria)");
			System.out.println("Exercício 5. (Bidimensional)");
			System.out.println("Digite 0 para encerrar o programa.");
			aux = leia.nextInt();

		switch(aux){
		
		case 1:	
			
			System.out.println("Informe o nome do usuário: ");
			leia.nextLine();
			String nome = leia.nextLine();
			
			System.out.println("Olá, " + nome);
			
			System.out.println("Digite 1 para voltar ao menu ou digite 0 para encerrar o programa");
			aux = leia.nextInt();
			
			System.out.println("");

					
		break;
					
		case 2: 
					
			System.out.println("Escreva uma frase: ");
			leia.nextLine();
			String frase = leia.nextLine();
			
			System.out.println("E o número de vezes que deseja repeti-la: ");
			int numero = leia.nextInt();
		    
		    for (i = 0; i < numero; i = i+1)
		    {
		        System.out.println(frase + " " + i);	        
		    }
		    
		    System.out.println("Digite 1 para voltar ao menu ou digite 0 para encerrar o programa");
			aux = leia.nextInt();
		    
		    System.out.println("");
		
		break;
				
		case 3:

			System.out.println("Escreva uma frase: ");
			leia.nextLine();
			String frase1 = leia.nextLine();
			
			System.out.println("");
			
			
			System.out.println("E o número de vezes que deseja repeti-la: ");
			int numero1 = leia.nextInt();
		    
		    for (i = 0; i < numero1; i = i+1)
		    {
		        System.out.println(i + " " + frase1);	        
		    }
		    
		    System.out.println("Digite 1 para voltar ao menu ou digite 0 para encerrar o programa");
			aux = leia.nextInt();
		    
		    System.out.println("");
					
		break;
				
		case 4: 
					
			int A, B, P; 
			
			System.out.printf("Informe a altura e a base de um retângulo: ");
			leia.nextLine();
			int B1 = leia.nextInt();
			int A1 = leia.nextInt();
			
			P =(2*A1)+(2*B1);
			
			System.out.println("O perímetro do retângula é: " + P);
			
			System.out.println("Digite 1 para voltar ao menu ou digite 0 para encerrar o programa");
			aux = leia.nextInt();
				
			System.out.println("");
			
		break;
		
		case 5:
			
			
			
			System.out.println("Digite 1 para voltar ao menu ou digite 0 para encerrar o programa");
			aux = leia.nextInt();
			
			System.out.println("");
			
		break;	
		}
		}while(aux != 0);
			System.out.println("O sistema foi encerrado");
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Algo de errado não está certo");
		}
	}
}