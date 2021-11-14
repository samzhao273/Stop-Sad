package model;


import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Adjectives {
    private List<String> adjectives;

    public Adjectives() {

        generateAdjective();
    }

    public String generateAdjective() throws NullPointerException {
        init();
        Random r = new Random();
        String randomAdjective;
        randomAdjective = adjectives.get(r.nextInt(getHigh()));
        return randomAdjective;
    }

    public void init() {
        adjectives = Arrays.asList("big!!!", "great!", "thicc :)", "happy :D", "smart <3", "wise ;)", "a bold one",
                "my favourite person", "loved", "needed", "cool :P", "nice", "high iq", "intelligent",
                "successful", "good", "nuts", "funny", "extravagant", "not dumb", "not toxic", "not low iq",
                "generous");

    }

    public int getHigh() {
        return adjectives.size();

    }



}

