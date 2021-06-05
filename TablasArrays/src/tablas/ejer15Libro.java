package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class ejer15Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int t[]=new int[10];
		int contador=0;
		System.out.println("Introduce 10 números.");
		
		for(int i=0; i<t.length; i++) {
			t[i]=in.nextInt();
			
		}
		
		contador=rellenaPares(t);
		System.out.println("Hay "+contador+" impares desechados.");
		
	}

	public static int rellenaPares(int[] t) {
		int pares[]= new int[10];
		int contadorImp=0;
		for(int j=0; j<t.length; j++) {
			
			if(t[j]%2==0) {
				
				pares[j]=t[j];
			}
			
			else {
				contadorImp++;
			}
			
		}
		
		System.out.println(Arrays.toString(pares));
		return contadorImp;
	}
	
	

}
