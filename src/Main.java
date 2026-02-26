import models.Ressources;
import models.Village;
import models.unites.Villageois;

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
        village = new Village(new ArrayList<>(), new ArrayList<>());

        while (true) {

            menu(scanner);

        }

    }

    public static void menu(Scanner scanner) {

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
                    afficherMenuConstru();
                    break;
                case 3:
                    System.out.println("3 - Recruter une unité");
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
                case 10:
                    System.out.println("10 - Quitter le jeu");
                    break;
                default:
                    System.err.println("Veuillez choisir une option valide\n");
            }

        } catch (NumberFormatException e) {
            System.err.println("Erreur de saisie\n");
        }

    }

    public static void afficherMenuConstru() {
        System.out.println("\nQuelle batiment voulez vous construire");
        System.out.println("1 - Construire une maison \t|Bois : 10");
        System.out.println("2 - Construire une mine   \t|Bois : 20");
        System.out.println("3 - Construire une ferme  \t|Bois : 20 |Pierre : 5");
        System.out.println("4 - Construire une caserne\t|Bois : 20 |Pierre : 10 | Fer : 5");
        System.out.println("5 - Construire un atelier \t|Bois : 15 |Pierre : 15 | Fer : 10");
        System.out.println("6 - Construire un mur     \t|Bois : 25 |Pierre : 20 | Fer : 10");
        try {

            int userSubChoice = readInt("Votre choix : ");

            switch (userSubChoice) {
                case 1:
                    village.construction();

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                default:
                    System.err.println("Veuillez choisir une option valide\n");
                    break;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

}