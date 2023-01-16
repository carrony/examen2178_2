package examen;

public class Examen {

	public static void mostrar_imcs(double matriz[][]) {
		for (int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.printf("%.2f\t", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public static double media_paciente(double matriz[][], int paciente) {
		double suma=0;
		
		if (paciente<0 || paciente >= matriz.length) {
			return -1;
		}
//		for (int i=0;i<matriz.length;i++) {
//			if (i==paciente) {
//				for (int j=0;j<matriz[0].length;j++) {
//					suma=suma+matriz[i][j];
//				}
//			}
//			
//		}
		for (int i=0;i<matriz[0].length;i++) {
			suma=suma+matriz[paciente][i];
		}
		return suma/matriz[0].length;
	}
	
	
}
