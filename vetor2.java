/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 */
package PacoteJava;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {
		int[] numero=new int [6];
		int x=0,somaPar=0,somaImpar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<6;x++)
		{
			System.out.println("\nInsira um n�mero: ");
			numero[x] = leia.nextInt();
			
			if (numero[x]%2==0)
			{
				System.out.println("\n n�mero par: "+numero[x]);
				somaPar+=numero[x];
			}
			else
			{
				System.out.println("\n n�mero �mpar: "+numero[x]);
				somaImpar+=numero[x];
				contImpar++;
			
			}
	
		}
		System.out.println("\nSoma dos n�meros pares inseridos: "+somaPar);
		System.out.println("\nSoma dos n�meros �mpares inseridos: "+somaImpar);
		System.out.println("\nQuantidade de n�meros �mpares inseridos: "+contImpar);
	}

}
