package view;

import controller.controller;
import processing.core.PApplet;
import processing.core.PImage;

public class main extends PApplet {
	
	private controller controller;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.main");
	}
	
	public void settings() {
		size(600,600);
	}
	public void setup() {
		
		controller = new controller(this);
	}
	
	public void draw() {
		background(0);
		for(int a = 0; a < controller.LinkedList().size(); a++) {
			int posX = 40;
			int posY = 60*(a+1);
			controller.LinkedList().get(a).dibujar(posX, posY);
		}
		
		fill(0,0,255);
		textSize(14);
		text("q para ordenar por rating", 60, 400);
		text("w para ordenar por año", 60, 425);
		text("e para ordenar por nombre", 60, 450);
		text("r para saber si es pelicula o serie", 60, 475);
		
	}
	
	public void keyPressed() {
		controller.ordenar(key);
	}

}
