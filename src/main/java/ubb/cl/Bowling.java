package ubb.cl;

public class Bowling {
	int score;
	public Bowling (){
		score = 0;
	}
	public void roll(int i) {
		score+=i;
	}
	public int score(){
		return score;
	}

}
