package model;

import java.util.Comparator;

public class nombre implements Comparator<pelicula> {

	@Override
	public int compare(pelicula arg0, pelicula arg1) {
		return arg0.getNombre().compareTo(arg1.getNombre());
	}

}
