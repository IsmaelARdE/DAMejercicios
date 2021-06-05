package tablas;

import java.util.Scanner;

public class ejer5deltemaanterior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0, numero = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Introduce tres números enteros.");

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		

		numero=ejer4deltemaanterior.maximo(a, b);
		numero=ejer4deltemaanterior.maximo(numero, c);

		System.out.println("El número mayor es: " + numero);

	}

	

}
