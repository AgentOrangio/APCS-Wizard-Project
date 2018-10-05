

public class Spell
{
    private String spellName; 
    /** instance field variable are created and assigned at different places. (usually) **/
    private double attackRating;
    private double damageRating;
    private double trainingTime;
    private double manaCost;
    

    /**
     * Constructor for objects of class Spell
     */
    public Spell(String name, double aRating, double dRating, double trainTime, double mana)
    {
       spellName = name;
       attackRating = aRating;
       damageRating = dRating;
       trainingTime = trainTime;
       manaCost = mana;//the cost to cast a spell
    }
    
    public String getSpellName()
    {
        return spellName;
    }
    
    /**
     * Create accessors for all the instance field variables
     */
    public double getAttackRating ()
    {
        return attackRating;
    }
    
    public double getDamageRating()
    {
        return damageRating;
    }
    
    public double getTrainingTime()
    {
        return trainingTime;
    }
    
    public double getManacost ()
    {
        return manaCost;
    }
   
    public String toString(){
        String retVal = "Spell name: " + spellName 
                        + "\n       Attack Rating: " + attackRating 
                        + "\n       Damage Rating: " + damageRating 
                        + "\n       Training time for spell: " + trainingTime;
        return retVal;
    }
   
}
