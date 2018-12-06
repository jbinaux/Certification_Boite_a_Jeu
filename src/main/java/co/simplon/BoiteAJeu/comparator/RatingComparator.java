package co.simplon.BoiteAJeu.comparator;

import java.util.Comparator;

import co.simplon.BoiteAJeu.model.Boardgame;

public class RatingComparator implements Comparator<Boardgame> {

	@Override
	public int compare(Boardgame arg0, Boardgame arg1) {
		if (arg0.getRating() < arg1.getRating())
			return -1;
		else if (arg0.getRating() > arg1.getRating())
			return 1;
		else
			return 0;
	}

}
