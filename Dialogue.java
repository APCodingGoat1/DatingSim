import java.util.ArrayList;
import java.util.Random;
public class Dialogue {
    private static final Random random = new Random();
    private final ArrayList<String[]> greetingsArr;
    private final ArrayList<String[]> tellmeMoreArr;
    private final ArrayList<String[]> tellMeMoreOptions;
    private final ArrayList<String[]> tellMeMoreResponses;
    private final ArrayList<String[]> characterImages;

    public Dialogue() {
        characterImages = new ArrayList<>();

        // Add image paths for each character - change these paths to the correct paths after all pics are added
        characterImages.add(new String[]{"Brad", "pics/bradpics/brad1.jpg", "pics/bradpics/brad2.jpg", "pics/bradpics/brad3.jpg"});
        characterImages.add(new String[]{"Jasper", "pics/jasperpics/jasper1.jpg", "pics/jasperpics/jasperRizz.jpg"});
        characterImages.add(new String[]{"Cedar", "pics/bradpics/cedarHap.jpg", "pics/bradpics/cedarSad.jpg"});
        characterImages.add(new String[]{"BenX", "pics/benxpics/benxHap.jpg", "pics/benxpics/benxRizz.jpg"});
        characterImages.add(new String[]{"Noah", "pics/ReeseR.jpg", "pics/ReeseR.jpg"});
        characterImages.add(new String[]{"Steven", "pics/ReeseR.jpg", "pics/ReeseR.jpg"});
        characterImages.add(new String[]{"Caden", "pics/ReeseR.jpg", "pics/ReeseR.jpg"});
        characterImages.add(new String[]{"Rohan", "pics/rohanpics/rohanHap.jpg", "pics/rohanpics/rohanRizz.jpg"});

        greetingsArr = new ArrayList<>();
        greetingsArr.add(new String[]{"Brad", 
        "Hello. I am going to touch you.", 
        "huhehueh what?", 
        "heyyo", 
        "thut up hahah"});
        greetingsArr.add(new String[]{"Jasper", 
        "hi man", 
        "im gooning it", 
        "waz up bbg"});
        greetingsArr.add(new String[]{"Cedar", 
        "CedHello1", 
        "CedHello2", 
        "CedHello3"});
        greetingsArr.add(new String[]{"BenX", 
        "was up", 
        "BenHello2", 
        "BenHello3"});
        greetingsArr.add(new String[]{"Noah",
        "NoahHello1",
        "NoahHello2",
        "NoahHello3"});
        greetingsArr.add(new String[]{"Steven",
        "StevenHello1",
        "StevenHello2",
        "StevenHello3"});
        greetingsArr.add(new String[]{"Caden",
        "CadenHello1",
        "CadenHello2",
        "CadenHello3"});
        greetingsArr.add(new String[]{"Rohan",
        "RohanHello1",
        "RohanHello2",
        "RohanHello3"});

        tellmeMoreArr = new ArrayList<>();
        tellmeMoreArr.add(new String[]{"Brad", "heyyo i wike men and beadadoobee."});
        tellmeMoreArr.add(new String[]{"Jasper", "tellMeMoreJ"});
        tellmeMoreArr.add(new String[]{"Cedar", "tellMeMoreC"});
        tellmeMoreArr.add(new String[]{"BenX", "tellMeMoreBX"});
        tellmeMoreArr.add(new String[]{"Noah", "tellMeMoreN"});
        tellmeMoreArr.add(new String[]{"Steven", "tellMeMoreS"});
        tellmeMoreArr.add(new String[]{"Caden", "tellMeMoreC"});
        tellmeMoreArr.add(new String[]{"Rohan", "tellMeMoreR"});

        tellMeMoreOptions = new ArrayList<>();
        tellMeMoreResponses = new ArrayList<>();
        tellMeMoreOptions.add(new String[]{"Brad", "c-c-cool man..", "OMG Me too!!", "i like men", "touch me"});
        tellMeMoreResponses.add(new String[]{"Brad", "What. You don't like men? DIE", "less kwiss", "GAYYYY", "*violates every orifice of your body*"});
        
        tellMeMoreOptions.add(new String[]{"Jasper", "tellMeMoreOption1", "tellMeMoreOption2", "tellMeMoreOption3", "tellMeMoreOption4"});
        tellMeMoreResponses.add(new String[]{"Jasper", "tellMeMoreResponse1", "tellMeMoreResponse2", "tellMeMoreResponse3", "tellMeMoreResponse4"});
        
        tellMeMoreOptions.add(new String[]{"Cedar", "tellMeMoreOption1", "tellMeMoreOption2", "tellMeMoreOption3", "tellMeMoreOption4"});
        tellMeMoreResponses.add(new String[]{"Cedar", "tellMeMoreResponse1", "tellMeMoreResponse2", "tellMeMoreResponse3", "tellMeMoreResponse4"});
        
        tellMeMoreOptions.add(new String[]{"BenX", "tellMeMoreOption1", "tellMeMoreOption2", "tellMeMoreOption3", "tellMeMoreOption4"});
        tellMeMoreResponses.add(new String[]{"BenX", "tellMeMoreResponse1", "tellMeMoreResponse2", "tellMeMoreResponse3", "tellMeMoreResponse4"});
        
        tellMeMoreOptions.add(new String[]{"Noah", "tellMeMoreOption1", "tellMeMoreOption2", "tellMeMoreOption3", "tellMeMoreOption4"});
        tellMeMoreResponses.add(new String[]{"Noah", "tellMeMoreResponse1", "tellMeMoreResponse2", "tellMeMoreResponse3", "tellMeMoreResponse4"});
        
        tellMeMoreOptions.add(new String[]{"Steven", "tellMeMoreOption1", "tellMeMoreOption2", "tellMeMoreOption3", "tellMeMoreOption4"});
        tellMeMoreResponses.add(new String[]{"Steven", "tellMeMoreResponse1", "tellMeMoreResponse2", "tellMeMoreResponse3", "tellMeMoreResponse4"});
        
        tellMeMoreOptions.add(new String[]{"Caden", "tellMeMoreOption1", "tellMeMoreOption2", "tellMeMoreOption3", "tellMeMoreOption4"});
        tellMeMoreResponses.add(new String[]{"Caden", "tellMeMoreResponse1", "tellMeMoreResponse2", "tellMeMoreResponse3", "tellMeMoreResponse4"});
        
        tellMeMoreOptions.add(new String[]{"Rohan", "tellMeMoreOption1", "tellMeMoreOption2", "tellMeMoreOption3", "tellMeMoreOption4"});
        tellMeMoreResponses.add(new String[]{"Rohan", "tellMeMoreResponse1", "tellMeMoreResponse2", "tellMeMoreResponse3", "tellMeMoreResponse4"});

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

    public ArrayList<String[]> getTellMeMoreAll() {
        return tellmeMoreArr;
    }

    public String getTellMeMoreData(String characterName) {
        for (String[] data : tellmeMoreArr) {
            if (data[0].equals(characterName)) {
                return data[1]; // Return the "Tell Me More" data
            }
        }
        return "No additional information available.";


}

public String[] getTellMeMoreOptionsLabels(int characterIndex) {
    return tellMeMoreOptions.get(characterIndex);
}
public String[] getTellMeMoreResponses(int characterIndex) {
    return tellMeMoreResponses.get(characterIndex);
}


public String[] getCharacterImages(String characterName) {
    for (String[] images : characterImages) {
        if (images[0].equals(characterName)) {
            return images; // Return the array containing the character's name and image paths
        }
    }
    return new String[]{"bradpics/bradfinal.jpg"}; // Fallback image - change later?
}

}