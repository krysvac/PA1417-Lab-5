import static org.junit.Assert.*;
import org.junit.Test;

public class Tests
{
	Bowling bowling;

	public Tests()
	{
		bowling = new Bowling();
	}

	@Test
	public void testFrame()
	{
		assertNotNull(bowling.getFrame(0));
	}

	@Test
	public void testFrameScore()
	{
		bowling.initRandomPoints();
		int firstframe[] = bowling.getFrame(0);
		int value = bowling.getFrameScore(0);

		assertEquals(firstframe[0] + firstframe[1], value);
	}
}
