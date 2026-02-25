package models.batiments;
import models.unites.*;
import java.util.List;

public class Maison extends Batiment {
    private int population;
    
    public Maison(String name, int niveau, int cout, List<Unites> unitesAssignes, int population) {
        super(name, niveau, cout, unitesAssignes);
        this.population = population;
    }

}
