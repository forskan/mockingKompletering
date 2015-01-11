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

	public void walk(int steps) {
		for(int i = 0; i < steps; i++){
			if((i%2)==0){ // even
				m_leftLeg.takeStep(); 	
			}	   
			else{ // odd
				m_rightLeg.takeStep();
			}	   
		}
		
	}

	
}
