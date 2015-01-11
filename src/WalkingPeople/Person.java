package WalkingPeople;

import java.util.Vector;

public class Person {

	private Leg m_leftLeg;
	private Leg m_rightLeg;
	

	public float getPosition()
	{
		float position = m_leftLeg.getPosition();
		if(position < m_rightLeg.getPosition()){
			return m_rightLeg.getPosition();
		}
		return position;
	}
	
	public Person(Leg a_legOne, Leg a_legTwo)
	{
		m_leftLeg = a_legOne;
		m_rightLeg = a_legTwo;
	}

	
}
