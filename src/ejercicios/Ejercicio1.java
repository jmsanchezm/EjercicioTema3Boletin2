package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaramos variables.
		int num=1;//Se guardará un número
		//Abrimos un do
		do {
			//Debe mostrar en pantalla el siguiente mensaje.
			System.out.println("Número "+ num);
			//Por cada vez que pase, se le irá sumando 1 a num
			num++;
		//Una vez llegue a 20, el programa se detendrá
		}while(num<=20);

	}

}
