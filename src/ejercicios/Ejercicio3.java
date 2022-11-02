package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num;
		int numAnt=0;
		int suma=0;
		Scanner read= new Scanner(System.in);
		System.out.print("Introduzca un número, del cual se le suamrá todos sus números anteriores:");
		num=read.nextInt();
		do {
			numAnt++;
			suma+=numAnt;
			
		}while (numAnt< num);
		System.out.println("El resultado es " +suma);
	}

}
