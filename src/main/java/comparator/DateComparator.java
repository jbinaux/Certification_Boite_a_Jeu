package comparator;

import java.util.Comparator;

import co.simplon.BoiteAJeu.model.Boardgame;

public class DateComparator implements Comparator<Boardgame> {

	@Override
	public int compare(Boardgame o1, Boardgame o2) {
		if (o1.getDateEdition().before(o2.getDateEdition()))
			return -1;
		else if (o1.getDateEdition().after(o2.getDateEdition()))
			return 1;
		else
			return 0;
	}

}
