
public class Driver {

	@SuppressWarnings("unchecked")
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String path = System.getProperty("user.dir");
	    Class<Move> move;
        try {
            move = (Class<Move>)Class.forName("Absorb");
            Move genned = (Move)move.newInstance();
            System.out.println(genned.toString());
        }
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
	}

}
