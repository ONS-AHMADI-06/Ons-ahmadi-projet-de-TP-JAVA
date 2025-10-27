package exercice4Tp3;
import java.util.Scanner;

public class NotesClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre d'élèves : ");
        int n = sc.nextInt();

        double[] notes = new double[n];
        double somme = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez la note de l'élève " + (i + 1) + " sur 20 : ");
            notes[i] = sc.nextDouble();

            
            somme += notes[i];

            
            if (notes[i] > max) {
                max = notes[i];
            }


            if (notes[i] < min) {
                min = notes[i];
            }
        }

        double moyenne = somme / n;
        System.out.println("\n--- Résultats ---");
        System.out.println("Somme des notes : " + somme);
        System.out.println("Note la plus grande : " + max);
        System.out.println("Note la plus petite : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);
    }
}
