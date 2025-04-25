import java.util.ArrayList;
import java.util.Random;
public class Dialogue {
    private static final Random random = new Random();
    private final ArrayList<String[]> characters;

    public Dialogue() {
        characters = new ArrayList<>();

        // Add greetings for each character
        characters.add(new String[]{"Brad", 
        "Hello. I am going to touch you.", 
        "huhehueh what?", 
        "heyyo", 
        "thut up hahah"});
        characters.add(new String[]{"Jasper", 
        "JaspHello1", 
        "JaspHello2", 
        "JaspHello3"});
        characters.add(new String[]{"Cedar", 
        "CedHello1", 
        "CedHello2", 
        "CedHello3"});
        characters.add(new String[]{"BenX", 
        "BenHello1", 
        "BenHello2", 
        "BenHello3"});
        characters.add(new String[]{"Noah",
        "NoahHello1",
        "NoahHello2",
        "NoahHello3"});
        characters.add(new String[]{"Steven",
        "StevenHello1",
        "StevenHello2",
        "StevenHello3"});
        characters.add(new String[]{"Caden",
        "CadenHello1",
        "CadenHello2",
        "CadenHello3"});
    }

    // Get all characters and their greetings
    public ArrayList<String[]> getCharacters() {
        return characters;
    }

    // Get a random greeting for a specific character
    public String getRandomGreeting(String characterName) {
        for (String[] character : characters) {
            if (character[0].equalsIgnoreCase(characterName)) {
                return character[random.nextInt(character.length - 1) + 1]; // Skip the first element (name)
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
