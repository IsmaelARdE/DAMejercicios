package tablas;

import java.util.Scanner;

public class ejer4deltemaanterior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=0,b=0, numero=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce dos números enteros.");
		
		a=in.nextInt();
		b=in.nextInt();
		
		numero=maximo(a, b);
		System.out.println("El mayor es "+numero);
	}

	public static int maximo(int a, int b) {
		int max = 0;
		
		
		if(a>b) {
			max=a;
			//System.out.println("El número mayor es "+max);
		}
		 
		else if(b>a) {
			max=b;
			//System.out.println("EL número mayor es "+max);
		}
		
		else {
			max=a;
			System.out.println("Los numeros son iguales. "+max);
		}
		return max;
	}

}
