public class NPC {
    private String name;
    private int loveStat = 0;
    //private String relationship <-- relative to loveStat idk how but make it work
    public NPC(String name, int loveStat) {
        this.name = name;
        this.loveStat = loveStat;
    }

    public String getName(){
        return name;
    }
    public int getloveStat(){
        return loveStat;
    }

    private void setName(String name){
        this.name = name;
    }
    public void setloveStat(int loveStat){
        this.loveStat = loveStat;
    }

    public String toString() {
        return "Name: " + this.name + "\nLove: " + this.loveStat;
    }

}