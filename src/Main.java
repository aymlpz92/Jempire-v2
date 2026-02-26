import models.Ressources;
import models.Village;
import models.batiments.*;
import models.unites.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Village village;
    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) throws NumberFormatException {
        System.out.print(prompt);
        String input = scanner.nextLine();
        int result = Integer.parseInt(input);
        return result;
    }

    public static void main(String[] args) {
        Ressources ressources = new Ressources(100, 100, 100, 100, 100);
        village = new Village(new ArrayList<>(), new ArrayList<>(), ressources);
        village.ajouterUnite(1);

        menu(scanner);

    }

    public static void menu(Scanner scanner) {
        boolean exit = false;
        do {
            village.displayRessources();
            village.displayBatiments();

            System.out.println("\nChoisissez une action parmi les suivantes :");

            System.out.println("1 - Détails du village");
            System.out.println("2 - Construire un batîment");
            System.out.println("3 - Recruter une unité");
            System.out.println("4 - Assigner une unité");
            System.out.println("5 - Equiper une unité");
            System.out.println("6 - Former une unité à la caserne");
            System.out.println("7 - Désassigner une unité");
            System.out.println("8 - Améliorer un batîment");
            System.out.println("9 - Passer au jour suivant");// compteur de jours, methodes consumes, production
            System.out.println("0 - Quitter le jeu");

            try {
                int userChoice = readInt("Votre choix : ");
                switch (userChoice) {
                    case 1:
                        System.out.println("1 - Détails du village");
                        village.afficherDetails();
                        break;
                    case 2:
                        System.out.println("2 - Construire un batîment");
                        menuConstru();
                        break;
                    case 3:
                        System.out.println("3 - Recruter une unité");
                        menuRecruter();
                        break;
                    case 4:
                        System.out.println("4 - Assigner une unité");
                        break;
                    case 5:
                        System.out.println("5 - Equiper une unité");
                        break;
                    case 6:
                        System.out.println("6 - Former une unité à la caserne");
                        break;
                    case 7:
                        System.out.println("7 - Désassigner une unité");
                        break;
                    case 8:
                        System.out.println("8 - Améliorer un batîment");
                        break;
                    case 9:
                        System.out.println("9 - Passer au jour suivant");
                        village.nextDay();
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.err.println("Veuillez choisir une option valide\n");
                }

            } catch (NumberFormatException e) {
                System.err.println("Erreur de saisie\n");
            }
        } while (!exit);

    }

    public static void menuConstru() {
        Batiment batiment = null;
        boolean exit = false;
        do {
            System.out.println("\nQuelle batiment voulez vous construire");
            System.out.println("1 - Construire une maison \t|Bois : 10");
            System.out.println("2 - Construire une mine   \t|Bois : 20");
            System.out.println("3 - Construire une ferme  \t|Bois : 20 |Pierre : 5");
            System.out.println("4 - Construire une caserne\t|Bois : 20 |Pierre : 10 | Fer : 5");
            System.out.println("5 - Construire un atelier \t|Bois : 15 |Pierre : 15 | Fer : 10");
            System.out.println("6 - Construire un mur     \t|Bois : 25 |Pierre : 20 | Fer : 10");
            System.out.println("0 - Retour");

            try {

                int userSubChoice = readInt("Votre choix : ");
                switch (userSubChoice) {
                    case 1:
                        batiment = Maison.construction(village.getRessources());
                        break;

                    case 2:
                        batiment = Mine.construction(village.getRessources());
                        break;
                    case 3:
                        batiment = Ferme.construction(village.getRessources());
                        break;
                    case 4:
                        batiment = Caserne.construction(village.getRessources());
                        break;

                    case 5:
                        batiment = Atelier.construction(village.getRessources());
                        break;

                    case 6:
                        batiment = Mur.construction(village.getRessources());
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.err.println("Veuillez choisir une option valide\n");
                        break;
                }

                if (batiment != null) {
                    village.ajouterBatiment(batiment);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } while (batiment == null && !exit);
    }

    public static void menuRecruter() {
        Unites unite = null;
        boolean exit = false;
        do {
            System.out.println("\nQuelle unité voulez vous recruter ?");
            System.out.println("1 - Villageois \t|Bois : 10");
            System.out.println("2 - Artisan    \t|Bois : 20     (Atelier recquis)");
            System.out.println("0 - Retour");

            try {

                int userSubChoice = readInt("Votre choix : ");
                switch (userSubChoice) {
                    case 1:
                        unite = village.ajouterUnite(1);
                        break;

                    case 2:
                        unite = village.ajouterUnite(2);
                        break;

                    case 0:
                        exit = true;
                        break;
                    default:
                        System.err.println("Veuillez choisir une option valide\n");
                        break;
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } while (unite == null && !exit);
    }

}