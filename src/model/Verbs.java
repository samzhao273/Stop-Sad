package model;


import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Verbs {
    private List<String> verbs;


    public Verbs() {
        generateVerb();
    }

    public String generateVerb() throws NullPointerException {
        init();
        Random r = new Random();
        String randomVerb;
        randomVerb = verbs.get(r.nextInt(getHigh()));
        return randomVerb;

    }

    public void init() {
        verbs = Arrays.asList("look very", "is", "will be", "are very", "are", "should be", "will soon be",
                "make me feel", "seem", "are so", "make me feel very");

    }

    public int getHigh() {
        return verbs.size();
    }



}