package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5CamaraSecreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la longitud de la clave secreta...");
		
		int l=in.nextInt();
		
		
		int t[]=new int[l];
		int c[]=new int[l];
		
	
	
		for(int i=0; i<=t.length-1; i++) {
			
			double n= Math.floor(Math.random()*6);
			int num=(int) n;
			
			t[i]= num;
			num=0;
			
		}
		
		System.out.println(Arrays.toString(t));
		
		while(t!=c) {
			
			int a=0;
			System.out.println("Adivina adivinanza...Cuál es la combinación secreta???");
			
			
			for(int i=0; i<=c.length-1; i++) {
				
				System.out.println("Introduce los digitos del 1 al 5 que creas oportunos.");
				
				a=in.nextInt();
				c[i]=a;
				
				if(c[i]>t[i]) {
					System.out.println("No has acertado la posición "+i+ " de la combinación, prueba de nuevo. PISTA: Tu número es mayor que el de la clave.");
					i--;
					
				}
				
				else if(c[i]<t[i]) {
					System.out.println("No has acertado la posición " +i+ " de la combinación, prueba de nuevo. PISTA: Tu número es menor que el de la clave.");
			
				i--;
				
				} else {
					System.out.println("Muy bien tenemos la posisción "+i+" de la combinación. A por el siguiente!!");
					a=0;
					
				}
				
				
				
			}
			
			System.out.println(Arrays.toString(c)+" Has acertado la combinación.");
			System.out.println(Arrays.toString(t));
			System.exit(0);
			
			
			
			
			
		}
		
		
	 

	
	}
}
