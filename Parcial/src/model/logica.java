package model;

import java.util.*;
import java.util.LinkedList;
import processing.core.PImage;


import processing.core.PApplet;

public class logica {
	PApplet n;
	private String[] texto;
	private LinkedList<pelicula> lasPelis;
	private ano ano;
	private nombre nombre;
	private peliOserie peliOserie;
	int ordenar;
	private PImage breakingBad;
	private PImage dark;
	private PImage mindHunter;
	private PImage ozark;
	private PImage strangerThings;
	private PImage theIrisman;

	public logica(PApplet app) {
		this.n = app;
		ano = new ano();
		nombre = new nombre();
		peliOserie = new peliOserie();
		lasPelis = new LinkedList<pelicula>();
		texto = n.loadStrings("./texto/netflix.txt");
		cargarTexto();
	}
	
	public void cargarImagenes() {
		breakingBad = n.loadImage("./imagenes/breakingbad.jpg");
		dark = n.loadImage("./imagenes/dark.jpg");
		mindHunter = n.loadImage("./imagenes/mindhunter.jpg");
		ozark = n.loadImage("./imagenes/ozark.jpg");
		strangerThings = n.loadImage("./imagenes/strangerthings.jpg");
		theIrisman = n.loadImage("./imagenes/theirisman.jpg");
	}

	private void cargarTexto() {
		
		for(int i = 0; i < texto.length; i++) {
			String[] recorrerTexto = texto[i].split(",");
			int ano = Integer.parseInt(recorrerTexto[1]);
			int rating = Integer.parseInt(recorrerTexto[2]);
			String peliOserie = recorrerTexto[3];
			String nombre = recorrerTexto[0];
			//System.out.println("entra");
			lasPelis.add(new pelicula( ano,  rating, peliOserie,  nombre,  n));
			
			
		}
		
	}

	public LinkedList<pelicula> getLasPelis() {
		return lasPelis;

	}

	public void setLasPelis(LinkedList<pelicula> lasPelis) {
		this.lasPelis = lasPelis;
	}

	public void ordenar(int i) {
		switch (i) {
		case 0:
			Collections.sort(lasPelis);
			guardarTexto();
			ordenar = 0;
			break;
		case 1:
			Collections.sort(lasPelis, ano);
			guardarTexto();
			ordenar = 1;
			break;
		case 2:
			Collections.sort(lasPelis, nombre);
			guardarTexto();
			ordenar = 2;
			break;
		case 3:
			Collections.sort(lasPelis, peliOserie);
			guardarTexto();
			ordenar = 3;
			break;
		}
	}
	
	public void guardarTexto() {
		String[] nuevoTexto;
		nuevoTexto = new String[lasPelis.size()];
		
		for(int v = 0; v < lasPelis.size(); v++) {
			String rating = "Rating: " + lasPelis.get(v).getRating();
			String ano = "Ano: " + lasPelis.get(v).getAno();
			String nombre = "Nombre: " + lasPelis.get(v).getNombre();
			String peliOserie = "Peli o Serie: " + lasPelis.get(v).getPeliOserie();
			
			nuevoTexto[v] = nombre+ano+rating+peliOserie;
			
		}
		
		
		
		switch (ordenar) {
		case 0:
			n.saveStrings("./texto/guardarInfo.txt", nuevoTexto);
			break;
		case 1:
			n.saveStrings("./texto/guardarInfo.txt", nuevoTexto);
			break;
		case 2:
			n.saveStrings("./texto/guardarInfo.txt", nuevoTexto);
			break;
		case 3:
			n.saveStrings("./texto/guardarInfo.txt", nuevoTexto);
			break;
		}
	}

}
