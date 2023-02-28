package exercicios;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int A, B, P; 
		
		System.out.printf("Informe a altura e a base de um retângulo: ");
		int B1 = leia.nextInt();
		int A1 = leia.nextInt();
		
		P =(2*A1)+(2*B1);
		
		System.out.println("O perímetro do retângula é: " + P);
	}
}