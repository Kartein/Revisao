package exercicios;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva uma frase: ");
		String frase = leia.nextLine();
		
		System.out.println("E o número de vezes que deseja repeti-la: ");
		int numero = leia.nextInt();
	    
	    for (int i = 0; i < numero; i = i+1)
	    {
	        System.out.println(i + " " + frase);	        
	    }
	}
}