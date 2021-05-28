import java.util.Arrays;
import java.util.Scanner;

public class Nivell1_fase2 {

	public static void main(String[] args) {

		//datos de la fase anterior:
		
		String ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor de la primera ciudad: ");
		ciudad1 = sc.nextLine();

		System.out.println("Introduce el valor de la segunda ciudad: ");
		ciudad2 = sc.nextLine();

		System.out.println("Introduce el valor de la tercera ciudad: ");
		ciudad3 = sc.nextLine();

		System.out.println("Introduce el valor de la cuarta ciudad: ");
		ciudad4 = sc.nextLine();

		System.out.println("Introduce el valor de la quinta ciudad: ");
		ciudad5 = sc.nextLine();

		System.out.println("Introduce el valor de la sexta ciudad: ");
		ciudad6 = sc.nextLine();

		System.out.println("Las ciudades introducidas son: " + ciudad1 + ", " + ciudad2 + ", " + ciudad3 + ", "
				+ ciudad4 + ", " + ciudad5 + " y " + ciudad6);

		//Introduzco las ciudades en un array de String:
		
		String[] arrayCiudades = { ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6 };

		//Los ordeno alfabéticamente:
		Arrays.sort(arrayCiudades); 

		for (int i = 0; i < arrayCiudades.length; i++) {
			System.out.println(arrayCiudades[i]);
		}

		sc.close();
	}

}
