package collectionsHT;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		if (a.score != b.score) {
			return a.score - b.score;
		} else {
			return a.name.compareTo(b.name);
		}
	}
}
