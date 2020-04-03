package model;

import java.util.Comparator;

public class peliOserie implements Comparator<pelicula>{

	@Override
	public int compare(pelicula o1, pelicula o2) {
		return o1.getPeliOserie().compareTo(o2.getPeliOserie());
	}

}
