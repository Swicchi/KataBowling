package ubb.cl;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestBowling {
Bowling bowling;
int result; 
@Before
public void Setup (){
	bowling =new Bowling();
}
@Test
public void FirstOneSecondThreeScoreShouldByFour(){
	bowling.roll(1);
	bowling.roll(3);
	result = bowling.score();
	assertEquals(4,result);
	
}
@Test
public void FirstTenSecondOneThirdTwoShouldBySixteen(){
	bowling.roll(10);
	bowling.roll(1);
	bowling.roll(2);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	int result = bowling.score();
	assertEquals(16,result);
}
@Test
public void FirstFiveSecondFiveThirdTwoFourthOneShouldByFiveteen(){
	bowling.roll(5);
	bowling.roll(5);
	bowling.roll(2);
	bowling.roll(1);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	int result = bowling.score();
	assertEquals(15,result);
}
@Test
public void FirstTenSecondFiveThirdFiveFourthOneShouldByThirtyTwo(){
	bowling.roll(10);
	bowling.roll(5);
	bowling.roll(5);
	bowling.roll(1);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	int result = bowling.score();
	assertEquals(32,result);
}
@Test
public void FirstFiveSecondFiveThirdTenFourthOneShouldByThirtyTwo(){
	bowling.roll(5);
	bowling.roll(5);
	bowling.roll(10);
	bowling.roll(1);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	bowling.roll(0);
	int result = bowling.score();
	assertEquals(32,result);
}



}