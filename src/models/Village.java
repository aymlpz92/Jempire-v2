package models;
import models.batiments.Batiment;
import models.unites.Unites;
import models.unites.Villageois;

import java.util.List;

public class Village {
  private  List<Unites> population;
  private  List<Batiment> batiments;
  Villageois villageois = new Villageois(null, 0, false, null, false);
  Ressources r = new Ressources(100, 100, 100, 100, 100);

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

    public void nextDay(){
        villageois.collecte(r);
    }

    public void afficherDetails(){
        // afficher liste unite batiment et ressources 
    }

    public boolean isGameOver(){
        return false;
    }
}
