package controller;

import java.util.LinkedList;

import model.logica;
import model.pelicula;
import processing.core.PApplet;

public class controller {
	
	private PApplet app;
	private logica logic;
	
	public controller(PApplet app) {
		logic = new logica(app);
	}
	
	public void ordenar(char valor) {
		switch(valor) {
		case 'q':
			logic.ordenar(0);
		break;
		case 'w':
			logic.ordenar(1);
		break;
		case 'e':
			logic.ordenar(2);
		break;
		case 'r':
			logic.ordenar(3);
		break;
		}
	}

	public LinkedList<pelicula> LinkedList() {
		return logic.getLasPelis();
	}
}
