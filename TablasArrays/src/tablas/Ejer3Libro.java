package tablas;

import java.util.Scanner;

public class Ejer3Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("introduce el tamaño de la tabla.");
		
		int numero=0;
		int n=in.nextInt();
		int contadorCeros=0, mediaPos=0, mediaNe=0, media=0, med=0;
		
		System.out.println("Ahora introduce números para rellenar la tabla.");
		
		int tabla[]= new int[n];
		
		for(int i =0; i<n; i++) {
			
			System.out.println("Introduce número:");
			
			numero=in.nextInt();
			tabla[i]= numero;
			
		}
		
		for(int i=0; i<tabla.length; i++) {
			
			int num=tabla[i];
			
			
			if(num==0) {
				contadorCeros++;
				
			} 
			
			if(num>0) {
				
				mediaPos=num+mediaPos;
				media++;
				mediaPos=mediaPos/media;
				
			}
			
			if(num<0) {
				
				mediaNe=mediaNe+num;
				med++;
				mediaNe=mediaNe/med;
			}
		}
		
		System.out.println("Hay "+contadorCeros+" ceros, la media de los positivos es: "+mediaPos+" y la de los negativos "+mediaNe);
		
		
		
	}

}
