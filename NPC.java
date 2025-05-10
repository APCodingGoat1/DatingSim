public class NPC {
    static String name;
    int loveStat = 0;
    String relation; //changes relative to the loveStat num 

    public NPC(String name, int loveStat) {
        this.name = name;
        this.loveStat = loveStat;
        this.relation = "neutral";
        updateRelation();
    }

    public String getName(){
        return name;
    }

    public int getloveStat(){
        return loveStat;
    }
    public void decloveStat(int amount){
        loveStat -= amount;
        updateRelation();
    }

    public void incloveStat(int amount){
        loveStat += amount;
        updateRelation();
    }

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

    public String getRelationship(){
        return relation;
    }


    public String toString() {
        return "Name: " + this.name + "\nLove: " + this.loveStat + "\nPersonality: " + this.personality + "\nRelationship: " + this.relation;
    }
}