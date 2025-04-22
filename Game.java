
public class Game {
    public static void main(String[] args) {
        new GameGUI();

        //VVV Create different NPCs VVV (TEMP FORMAT)
        NPC brad = new love("brad", -100, "a");
        //System.out.println(brad);
        //System.out.println(" ");
        NPC jasper = new NPC("jasper", 100, "b");
        //System.out.println(jasper);
        //System.out.println(" ");
        NPC cedar = new NPC("cedar", 100, "c");
       // System.out.println(cedar);
        //System.out.println(" ");
        NPC benX = new NPC("benX", 100, "d");
        //System.out.println(benX);
        //System.out.println(" ");
        NPC noah = new NPC("noah", 100, "e");
        //^^^ Create different NPCs ^^^ (TEMP FORMAT)

        brad.setloveStat(75);

        System.out.println(brad);
        

    }
}