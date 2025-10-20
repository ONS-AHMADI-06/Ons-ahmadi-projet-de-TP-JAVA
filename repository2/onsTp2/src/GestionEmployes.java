package nouveauExerecice2;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmployes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        ArrayList<Double> salaires = new ArrayList<>();
        ArrayList<String> noms = new ArrayList<>();

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== Saisie d'un nouvel employé ===");
            
            System.out.print("Nom : ");
            String nom = input.nextLine();

            System.out.print("Prénom : ");
            String prenom = input.nextLine();

            System.out.print("Âge : ");
            int age = input.nextInt();

            System.out.print("Salaire : ");
            double salaire = input.nextDouble();
            input.nextLine(); 

            
            noms.add(nom + " " + prenom);
            salaires.add(salaire);

            
            System.out.print("Voulez-vous ajouter un autre employé ? (oui/non) : ");
            String reponse = input.nextLine().toLowerCase();

            if (!reponse.equals("oui")) {
                continuer = false;
            }
        }

        
        System.out.println("\n=== Liste des employés saisis ===");
        for (int i = 0; i < noms.size(); i++) {
            System.out.println((i + 1) + ". " + noms.get(i) + " | Salaire : " + salaires.get(i));
        }

        
        double maxSalaire = salaires.get(0);
        String nomMax = noms.get(0);

        for (int i = 1; i < salaires.size(); i++) {
            if (salaires.get(i) > maxSalaire) {
                maxSalaire = salaires.get(i);
                nomMax = noms.get(i);
            }
        }

        
        System.out.println("\n💰 L'employé avec le salaire le plus élevé est : " + nomMax + " (" + maxSalaire + " DT)");

        
    }}
