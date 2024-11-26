package mostrandodatos;
	import java.util.*;
public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("Introduce tu apellido: ");
		String apellido = entrada.nextLine();

		System.out.println("Tu nombre completo es: " + nombre + " " + apellido);
		entrada.close();
	}

}
