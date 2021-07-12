package ejercicio003;

import java.util.HashSet;

import java.util.Random;
import java.util.Set;

public class listar {

	static Set<String> listas = new HashSet<>();

	public void listarUsuarios() {

		listas.add("JavierF");
		listas.add("PedroM");
		listas.add("PabloC");
		listas.add("AlejandroF");
		listas.add("AngelC");
		listas.add("PabloP");
		listas.add("SergioM");
		listas.add("AngelD");
		listas.add("JavierB");
		listas.add("RebecaP");
		listas.add("AnibalD");
		listas.add("JorgeB");
		listas.add("PabloA");
		listas.add("PabloB");

	}

	public void seleccionarUsuario() {

		listarUsuarios();

		int random = new Random().nextInt(listas.size());
		System.out.println("El resultado es" + random);

	}

	public void seleccionarDosUsuarios() {

		listarUsuarios();
		int elegido = 0;
		int elegido2 = 0;

		int random = new Random().nextInt(listas.size());
		 elegido = random;
		int random2 = new Random().nextInt(listas.size());
		if (random2 == elegido) {
			random2 = new Random().nextInt(listas.size());
			elegido2 = random2;
		} else {
			elegido2 = random2;
			

		}
		System.out.println("El resultado es" +elegido +"  " +elegido2);

	}
}
