package collectionsHT;

public class Player {

	String name;
	int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Player [name: "+name+" score: "+score+"]";
	}

}
