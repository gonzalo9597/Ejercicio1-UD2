package sumando;
	import java.util.*;
public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un sumando: ");
		int sumando = entrada.nextInt();
		
		System.out.println("Introduce otro sumando: ");
		int sumando2 = entrada.nextInt();
		
		System.out.println("La suma de " + sumando + " y " + sumando2 + " es igual a: " + (sumando+sumando2));
		entrada.close();
	}

}
