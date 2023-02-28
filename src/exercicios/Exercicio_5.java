package exercicios;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra: ");
		String palavra = leia.next();
		
		System.out.printf("E o número de linhas e colunas: ");
		int linha = leia.nextInt();
		int coluna = leia.nextInt();
	    
	    for (int i = 0; i < 100; i++)
	    {
	    	for (int j = 0; j < 100; j++)
	    	{
	    		System.out.println(" ");	 
	    	}        
	    }
	}
}