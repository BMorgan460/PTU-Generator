import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
		String name = args[0];
		
		//GET RID OF THIS LATER
		//Scanner scan = new Scanner(System.in);
		//name = scan.nextLine();
		//scan.close();
		//GET RID OF THIS LATER
		
		int minLevel = Integer.valueOf(args[1]);
		int maxLevel = Integer.valueOf(args[2]);
		Generator g = new Generator(name, minLevel, maxLevel, false);
		String json = g.toJSON();
		String path = System.getProperty("user.dir");
		path = path + System.getProperty("file.separator") + "JSON" + System.getProperty("file.separator") + "temp";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		path = path + System.getProperty("file.separator") + name + "_" + listOfFiles.length + ".pokemon";
		File file = new File(path);
		try {
            PrintWriter printer = new PrintWriter(file);
            printer.print(json);
            printer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("couldn't create file");
        }
	}

}
