import models.Ressources;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) throws NumberFormatException {
        System.out.print(prompt);
        String input = scanner.nextLine();
        int result = Integer.parseInt(input);
        return result;
    }

    public static void main(String[] args) {


        
        
        Ressources r = new Ressources(100, 100, 100, 100, 100);

        while (true) {


            menu(scanner, r);


        }

    }

    public static void menu(Scanner scanner, Ressources r) {

    
    
    System.out.print("\n| Bois : " + r.getWood());
    System.out.print(" || Pierre : " + r.getStone());
    System.out.print(" || Fer : " + r.getIron());
    System.out.print(" || Or : " + r.getGold());
    System.out.println(" || Nourriture : " + r.getFood());
    
    System.out.println("\nChoisissez une action parmi les suivantes :");

    System.out.println("1 - Détails du village");
    System.out.println("2 - Construire un batîment");
    System.out.println("3 - Recruter une unité");
    System.out.println("4 - Assigner une unité");
    System.out.println("5 - Equiper une unité");
    System.out.println("6 - Former une unité à la caserne");
    System.out.println("7 - Désassigner une unité");
    System.out.println("8 - Améliorer un batîment");
    System.out.println("9 - Passer au jour suivant");
    System.out.println("10 - Quitter le jeu");

    try {
        int userChoice = readInt("Votre choix : ");
        switch (userChoice) {
            case 1:
                System.out.println("1 - Détails du village");
            case 2:
                System.out.println("2 - Construire un batîment");
                // Menu de construction
            case 3:
                System.out.println("3 - Recruter une unité");
    
            case 4:
                System.out.println("4 - Assigner une unité");
            
            case 5:
                System.out.println("5 - Equiper une unité");
            
            case 6:
                System.out.println("6 - Former une unité à la caserne");
              
            case 7:
                System.out.println("7 - Désassigner une unité");
               
            case 8:
                System.out.println("8 - Améliorer un batîment");
           
            case 9:
                System.out.println("9 - Passer au jour suivant");
                
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

    public static void menuConstruction() {

    }

}