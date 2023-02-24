package exercicios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			
			System.out.println("Informe o nome do usuário: ");
			String nome = leia.nextLine();
			
			System.out.println("Olá," + nome);
		}
	}
}