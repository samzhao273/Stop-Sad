package model;


public class Phrases {
    private Nouns noun;
    private Adjectives adjective;
    private Verbs verb;

    public Phrases() {
        noun = new Nouns();
        adjective = new Adjectives();
        verb = new Verbs();
        generatePhrase();
    }

    public String generatePhrase() {
        try {
            return (noun.generateNoun() + " " +
                    verb.generateVerb() + " " +
                    adjective.generateAdjective());
        } catch (NullPointerException e) {
            System.out.println("one of the components are null");
        }
        return null;
    }


}

