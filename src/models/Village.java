package models;
import models.batiments.Batiment;
import models.unites.Unites;
import java.util.List;

public class Village {
  private  List<Unites> population;
  private  List<Batiment> batiments;
  private  Ressources ressources;

  public Village(List<Unites> population, List<Batiment> batiments, Ressources ressources) {
      this.population = population;
      this.batiments = batiments;
      this.ressources = ressources;
    }

    public void nextDay(){
        //production consommations
    }

    public void afficherDetails(){
        // afficher liste unite batiment et ressources 
    }

    public boolean isGameOver(){
        return false;
    }
}
