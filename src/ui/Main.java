package ui;


public class Main {
    public static void main(String[] args) {
        try{
            new PositivePhrasesGUI();
        } catch (NullPointerException e) {
            System.out.println("Unable to run application, a component has a null size");

        }
    }
}
