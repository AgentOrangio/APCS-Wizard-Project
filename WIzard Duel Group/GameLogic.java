


import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.Integer;

public class GameLogic
{
    // instance variables - replace the example below with your own
    private Wizard w1;
    private Wizard w2;
    private boolean endGame;
    private double trainingBudget1;
    private double trainingBudget2;
    ArrayList <Spell> masterSpellBank;

    /**
     * Constructor for objects of class Duel
     */
    public GameLogic(Wizard firstW, Wizard secondW)
    {
        masterSpellBank = new ArrayList <Spell> ();
        w1 = firstW;
        w2 = secondW;
        endGame = false;
        //add spells to SpellBank
        masterSpellBank.add(new Spell("Incendiar", 0.75, 6, 5, 5));
        masterSpellBank.add(new Spell("Incendiar", 0.75, 6, 5, 5));
        masterSpellBank.add(new Spell("Incendiar", 0.75, 6, 5, 5));
        masterSpellBank.add(new Spell("Incendiar", 0.75, 6, 5, 5));
        masterSpellBank.add(new Spell("Incendiar", 0.75, 6, 5, 5));
        masterSpellBank.add(new Spell("Incendiar", 0.75, 6, 5, 5));
        masterSpellBank.add(new Spell("Incendiar", 0.75, 6, 5, 5));
        trainingBudget1 = 20;
        trainingBudget2 = 20;
    }

    public boolean isDuelOver()
    {
        /**
         * if health of w1 or health of w2 = 0 then endGame is true
         */
        if (w1.getHealth()==0 || w2.getHealth()==0) return true;
        return false;
        
    }
    
    public void createWizard ()
    {
        w1.setWizardName(JOptionPane.showInputDialog("What is the name of wizard 1?"));
        System.out.println(w1.getWizardName());
        w2.setWizardName(JOptionPane.showInputDialog("What is the name of wizard 2?"));
        System.out.println(w2.getWizardName());
    }
    
    public void addSpell()
    {
        while(trainingBudget1 != 0) 
        {
            String response = JOptionPane.showInputDialog(w1.getWizardName() + " Enter the number of the spell that you would like to add to your Spellbook");
            if (trainingBudget1 >= (masterSpellBank.get(Integer.parseInt(response)).getTrainingTime()))
            {
             w1.spellBook.add(w1.spellBook.size(), masterSpellBank.get((Integer.parseInt(response))-1)); 
             trainingBudget1 -= masterSpellBank.get(Integer.parseInt(response)).getTrainingTime();
            }
            else System.out.println("Insufficient training time");
        }
        while(trainingBudget2!= 0) 
        {
            String response = JOptionPane.showInputDialog(w2.getWizardName() + " Enter the number of the spell that you would like to add to your Spellbook");
            w2.spellBook.add(w2.spellBook.size(), masterSpellBank.get((Integer.parseInt(response))-1)); 
            trainingBudget2 -= masterSpellBank.get(Integer.parseInt(response)).getTrainingTime();
        }
    }
    
}
