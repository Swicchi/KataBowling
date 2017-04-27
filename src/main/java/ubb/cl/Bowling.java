package ubb.cl;

public class Bowling {
	int score;
	int cantRoll;
	int frame;
	boolean strike;
	int strikePos;
	int strikeTurn;
	boolean spare;
	int sparePos;
	int [] frameScore= new int [10];
	public Bowling (){
		score = 0;
		cantRoll = 0;
		frame = 0;
		strike = false;
	}
	public void roll(int i) {
		if(i == 10 && cantRoll==0){
			if (spare){
				frameScore[sparePos]+=i;
				spare=false;
			}
			frameScore[frame]=10;
			strikePos = frame; 
			strike = true;
			frame++;
			strikeTurn=0;
		}else{
			frameScore[frame]+=i;
			if (strike){
				frameScore[strikePos]+=i;
				strikeTurn++;
				if(strikeTurn==2)
					strike=false;
			}
			if (spare){
				frameScore[sparePos]+=i;
				spare=false;
			}
			cantRoll++;
			if (cantRoll==2){
				if(frameScore[frame]==10){
					spare=true;
					sparePos=frame;
				}
				frame++;
				cantRoll=0;
			}
		}
	}
	public int score(){
		int total =0;
		for (int i=0;i<10;i++){
			total+=frameScore[i];
		}
		return total;
	}

}
