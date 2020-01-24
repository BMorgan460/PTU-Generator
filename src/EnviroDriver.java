
/**
 * Generates a Pokemon based on given environment, min level, and max level
 * 
 * @author Mageman460/GrandMage460
 * @version
 */
public class EnviroDriver {

    private final static String[] ARCTIC   = { "" };
    private final static String[] BEACH    = { "" };
    private final static String[] CAVE     = { "" };
    private final static String[] DESERT   = { "" };
    private final static String[] FOREST   = { "" };
    private final static String[] FRESH    = { "" };
    private final static String[] GRASS    = { "" };
    private final static String[] MARSH    = { "" };
    private final static String[] MOUNTAIN = { "" };
    private final static String[] OCEAN    = { "" };
    private final static String[] RAIN     = { "" };
    private final static String[] TAIGA    = { "" };
    private final static String[] TUNDRAA  = { "" };
    private final static String[] URBAN    = { "" };


    public static void main(String[] args) {
        String enviro = args[0];
        int minLevel = Integer.valueOf(args[1]);
        int maxLevel = Integer.valueOf(args[2]);
        String name = "";
        switch (enviro) {
            case "Arctic":
                name = ARCTIC[((int)Math.random() * ARCTIC.length)];
                break;
            case "Beach":
                name = BEACH[((int)Math.random() * BEACH.length)];
                break;
            case "Cave":
                name = CAVE[((int)Math.random() * CAVE.length)];
                break;
            case "Desert":
                name = DESERT[((int)Math.random() * DESERT.length)];
                break;
            case "Forest":
                name = FOREST[((int)Math.random() * FOREST.length)];
                break;
            case "Fresh Water":
                name = FRESH[((int)Math.random() * FRESH.length)];
                break;
            case "Grasslands":
                name = GRASS[((int)Math.random() * GRASS.length)];
                break;
            case "Marsh":
                name = MARSH[((int)Math.random() * MARSH.length)];
                break;
            case "Mountain":
                name = MOUNTAIN[((int)Math.random() * MOUNTAIN.length)];
                break;
            case "Rainforest":
                name = RAIN[((int)Math.random() * RAIN.length)];
                break;
            case "Ocean":
                name = OCEAN[((int)Math.random() * OCEAN.length)];
                break;
            case "Taiga":
                name = TAIGA[((int)Math.random() * TAIGA.length)];
                break;
            case "Tundraa":
                name = TUNDRAA[((int)Math.random() * TUNDRAA.length)];
                break;
            case "Urban":
                name = URBAN[((int)Math.random() * URBAN.length)];
                break;
        }
        Generator genned = new Generator(name, minLevel, maxLevel);
        System.out.println(genned.toJSON());
    }

}
