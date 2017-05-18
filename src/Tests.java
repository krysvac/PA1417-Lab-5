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

	@Test
	public void testGame()
	{
		bowling.initRandomPoints();
		assertEquals(bowling.getAmountOfFrames(), 10);
	}

	@Test
	public void testGameScore1()
	{
		bowling.init81points();
		assertEquals(bowling.score(), 81);
	}

	@Test
	public void testGameScore2()
	{
		bowling.init88points();
		assertEquals(bowling.score(), 88);
	}

	@Test
	public void testGameScore3()
	{
		bowling.init94points();
		assertEquals(bowling.score(), 94);
	}

	@Test
	public void testGameScore4()
	{
		bowling.init103points();
		assertEquals(bowling.score(), 103);
	}

	@Test
	public void testGameScore5()
	{
		bowling.init279points();
		assertEquals(bowling.score(), 279);
	}

	@Test
	public void testGameScore6()
	{
		bowling.init300points();
		assertEquals(bowling.score(), 300);
	}

	@Test
	public void testGameScore7()
	{
		bowling.init135points();
		assertEquals(bowling.score(), 135);
	}

	@Test
	public void testGameScore8()
	{
		bowling.init98points();
		assertEquals(bowling.score(), 98);
	}

	@Test
	public void testGameScore9()
	{
		bowling.init93points();
		assertEquals(bowling.score(), 93);
	}
}
