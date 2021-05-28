import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nivell3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Scanner para pedir los datos

		List<Integer> fibonacci = new ArrayList<>(); // ArrayList para ir guardando los n�meros de la serie

		int serie, num1 = 0, num2 = 1, suma = num1 + num2; // serie -> el valor que nos de el usuario
															// num1 y num2 -> los dos n�meros por los que inicia la
															// serie de Fibonacci
															// suma -> suma de num1 y num2

		System.out.println("Introduce el m�ximo para la secuencia de Fibonacci: ");

		serie = sc.nextInt(); // se le pide el valor al usuario:

		fibonacci.add(num1); // se a�ade el primer valor, que siempre es 0

		for (int i = 1; i < serie; i++) {

			fibonacci.add(suma); // voy a�adiendo los valores obtenidos a continuaci�n

			suma = num1 + num2;

			num1 = num2; // el primer valor pasa a valer el del siguiente

			num2 = suma; // el segundo valor, al acumulado, y as� a lo largo del bucle

		}

		System.out.println(fibonacci);

		sc.close(); // Cierro el buffer

	}

}
