package models;

import java.util.List;

import models.unites.Unites;

public class Ressources {
    private int wood;
    private int stone;
    private int iron;
    private int gold;
    private int food;

    public Ressources(int wood, int stone, int iron, int gold, int food) {
        this.wood = wood;
        this.stone = stone;
        this.iron = iron;
        this.gold = gold;
        this.food = food;
    }

    public int getWood() {
        return wood;
    }
    public int getStone() {
        return stone;
    }
    public int getIron() {
        return iron;
    }
    public int getGold() {
        return gold;
    }
    public int getFood() {
        return food;
    }

   
    public void consume(List<Unites> population){
        for (int i =0; i< population.size();i++ ) {
            food -= 1;
        }
    }
    public void addWood(int newWood) {
        wood += newWood;
    }
    public void addFood(int newFood) {
        food += newFood;
    }
    
}
