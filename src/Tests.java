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
}
