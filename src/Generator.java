import java.lang.Class;

/**
 * Creates the actual Pokemon that is used Author : MageMan460/GrandMage460
 */
public class Generator {

    @SuppressWarnings("unused")
    private String[] moves;
    @SuppressWarnings("unused")
    private String[] abilities;
    private Pokemon  genned;

    public Generator(String name, int minLevel, int maxLevel, boolean evo) {
        if (minLevel > maxLevel) {
            int temp = minLevel;
            minLevel = maxLevel;
            maxLevel = temp;
        }
        try {
            @SuppressWarnings("unchecked")
            Class<Pokemon> p1 = (Class<Pokemon>)Class.forName(name);
            genned = (Pokemon)p1.newInstance();
            int levels = (int)(Math.random() * (maxLevel - minLevel + 1)) + minLevel;
            if(genned.getPrevReq() > levels && evo) {
                genned = genned.getPrev();
                if(genned.getPrevReq() > levels) {
                    genned = genned.getPrev();
                }
            }
            try {
                genned.setNature();
                genned.normalize();
                genned.levelUp(levels);
                this.moves = genned.generateMoveList();
                this.abilities = genned.generateAbilities();
                genned.update();
            }
            catch (Exception e) {

            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Not a Pokemon name");
        }
        catch (IllegalAccessException e) {

        }
        catch (InstantiationException e1) {

        }
    }


    public String toJSON() {
        return genned.toJSON();
    }

    public static void main(String[] args) {
        Pokemon t = new Pikachu();
        t.setNature();
        t.normalize();
        t.levelUp(10);
        String[] moves = t.generateMoveList();
        String[] abilities = t.generateAbilities();
        System.out.print(t);
        for (int i = 0; i < moves.length; i++) {
            System.out.println(moves[i]);
        }
        for (int i = 0; i < abilities.length; i++) {
            System.out.println(abilities[i]);
        }
        System.out.print(t.toJSON());
    }
}
