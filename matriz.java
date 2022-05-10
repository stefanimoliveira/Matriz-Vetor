/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
 */
package PacoteJava;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		int i,j,cont=0;
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{ for (j=0;j<3;j++)
			{
				System.out.printf("\nDigite o elemento matriz[%d][%d]: ",i+1,j+1);
				matriz[i][j] = leia.nextInt();
				if (matriz[i][j]>10)
				{
					cont++;
				}
			}
		}
			System.out.println("\nNúmero de valores maiores que 10: "+cont);
		
		}

}
