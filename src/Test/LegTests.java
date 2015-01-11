package Test;

import org.junit.Test;

import WalkingPeople.Leg;
import WalkingPeople.Person;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LegTests {
	
	@Test
	public void testGetPosition(){
		Leg leg = new Leg();
		assertEquals(0, leg.getPosition(), 0);
	}
	
	@Test
	public void testTakeStep(){
		Leg leg = new Leg();
		leg.takeStep();
		assertEquals(1, leg.getPosition(), 0);
	}
}
