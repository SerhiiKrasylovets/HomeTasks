package com.company;

/**
 * Created by Sergey on 12/15/2015.
 */
public class Girl {
        double weight, height;
        String eyesColor, hairColor, prefersRestaurants;

        Girl(double height, double weight, String eyesColor, String hairColor, String prefersRestaurants){
            this.weight = weight;
            this.height = height;
            this.eyesColor = eyesColor;
            this.hairColor = hairColor;
            this.prefersRestaurants = prefersRestaurants;}

    String about (){
        String p;
        if (height - weight > 100 ) p = "looks nice";
        else p = "needs workout";
        return p;}

    String describe(){
        String e = eyesColor;
        String h = hairColor;
        return "Her eyes are " + e + " and hair is " + h + ". ";}

    String cinema (){
        String ci = "agree";
        return ci;}

    String cuisine () {
        String cu;
        if (prefersRestaurants == "McDonald's") cu = "disagree";
        else cu = "agree";
        return cu;}
}

class ChooseGirl{
    public static void main(String[] args) {

        Girl Stacy = new Girl(170, 65, "blue", "blonde", "McDonald's");
        Girl Anne = new Girl(175, 90, "green", "red", "Churrasco");

        String p, ci, cu, de;

        p = Stacy.about();
        ci = Stacy.cinema();
        cu = Stacy.cuisine();
        de = Stacy.describe();
        System.out.println("Stacy " + p + ". " + de + "Stacy will " + ci + " to go to the cinema and " + cu + " to go to " + Stacy.prefersRestaurants + ".");

        p = Anne.about();
        ci = Anne.cinema();
        cu = Anne.cuisine();
        de = Anne.describe();
        System.out.println("\n" + "Anne " + p + ". " + de + "Anne will " + ci + " to go to the cinema and " + cu + " to go to " + Anne.prefersRestaurants + ".");

    }
}