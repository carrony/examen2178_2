package examen;

import java.util.Scanner;

public class Ej2_apellidos_nombre {

	
	
	public static void main(String[] args) {
		
		double imcs_pacientes [][] = {
			    {15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},
			    {38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},
			    {33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},
			    {32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}
			};
		
		System.out.println("Program de calculo de la media de un "
				+ "paciente concreto");
		System.out.println("La mtriz de datos de los pacientes es:");
		Examen.mostrar_imcs(imcs_pacientes);
		
		Scanner teclado = new Scanner(System.in);
		int paciente=0;
		do {
			System.out.printf("Introduce el número de paciente a calcular "
					+ "(0 a %d):",imcs_pacientes.length);
			paciente = teclado.nextInt();
		} while (paciente <0 || paciente >= imcs_pacientes.length);
		
		System.out.printf("EL IMC medio anual del paciente %d es %.2f\n",
				paciente, Examen.media_paciente(imcs_pacientes, paciente)
				);
		
		
		
		
		
		
		
	}

}
