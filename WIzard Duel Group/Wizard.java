import java.util.ArrayList;

public class Wizard
{
    // instance variables - replace the example below with your own
    // an object is a big container - more abstract 
    // add a little bit of code then test it and then can add more
    String wizardName;
    double health;
    ArrayList <Spell> spellBook;//this is where I declared spellBook
    
    //ArrayList <int> listofnums
    public Wizard(String n) //double h)
    {
        wizardName = n;
        health = 100;
        spellBook = new ArrayList <Spell> ();//leave it empty because starts with no spells 
        //Spell spell1 = new Spell("Incendiar", 0.75, 6, 5);
    }

    public String getWizardName ()
    {
        return wizardName;
    }
    
    public void setWizardName (String n)
    {
        wizardName = n;
    }
    
    public double getHealth ()
    {
        return health;
    }
    
    public void changeHealth (double damagePts)
    {
        //health = health - damagePts;
        health -= damagePts;
    }
    
    public ArrayList <Spell> getBookOfSpells ()
    {
        return spellBook;
    }
    
    public void addSpell(Spell newSpell)
    {
        spellBook.add(newSpell);
    }
    
    public String toString(){
        String returnValue = "Wizard Name: " + wizardName + "\nHealth: " + health + "\n" + wizardName + "'s Spellbook:\n    ";
        
        for (int i=0;i<spellBook.size();i++)
        {
            Spell element = spellBook.get(i);
            returnValue += element;
        }
        
        return returnValue;
    }
}


