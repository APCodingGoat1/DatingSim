import java.util.Random;
public class Dialogue {
    private static final Random random = new Random();

    public Dialogue() {
        
    }

    public String normGreeting() {
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
    
}
