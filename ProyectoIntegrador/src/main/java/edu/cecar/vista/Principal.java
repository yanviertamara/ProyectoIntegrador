/**
 *Clase Principal.java
 *
 *@version:0.1
 *
 *Fecha de Creacion: 27/02/2020
 *
 *Fecha de Modificación:
 *
 *@author: 1102884264
 *
 *Copyright: CECAR
 *
 */

package edu.cecar.vista;

import edu.cecar.controlador.ControladorScraping;
import edu.cecar.modelo.Pais;

/**
 * Clase Principal
 */

public class Principal {

	public static void main(String[] args) {
		ControladorScraping controladorScraping = new ControladorScraping();

		for (Pais pais : controladorScraping.getpaises()) {

			System.out.println("Nombre "+pais.getNombre());
			System.out.println("Capital "+pais.getCapital());
			System.out.println("Continente "+pais.getContinente());
			System.out.println("\n\n");

		}
	}

}


