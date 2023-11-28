import java.lang.Class;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JOptionPane;

/**
 * Creates the actual Pokemon that is used Author : MageMan460/GrandMage460
 */
public class Generator {

    @SuppressWarnings("unused")
    private String[] moves;
    @SuppressWarnings("unused")
    private String[] abilities;
    private Pokemon genned;

    public Generator(String name, int minLevel, int maxLevel, boolean evo) {
        if (minLevel > maxLevel) {
            int temp = minLevel;
            minLevel = maxLevel;
            maxLevel = temp;
        }
        try {
            @SuppressWarnings("unchecked")
            Class<Pokemon> p1 = (Class<Pokemon>)Class.forName(name);
            genned = (Pokemon) p1.getDeclaredConstructor().newInstance();
            int levels = (int)(Math.random() * (maxLevel - minLevel + 1)) + minLevel;
            if(genned.hasPrev() && (genned.getPrevReq() > levels) && evo) {
                genned = genned.getPrev();
                if(genned.hasPrev() && genned.getPrevReq() > levels) {
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
                e.printStackTrace();
                System.out.println(name);
            }
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Not a Pokemon");
            System.out.println(name);
        }
        catch (IllegalAccessException e1) {
        	System.out.println(1);
        }
        catch (IllegalArgumentException e1) {
        	System.out.println(2);
        }
        catch (InvocationTargetException e1) {
        	System.out.println(3);
        }
        catch (NoSuchMethodException e1) {
        	System.out.println(4);
        }
        catch (SecurityException e1) {
        	System.out.println(5);
        }
        catch (InstantiationException e1) {
        	System.out.println(6);
        }
    }


    public String toJSON() {
        return genned.toJSON();
    }
    
    public String getName() {
        return genned.getName();
    }
}
