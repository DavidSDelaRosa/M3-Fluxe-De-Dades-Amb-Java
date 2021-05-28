public class Nivell1_fase3 {

	public static void main(String[] args) {

		
		String ciudad1 = "Zaragoza", ciudad2 = "Barcelona", ciudad3 = "Madrid", ciudad4 = "Bilbao",
				ciudad5 = "Valencia", ciudad6 = "Sevilla";

		String[] arrayCiudades = { ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6 };

		//Arrays.sort(arrayCiudades);

		for (int i = 0; i < arrayCiudades.length; i++) {
			System.out.println(arrayCiudades[i]);
		}

		String[] arrayCiudadesModificados = new String[arrayCiudades.length]; //array para almacenar las ciudades modificadas

		int contador = 0;

		for (String ciudad : arrayCiudades) {								  //recorremos el array

			System.out.println("\nCiudad a evaluar: " + ciudad);

			char[] ciudadArray = ciudad.toCharArray();						  //pasamos cada ciudad a un array de char para evaluarlo en un for:

			for (int i = 0; i < ciudad.length(); i++) {
																			  //si encontramos una vocal, la sustituimos por un 4	
				if (ciudad.charAt(i) == 'a' || ciudad.charAt(i) == 'e' || ciudad.charAt(i) == 'i'
						|| ciudad.charAt(i) == 'o' || ciudad.charAt(i) == 'u') {

					ciudadArray[i] = '4';
				}
			}

			System.out.println("Ciudad a introducir: " + String.valueOf(ciudadArray));
			arrayCiudadesModificados[contador] = String.valueOf(ciudadArray);

			contador++; //el contador es un interador, con un bucle FOR tradicional se evitaría este proceso, pero quería probar :P								
		}

		System.out.println("\nCiudades modificadas: ");

		for (String ciudadModificada : arrayCiudadesModificados) {
			System.out.println(ciudadModificada);
		}

	}

}
