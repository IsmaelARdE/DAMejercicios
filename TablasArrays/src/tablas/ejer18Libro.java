package tablas;

import java.util.Arrays;
import java.util.Scanner;

public class ejer18Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numElem = 4, lugarUno=0, lugarDos=0;
		boolean t[][] = new boolean[numElem][numElem];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < numElem; i++) {
			for (int j = 0; j < numElem; j++) {

				if (i == 1 && j == 1) {
					t[1][0] = true;
					t[2][1] = true;
					t[0][2] = true;
					t[1][3] = true;
				} else if (t[2][1]) {
					t[2][1] = true;
				} else if (t[0][2]) {
					t[0][2] = true;
				} else if (t[1][3]) {
					t[1][3] = true;
				}

				else {
					t[i][j] = false;
				}
			}
		}
		
		do{
			System.out.println("Introduce dos lugares: De 0 a 3 ");
			lugarUno=in.nextInt();
			lugarDos=in.nextInt();
			if(t[lugarUno][lugarDos]==true) {
				System.out.println("Has acertado sigue jugando...");
			}
			
		} while(t[lugarUno][lugarDos]==true);
		
		System.out.println("Lo siento has fallado no hay camino.");
		
		
		System.out.println("MOSTRAMOS EL MAPA:");
		for (int i = 0; i < numElem; i++) {
			System.out.println();
			for (int j = 0; j < numElem; j++) {
				System.out.print(t[i][j] + " ");
			}
		}
	}

}



/*import java.util.Scanner;

public class Mapa {

    public static void main(String[] args) {

        int lugar1,lugar2;
        boolean [][] mapa=    {{false,false,true,false},
                            {true,false,false,true},
                            {false,true,false,false},
                            {false,false,false,false}};
        int i, j;

        Scanner in = new Scanner(System.in);

       do{ System.out.println("introduce el lugar 1: ");
        lugar1 = in.nextInt();

        System.out.println("introduce el lugar 2: ");
        lugar2 = in.nextInt();

        System.out.println(mapa[lugar1][lugar2]);
        }while(t[lugar1][lugar2])==true);
    } 

} */
