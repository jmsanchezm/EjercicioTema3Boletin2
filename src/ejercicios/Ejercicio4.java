package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos variables 
		int num ;//Se guardará el númerointroducido por el usuario.
		int factor=0;//Se guardará el número por el que se multiplicará num.
		//Creamos el Scanner
		Scanner read=new Scanner (System.in);
		//Solictamos al usuario un número
		System.out.println("Introduzca un número");
		//Ordenamos al Scanner leer el teclado
		num=read.nextInt();
		//Abrimos un do.
		do {
			//Sumamos uno a factor cada vez que pase el bucle.
			factor++;
			//Se le mostrará lo siguiente en pantalla
			System.out.println(num + " x " + factor +" = " + num*factor);
		//factor no debe pasar de 10.
		}while (factor<10);
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}
