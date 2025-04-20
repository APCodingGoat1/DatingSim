public class NPC {
    String name;
    int loveStat = 0;
    String personality;
    String relation; //changes relative to the loveStat num 

    public NPC(String name, int loveStat, String personality) {
        this.name = name;
        this.loveStat = loveStat;
        this.personality = personality;
        this.relation = "neutral";
        updateRelation();
    }

    public String getName(){
        return name;
    }
    private void setName(String name){
        this.name = name;
    }

    public int getloveStat(){
        return loveStat;
    }
    public void setloveStat(int loveStat){
        this.loveStat = loveStat;
        updateRelation();
    }

    private void updateRelation() {
        if (loveStat >= 75) {
            relation = "In love";
        } else if (loveStat >= 50) {
            relation = "friends";
        } else {
            relation = "neutral";
        }
    }

    public String getPersonality(){
        return personality;
    }
    private void setPersonality(String personality){
        this.personality = personality;
    }

    public String getRelationship(){
        return relation;
    }
    private void setRelation(String relation){
        this.relation = relation;
    }


    public String toString() {
        return "Name: " + this.name + "\nLove: " + this.loveStat + "\nPersonality: " + this.personality + "\nRelationship: " + this.relation;
    }
}