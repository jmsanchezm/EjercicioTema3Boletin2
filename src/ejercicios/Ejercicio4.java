package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num ;
		int factor=0;
		int result=0;
		Scanner read=new Scanner (System.in);
		System.out.println("Introduzca un número");
		num=read.nextInt();
		do {
			factor++;
			result=num*factor;
			System.out.println(num + " x " + factor +" = " +result);
		}while (factor<10);
		read.close();
	}

}
