package WalkingPeople;

public class Leg {

	private float m_position = 0.0f;
	
	public float getPosition()
	{
		return m_position;
	}

	public void takeStep() {
		m_position += 1.0f;
	}
	
}
