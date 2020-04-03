package model;

import java.util.Comparator;

public class ano implements Comparator<pelicula>{

	@Override
	public int compare(pelicula o1, pelicula o2) {
		return o1.getAno() - o2.getAno();
	}

}
