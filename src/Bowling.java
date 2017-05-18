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

	// 81 points
	public void init81points()
	{
		frames.clear();
		frames.add(new int[]{1, 5});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{7, 2});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{4, 4});
		frames.add(new int[]{5, 3});
		frames.add(new int[]{3, 3});
		frames.add(new int[]{4, 5});
		frames.add(new int[]{8, 1});
		frames.add(new int[]{2, 6});
	}

	// 94 points
	public void init94points()
	{
		frames.clear();
		frames.add(new int[]{10, 0});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{7, 2});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{4, 4});
		frames.add(new int[]{5, 3});
		frames.add(new int[]{3, 3});
		frames.add(new int[]{4, 5});
		frames.add(new int[]{8, 1});
		frames.add(new int[]{2, 6});
	}

	// 88 points
	public void init88points()
	{
		frames.clear();
		frames.add(new int[]{1, 9});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{7, 2});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{4, 4});
		frames.add(new int[]{5, 3});
		frames.add(new int[]{3, 3});
		frames.add(new int[]{4, 5});
		frames.add(new int[]{8, 1});
		frames.add(new int[]{2, 6});
	}

	// 103 points
	public void init103points()
	{
		frames.clear();
		frames.add(new int[]{10, 0});
		frames.add(new int[]{4, 6});
		frames.add(new int[]{7, 2});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{4, 4});
		frames.add(new int[]{5, 3});
		frames.add(new int[]{3, 3});
		frames.add(new int[]{4, 5});
		frames.add(new int[]{8, 1});
		frames.add(new int[]{2, 6});
	}

	// 300 points
	public void init300points()
	{
		frames.clear();
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
	}

	// 279 points
	public void init279points()
	{
		frames.clear();
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{9, 1});
		frames.add(new int[]{10, 0});
	}

	// 135 points
	public void init135points()
	{
		frames.clear();
		frames.add(new int[]{6, 3});
		frames.add(new int[]{7, 1});
		frames.add(new int[]{8, 2});
		frames.add(new int[]{7, 2});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{6, 2});
		frames.add(new int[]{7, 3});
		frames.add(new int[]{10, 0});
		frames.add(new int[]{8, 0});
		frames.add(new int[]{7, 3});
		frames.add(new int[]{10, 0});
	}

	// 98 points
	public void init98points()
	{
		frames.clear();
		frames.add(new int[]{8, 2});
		frames.add(new int[]{5, 5});
		frames.add(new int[]{7, 2});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{4, 4});
		frames.add(new int[]{5, 3});
		frames.add(new int[]{3, 3});
		frames.add(new int[]{4, 5});
		frames.add(new int[]{8, 1});
		frames.add(new int[]{2, 6});
	}

	// 93 points
	public void init93points()
	{
		frames.clear();
		frames.add(new int[]{1, 5});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{7, 2});
		frames.add(new int[]{3, 6});
		frames.add(new int[]{4, 4});
		frames.add(new int[]{5, 3});
		frames.add(new int[]{3, 3});
		frames.add(new int[]{4, 5});
		frames.add(new int[]{8, 1});
		frames.add(new int[]{2, 8});
		frames.add(new int[]{10, 0});
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

	public int getAmountOfFrames()
	{
		return frames.size();
	}

	public int score()
	{
		int sum = 0;

		for (int i = 0; i < 10; i++)
		{
			sum += frames.get(i)[0];
			sum += frames.get(i)[1];
			if (isStrike(i))
			{
				sum += strikePoints(i);
			}
			else if (isSpare(i))
			{
				sum += sparePoints(i);
			}
		}

		return sum;
	}

	private boolean isStrike(int frame)
	{
		return frames.get(frame)[0] == 10;
	}

	private boolean isSpare(int frame)
	{
		int arr[] = frames.get(frame);
		return arr[0] + arr[1] == 10;
	}

	private int sparePoints(int frame)
	{
		if (frame > -1 & frame + 1 < frames.size())
		{
			return frames.get(frame + 1)[0];
		}
		else
		{
			return 0;
		}
	}

	private int strikePoints(int frame)
	{
		if (frame > -1 && frame < 10)
		{
			if (frame + 1 < frames.size())
			{
				if (isStrike(frame + 1))
				{
					if (frame + 2 < frames.size())
					{
						return frames.get(frame + 1)[0] + frames.get(frame + 2)[0];
					}
					else
					{
						return frames.get(frame + 1)[0];
					}
				}
				else
				{
					return frames.get(frame + 1)[0] + frames.get(frame + 1)[1];
				}
			}
		}
		return 0;
	}
}
