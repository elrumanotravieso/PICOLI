package modelo;

import java.util.ArrayList;
import utiles.Constantes;

public class Historial {

	private ArrayList<Colores> listaColores;

	public Historial() {
		this.listaColores = new ArrayList<>();
	}

	/*
	 * Comprueba si existen m�s de dos coincidencias de colores en el historial
	 */

	public ArrayList<Colores> getListaColores() {
		return listaColores;
	}

	public boolean buscarCoincidencias(Colores color, ArrayList<Colores> historial) {
		int coincidencias = 0;
		for (Colores colores : historial) {
			if (colores == color) {
				coincidencias++;
			}
		}
		if (coincidencias >= 2) {
			return true;
		}
		return false;
	}

	/*
	 * Este m�todo introduce un color en el historial sustituyendo el m�s antiguo
	 */

	public void sustituirColor(Colores color) {
		listaColores.remove(0);
		listaColores.add(color);
	}

	/*
	 * Comprueba si el historial est� completo
	 */

	public boolean comprobarHistorialCompleto() {
		if (listaColores.size() >= Constantes.TAMANO_HISTORICO) {
			return true;
		} else {
			return false;
		}

	}
}
