package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int t[]= {2, 5, -1, 7, 17, -3, 10};
		int numElem=t.length;
		System.out.println(Arrays.toString(t));
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el indice del número que quieres borrar.");
		
		int IndiceBorrar=in.nextInt();
		
		
	
		while(IndiceBorrar>=0 && numElem!=0) {
			
			if(IndiceBorrar<numElem) {
				
				t[IndiceBorrar]=t[numElem-1];
				numElem--;
				mostrarTabla(t, numElem);
				
			} else {
				
				System.out.println("no existe el elemento a borrar.");
			}
			
			System.out.println("Introduce el indice del número que quieres borrar..");
			IndiceBorrar=in.nextInt();
			
			
		}
		
		
		
	
	
	}

	public static void mostrarTabla(int a[], int b) {
		
		System.out.println("[");
		for(int i =0; i<b; i++) {
			
			System.out.println(a[i]+" ");
		}
		System.out.println("]");
		
	}
}
