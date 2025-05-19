/**
 * The NPC class represents a non-playable character in the dating simulation game.
 * Each NPC has a name, a love stat, and a relationship status that changes based on the love stat.
 */
public class NPC {
    static String name;
    int loveStat = 0;
    String relation; //changes relative to the loveStat num 


    /**
     * Constructs an NPC with the specified name and initial love stat.
     * The relationship status is initialized based on the love stat.
     *
     * @param name The name of the NPC.
     * @param loveStat The initial love stat of the NPC.
     */
    public NPC(String name, int loveStat) {
        this.name = name;
        this.loveStat = loveStat;
        this.relation = "neutral";
        updateRelation();
    }

    /**
     * Gets the name of the NPC.
     * 
     * @return The name of the NPC.
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the current love stat of the NPC.
     * 
     * @return the current love stat of the NPC.
     */
    public int getloveStat(){
        return loveStat;
    }

    /**
     * Decreases the love stat of the NPC by the specified amount.
     * The relationship status is updated accordingly.
     * 
     * @param amount The amount to decrease the love stat by.
     */
    public void decloveStat(int amount){
        loveStat -= amount;
        updateRelation();
    }

    /**
     * Increases the love stat of the NPC by the specified amount.
     * The relationship status is updated accordingly.
     * 
     * @param amount The amount to increase the love stat by.
     */
    public void incloveStat(int amount){
        loveStat += amount;
        updateRelation();
    }

    /**
     * Updates the relationship status of the NPC based on the current love stat.
     * 
     * 
    */
    private void updateRelation() {
        if (loveStat >= 75) {
            relation = "In love";
        } else if (loveStat >= 50) {
            relation = "friends";
        } else if (loveStat >= 25) {
            relation = "neutral";
        } else if (loveStat >= 0) {
            relation = "enemy";
        } else {
            relation = "hate";
        }
    }

    /**
     * Gets the current relationship status of the NPC.
     * 
     * @return The current relationship status of the NPC.
     */
    public String getRelationship(){
        return relation;
    }

    /**
     * Returns a string representation of the NPC, including its name, love stat, and relationship status.
     * 
     * @return A string representation of the NPC.
     */
    public String toString() {
        return "Name: " + this.name + "\nLove: " + this.loveStat + "\nPersonality: " + this.personality + "\nRelationship: " + this.relation;
    }
}