package model;

import processing.core.PApplet;

public class pelicula implements Comparable<pelicula>{

	private int ano, rating;
	private String nombre, peliOserie;
	private PApplet app1;

	public pelicula(int ano, int rating, String peliOserie,String nombre, PApplet n) {
		this.ano = ano;
		this.rating = rating;
		this.nombre = nombre;
		this.peliOserie = peliOserie;
		this.app1 = n;
	}
	
	




	public int getAno() {
		return ano;
	}






	public void setAno(int ano) {
		this.ano = ano;
	}






	public int getRating() {
		return rating;
	}






	public void setRating(int rating) {
		this.rating = rating;
	}






	public String getNombre() {
		return nombre;
	}






	public void setNombre(String nombre) {
		this.nombre = nombre;
	}






	public String getPeliOserie() {
		return peliOserie;
	}






	public void setPeliOserie(String peliOserie) {
		this.peliOserie = peliOserie;
	}






	@Override
	public int compareTo(pelicula arg0) {
		return this.rating - arg0.getRating();
	}
	
	public void dibujar(int posX, int posY) {
		app1.fill(255,0,0);
		app1.textSize(20);
		app1.text(nombre+"  "+ano+"  "+rating+"%"+"  "+peliOserie,posX, posY);
	}

}
