package tablas;

public class ejer13Libro {

	/*Vamos a sobrecargar el metodo máximo del ejercicio cuatro.
	 * Fundamental para sobrecargarlo no estar dentro del main. Estamos dentro de la clase pero el main irá
	 * después apra realizar la función, aki solo cambiamos la función
	 * creamos la tabla con números, llamamos a la función maximo pasandole la tabla t[]
	 * igualamos el int max al prier numero de la función, y con un bucle for each lo recorremos comparando con 
	 * una vriable nueva e, si esta es mayor que max, se guarda en max el valor. El metodo devuelve la variable max.
	 * Finalmente el main crea la tabla numeros con valores asignados y comprueba el mayor llamando al metodo.
	 */
	
		
	//sobrecarga del metodo maximo()
		static int maximo(int t[]) {
			int max=t[0];
			
			for(int e:t) {
				if(e>max) {
					max=e;
				}
			}
			return max;
		}
	


public static void main(String[] args) {
	
	
	int numeros[]= {7, -9, 65, 0, 49};
	//si kiero puedo crear un Scanner y meter los números a mano es indiferente.
	System.out.println("El mayor dentro de la tabla es: "+maximo(numeros));
	
	}

}
	
