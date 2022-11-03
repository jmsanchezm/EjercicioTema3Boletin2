package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos variable
		int num=0;//Inicializamos la variable a 0.
		//Abrimos un do.
		do {
			//Quiero que me mustre por pantalla el siguiente mensaje.
			System.out.println("Número " + num);
			//Cada vez que pase, se le irá sumando 2 a num
			num=num+2;
		//El buble parará una vez llegue a 200.
		}while(num<=200);

	}

}
