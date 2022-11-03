package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos variables
		int num;//Se guardará el número introducido por el usuario
		int numAnt=0;//Se guardará los números anteriores al del usuario.
		int suma=0;//Se guardará la suma de todos los números anteriores y del número introducido.
		//Creamos el Scanner
		Scanner read= new Scanner(System.in);
		//Solicitamos al usuario un número.
		System.out.print("Introduzca un número, del cual se le suamrá todos sus números anteriores:");
		//Ordenamos al Scanner leer el teclado.
		num=read.nextInt();
		//Abrimos un do.
		do {
			//Por cada vez que pase, se le sumará 1 a numAnt, para conseguir todos los números anteriores al dado.
			numAnt++;
			//Además, se irán sumando entre ellos.
			suma+=numAnt;
		//Ponemos la condición de que numANT no debe pasar a num
		}while (numAnt< num);
		//Como resultado, se le mostrará en pantalla la suma de todos los números
		System.out.println("El resultado es " +suma);
		//Finalmente, cerramos el Scanner
		read.close();
	}

}
