package exercicios;

import java.util.Scanner;

public class estruturaWhile {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			int soma = 0;
			
			while ( x != 0 ) {
				soma += x;
				x = sc.nextInt();
			}
			
			System.out.println("soma é igual a " + soma);
			
			
			sc.close();
		}
}
