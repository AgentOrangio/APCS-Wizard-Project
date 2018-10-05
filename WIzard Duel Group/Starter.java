
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Starter
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        System.out.println("\n\n\n");
        
        Wizard w1 = new Wizard ("Name");
        Wizard w2 = new Wizard ("Name");
        GameLogic g = new GameLogic(w1, w2);
        g.createWizard();
        g.addSpell();
        //code tester
        
        //initialize all the spells
        
        //Spell spell2 = new Spell("", 
        
        //initalize SpellBank
        //ArrayList <Spell> masterSpellBank = new ArrayList <Spell> ();
    }
}
