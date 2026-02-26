package models.batiments;
import models.Ressources;
import models.unites.*;

import java.util.List;

public class Batiment {
    protected String name;
    protected int niveau;
    protected List<Unites> unitesAssignes;

    public Batiment(String name, int niveau) {
        this.name = name;
        this.niveau = niveau;
    }

    public Batiment(String name, int niveau, List<Unites> unitesAssignes) {
        this(name, niveau);
        this.unitesAssignes = unitesAssignes;
    }

    public void product() {
        
    }

    public String getName() {
        return name;
    }

    public int getNiveau() {
        return niveau;
    }

    public List<Unites> getUnitesAssignes() {
        return unitesAssignes;
    }
    
    public static Batiment construction(Ressources resources) {
        return null;
    }
}
