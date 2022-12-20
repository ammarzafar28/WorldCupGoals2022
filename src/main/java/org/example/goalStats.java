package org.example;

import java.util.Scanner;

public class goalStats {

    private String name;
    private String country;
    private int goals;

    public goalStats() {
        this.name = name;
        this.country = country;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    // takes user input of player name and returns country and goals
    public void playerName(String player){
        Scanner obj = new Scanner(System.in);
        System.out.println( "Enter a player name from the 2022 World Cup: " );
        String name = obj.nextLine();


    }

    // takes user input of country and returns all the players who scored goals for that country
    public void countryName(String nation){
        Scanner obj = new Scanner(System.in);
        System.out.println( "Enter a country that contended in the 2022 World Cup: ");
        String country = obj.nextLine();
    }
}
