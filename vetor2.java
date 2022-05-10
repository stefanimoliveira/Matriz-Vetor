/*Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

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
			System.out.println("\nInsira um número: ");
			numero[x] = leia.nextInt();
			
			if (numero[x]%2==0)
			{
				System.out.println("\n número par: "+numero[x]);
				somaPar+=numero[x];
			}
			else
			{
				System.out.println("\n número ímpar: "+numero[x]);
				somaImpar+=numero[x];
				contImpar++;
			
			}
	
		}
		System.out.println("\nSoma dos números pares inseridos: "+somaPar);
		System.out.println("\nSoma dos números ímpares inseridos: "+somaImpar);
		System.out.println("\nQuantidade de números ímpares inseridos: "+contImpar);
	}

}
