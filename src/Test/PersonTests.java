package Test;

import org.junit.Test;

import WalkingPeople.Leg;
import WalkingPeople.Person;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PersonTests {

	@Test
	public void testGetPosition()
	{		
		Leg mockedLeg1 = mock(Leg.class);	
		Leg mockedLeg2 = mock(Leg.class);
		Person person = new Person(mockedLeg1, mockedLeg2);
		person.getPosition();
		verify(mockedLeg1).getPosition();
		verify(mockedLeg2).getPosition();
	}	
	
	@Test
	public void testWalk(){
		Leg mockedLeg1 = mock(Leg.class);	
		Leg mockedLeg2 = mock(Leg.class);
		Person person = new Person(mockedLeg1, mockedLeg2);
		person.walk(2);
		verify(mockedLeg1).takeStep();
		verify(mockedLeg2).takeStep();
	}
		
	@Test
	public void testWalkOnRealObjects(){
		Person p = new Person(new Leg(), new Leg());
		p.walk(1);
		assertEquals(1, p.getPosition(), 0);
	}
	
	@Test
	public void testWalkAlotOnRealObjects(){
		Person p = new Person(new Leg(), new Leg());
		p.walk(12);
		assertEquals(6, p.getPosition(), 0);
	}
	
	@Test
	public void testWalkAlotTwoOnRealObjects(){
		Person p = new Person(new Leg(), new Leg());
		
		for( int i = 0; i < 12; i++){
			p.walk(1);
		}
		assertEquals(6, p.getPosition(), 0);
	}
}
