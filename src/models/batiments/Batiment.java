package models.batiments;
import models.unites.*;

import java.util.List;

public class Batiment {
    private String name;
    private int niveau;
    private int cout;
    private List<Unites> unitesAssignes;

    public Batiment(String name, int niveau, int cout, List<Unites> unitesAssignes) {
        this.name = name;
        this.niveau = niveau;
        this.cout = cout;
        this.unitesAssignes = unitesAssignes;
    }

    public void product() {
        
    }
    
}
