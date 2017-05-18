import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Bowling
{
	private java.util.List<int[]> frames;

	public Bowling()
	{
		frames = new ArrayList<int[]>();
	}

	// random points
	public void initRandomPoints()
	{
		frames.clear();
		for (int i = 0; i < 10; i++)
		{
			int first = ThreadLocalRandom.current().nextInt(0, 10 + 1);
			int second = ThreadLocalRandom.current().nextInt(0, 10 - first + 1);
			frames.add(new int[]{first, second});
		}
	}

	public int[] getFrame(int frame)
	{
		if (frame > 0 && frame < frames.size())
		{
			return frames.get(frame);
		}

		return new int[]{0, 0};

	}

	public int getFrameScore(int frame)
	{
		int arr[] = getFrame(frame);
		return arr[0] + arr[1];
	}
}
