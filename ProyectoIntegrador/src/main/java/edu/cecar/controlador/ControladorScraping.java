/**
 *Clase ControladorScraping.java
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

package edu.cecar.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.cecar.modelo.Pais;

/**
 *	clase que realiza scraping de los paises a nivel mundial
 *
 */

public class ControladorScraping {

	public List<Pais> getpaises(){

		List<Pais> paises = new ArrayList<Pais>();
		//Se inicia el proceso de scraping
		try {
			Document document = Jsoup.connect("https://www.sport-histoire.fr/es/Geografia/Paises_en_orden_alfabetico.php").get();

			Elements elements = document.select("table[class=tableau_gris_centrer]").
					select("tbody").
					select("tr");

			for (Element element : elements) {

				Elements columnas = element.select("td");

				if(columnas.hasText()) {
					Pais pais= new Pais(columnas.get(0).text(),
							columnas.get(1).text(),
							columnas.get(2).text());
					paises.add(pais);
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return paises;


	}

}


