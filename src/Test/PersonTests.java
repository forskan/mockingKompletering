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
		assertEquals(0.0f, person.getPosition(),0);
		//
	}	
		
}
