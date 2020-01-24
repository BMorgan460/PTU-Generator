
public class Driver {

    public static void main(String[] args) {
		String name = args[0];
		int minLevel = Integer.valueOf(args[1]);
		int maxLevel = Integer.valueOf(args[2]);
		Generator g = new Generator(name, minLevel, maxLevel);
		System.out.println(g.toJSON());
	}

}
