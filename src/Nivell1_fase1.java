import java.util.Scanner;

public class Nivell1_fase1 {

	public static void main(String[] args) {
		
		 String ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6;
		 
		 Scanner sc = new Scanner(System.in);
		  
		 System.out.println("Introduce el valor de la primera ciudad: "); ciudad1 =
		 sc.nextLine();
		 
		 System.out.println("Introduce el valor de la segunda ciudad: "); ciudad2 =
		 sc.nextLine();
		 
		 System.out.println("Introduce el valor de la tercera ciudad: "); ciudad3 =
		 sc.nextLine();
		  
		 System.out.println("Introduce el valor de la cuarta ciudad: "); ciudad4 =
		 sc.nextLine();
		  
		 System.out.println("Introduce el valor de la quinta ciudad: "); ciudad5 =
		 sc.nextLine();
		  
		 System.out.println("Introduce el valor de la sexta ciudad: "); ciudad6 =
		 sc.nextLine();
		  
		 System.out.println("Las ciudades introducidas son: " + ciudad1 + ", " +
		 ciudad2 + ", " + ciudad3 + ", " + ciudad4 + ", " + ciudad5 + " y " +
		 ciudad6);

		 sc.close();
	}

}
