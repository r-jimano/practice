import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main4
{

	public static void main(String[] args)
	{
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines())
		{
			new Main4().exec(lines.toArray(String[]::new));
		}
	}

	protected void exec(String[] args)
	{
		String[] in = args[0].split(" ");
		int p = Integer.parseInt(in[0]) * 2;
		int k = Integer.parseInt(in[1]);
		int d = IntStream.iterate(1, i -> i + 1)
			.filter(i -> k * Math.pow(2, (double)i) >= p)
			.findFirst()
			.getAsInt();
		System.out.println(d);
		IntStream.rangeClosed(1, d)
			.mapToObj(i ->
			{
				int n = Math.min(p, (int)(k * Math.pow(2, (double)i)));
				return IntStream.rangeClosed(n + 1, n + p)
					.map(j -> 2 * n + p + 1 - j)
					.map(j -> j > p ? j - p : j)
					.mapToObj(String::valueOf)
					.collect(Collectors.joining(" "));
			}).forEach(System.out::println);
	}

}
