package models.batiments;
import models.unites.*;
import java.util.List;

public class Maison extends Batiment {
    private int population;
    
    public Maison(String name, int niveau) {
        super(name, niveau);
       
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    public String getName(){
        return name ;
    }
}
