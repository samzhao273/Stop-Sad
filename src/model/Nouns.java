package model;


import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Nouns {
    private List<String> nouns;

    public Nouns() {
        generateNoun();
    }

    public String generateNoun() throws NullPointerException {
        init();
        Random r = new Random();
        String randomVerb;
        randomVerb = nouns.get(r.nextInt(getHigh()));
        return randomVerb;
    }

    public void init() {
        nouns = Arrays.asList("Hey there. You", "Oh hey, you", "Hello, you", "Did you know that you", "You",
                "General Kenobi... You", "Hello There, you", "Oh Hey I didn't see you there, you",
                "what's up, beautiful, you", "Just wanted to let you know that you", "Heyooooooooooooo thou",
                "What's up, you");

    }

    public int getHigh() {
        return nouns.size();

    }



}