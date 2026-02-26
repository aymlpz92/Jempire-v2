package models;
import models.batiments.Batiment;
import models.batiments.Maison;
import models.unites.Unites;
import models.unites.Villageois;

import java.util.ArrayList;
import java.util.List;

public class Village {
  List<Unites> population;
  List<Batiment> batiments;
  Villageois villageois = new Villageois("Paul", 10, false, null, false);
  Ressources r = new Ressources(100, 100, 100, 100, 100);
  Maison maison = new Maison("maison", 1);

  public Village(List<Unites> population, List<Batiment> batiments) {
      this.population = population;
      this.batiments = batiments;
    }

    public void displayRessources() {
        System.out.print("\n| Bois : " + r.getWood());
        System.out.print(" || Pierre : " + r.getStone());
        System.out.print(" || Fer : " + r.getIron());
        System.out.print(" || Or : " + r.getGold());
        System.out.println(" || Nourriture : " + r.getFood());
    }

    public void displayBatiments() {
        System.out.println("Batiments : " + maison.getName());
    }

    public void nextDay(){
        villageois.collecte(r);
    }
    public void construction (){
      Maison maison = new Maison("maison", 1);// deplacer dans maison et crée une construction dans batiment et override construction dans toutes les classe 
      batiments.add(maison);
      r.setWood(r.getWood() - 20);
  }

    public void afficherDetails(){
        for (Batiment batiment : batiments) {
            System.out.println(batiment.getName());
            System.out.println("a");
        }
        System.out.println("");
        
    }

    public boolean isGameOver(){
        return false;
    }
}
