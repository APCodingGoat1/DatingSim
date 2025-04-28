import java.util.ArrayList;
import java.util.Random;
public class Dialogue {
    private static final Random random = new Random();
    private final ArrayList<String[]> greetingsArr;
    private final ArrayList<String[]> tellmeMoreArr;

    public Dialogue() {
        greetingsArr = new ArrayList<>();
        // Add greetings for each character
        greetingsArr.add(new String[]{"Brad", 
        "Hello. I am going to touch you.", 
        "huhehueh what?", 
        "heyyo", 
        "thut up hahah"});
        greetingsArr.add(new String[]{"Jasper", 
        "Hi >.<", 
        "hey *with rizz*", 
        "no"});
        greetingsArr.add(new String[]{"Cedar", 
        "hey", 
        "CedHello2", 
        "CedHello3"});
        greetingsArr.add(new String[]{"BenX", 
        "was up", 
        "was up I am the Ben Xaiver", 
        "BenHello3"});
        greetingsArr.add(new String[]{"Noah",
        "wazz up",
        "i am going to have e sex with you",
        "*high fives*"});
        greetingsArr.add(new String[]{"Steven",
        "StevenHello1",
        "StevenHello2",
        "StevenHello3"});
        greetingsArr.add(new String[]{"Caden",
        "huh?",
        "CadenHello2",
        "CadenHello3"});
        greetingsArr.add(new String[]{"Rohan",
        "RohanHello1",
        "CadenHello2",
        "CadenHello3"});

        tellmeMoreArr = new ArrayList<>();
        // Add tell me more options1 for each character
        tellmeMoreArr.add(new String[]{"Brad", "I know you love me."});
        tellmeMoreArr.add(new String[]{"Jasper", "tellmeMoreJ"});
        tellmeMoreArr.add(new String[]{"Cedar", "tellmeMoreC"});
        tellmeMoreArr.add(new String[]{"BenX", "tellmeMoreB"});
        tellmeMoreArr.add(new String[]{"Noah", "tellmeMoreN"});
        tellmeMoreArr.add(new String[]{"Steven", "tellmeMoreS"});
        tellmeMoreArr.add(new String[]{"Caden", "tellmeMoreC"});
    }

    // Get all characters and their greetings
    public ArrayList<String[]> getGreetingsAll() {
        return greetingsArr;
    }

    // Get a random greeting for a specific character
    public String getRandomGreeting(String characterName) {
        for (String[] g : greetingsArr) {
            if (g[0].equalsIgnoreCase(characterName)) {
                return g[random.nextInt(g.length - 1) + 1]; // Skip the first element (name)
            }
        }
        return "No greetings available for " + characterName;
    }







    /* 
     * public String normGreeting() {
        String[] greetings = {
            "Hi there! It's so nice to meet you!",
            "Hello! You look amazing today!",
            "Hey! I've been waiting to see you!"
        };
        return greetings[random.nextInt(greetings.length)];
    }

    public String greetingBrad() {
        String[] greetingBrad = {
            "Hello. I am going to touch you.",
            "huhehueh what?",
            "heyyo",
            "thut up hahah"
        };
        return greetingBrad[random.nextInt(greetingBrad.length)];
    }
    
    public String greetingJasp() {
        String[] greetingJasp = {
            "Hello1",
            "Hello2",
            "hello3",
        };
        return greetingJasp[random.nextInt(greetingJasp.length)];
    }

    public String greetingCedar() {
        String[] greetingCedar = {
            "Hello1",
            "Hello2",
            "hello3",
        };
        return greetingCedar[random.nextInt(greetingCedar.length)];
    }

    public String greetingBenX() {
        String[] greetingBenX = {
            "Hello1",
            "Hello2",
            "hello3",
        };
        return greetingBenX[random.nextInt(greetingBenX.length)];
    }
    */
}
