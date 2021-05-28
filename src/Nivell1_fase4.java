
public class Nivell1_fase4 {

	public static void main(String[] args) {

		String ciudad1 = "Zaragoza", ciudad2 = "Barcelona", ciudad3 = "Madrid", ciudad4 = "Bilbao",
				ciudad5 = "Valencia", ciudad6 = "Sevilla";

		//array de caracteres por cada ciuadad
		char[] ciudad1Array = new char[ciudad1.length()];
		char[] ciudad2Array = new char[ciudad2.length()];
		char[] ciudad3Array = new char[ciudad3.length()];
		char[] ciudad4Array = new char[ciudad4.length()];
		char[] ciudad5Array = new char[ciudad5.length()];
		char[] ciudad6Array = new char[ciudad6.length()];

		//uso los métodos estáticos descritos después del Main:
		copiarArray(ciudad1Array, ciudad1);
		copiarArray(ciudad2Array, ciudad2);
		copiarArray(ciudad3Array, ciudad3);
		copiarArray(ciudad4Array, ciudad4);
		copiarArray(ciudad5Array, ciudad5);
		copiarArray(ciudad6Array, ciudad6);
		
		
		System.out.println("Ciudades con los nombres invertidos: ");
		
		System.out.print(ciudad1 + " - ");
		imprimirInvertido(ciudad1Array);
		
		System.out.print("\n" + ciudad2 + " - ");
		imprimirInvertido(ciudad2Array);
		
		System.out.print("\n" + ciudad4 + " - ");
		imprimirInvertido(ciudad3Array);
		
		System.out.print("\n" + ciudad5 + " - ");
		imprimirInvertido(ciudad4Array);
		
		System.out.print("\n" + ciudad5 + " - ");
		imprimirInvertido(ciudad5Array);
		
		System.out.print("\n" + ciudad6 + " - ");
		imprimirInvertido(ciudad6Array);
		

	}

	//método estático para pasar de String ciudad a char[]
	public static void copiarArray(char[] arrayCiudadFinal, String ciudadInicial) {

		for (int i = 0; i < arrayCiudadFinal.length; i++) {
			arrayCiudadFinal[i] = ciudadInicial.charAt(i);
		}
	}

	//método estático para imprimir el array recibido
	public static void imprimirInvertido(char[] arrayCiudad) {

		for (int i = arrayCiudad.length - 1; i >= 0; i--) {
			System.out.print(arrayCiudad[i]);
		}

	}
}
