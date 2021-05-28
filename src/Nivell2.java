import java.util.Scanner;

public class Nivell2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] evaluacion = new int[5][3];
		
		for(int i=0;i<5;i++) {					//bucle FOR para los ALUMNOS
			for(int j=0;j<3;j++) {				//bucle FOR para las NOTAS de cada alumno	
				System.out.println("Introduce la nota " + (j+1) + " para el alumno nº: " + (i+1));
				
				int nota = sc.nextInt();
				
				while(nota>10 || nota<0) {		//while para controlar que sólo entren valores del 0 al 10
					System.err.println("¡¡El valor de la nota debe estar comprendido entre 0 y 10!! Introduce un valor correcto: ");
					nota = sc.nextInt();
				}
				
				evaluacion[i][j]= nota;			//una vez validados los datos de entrada, se asignan a cada posición del array bidimensional
			}
			if(i<4) {
				System.out.println("\n ===========Evaluación del siguiente alumno===========");
			}else {
				System.out.println("\nEVALUACIÓN TERMINADA");
			}
		}
		
		for(int i=0;i<5;i++){
			
			double sumatorio=0;						//variable para almacenar el sumatorio de notas
			
			for(int j=0;j<3;j++) {
				
				sumatorio+=evaluacion[i][j];		//actualización del sumatorio de notas
				
			}
			
			if((sumatorio/3)<5) {					//si el sumatorio dividido entre las 3 notas es inferior a 5, el alumno estará suspendido	
				System.out.println("El alumno " + (i+1) + " ha suspendido con un: " + (sumatorio/3));
			}else {
				System.out.println("El alumno " + (i+1) + " ha aprobado con un: " + (sumatorio/3));
			}
			System.out.print("\n");
		}
		
		sc.close();

	}

}
