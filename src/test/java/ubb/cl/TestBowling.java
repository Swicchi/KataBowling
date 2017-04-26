package ubb.cl;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestBowling {


@Test
public void FirstOneSecondThreeScoreShouldByFour(){
	Bowling bowling = new Bowling();
	bowling.roll(1);
	bowling.roll(3);
	int result = bowling.score();
	assertEquals(4,result);
	
}
}