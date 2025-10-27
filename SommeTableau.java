package exercice3Tp3;
import java.util.Scanner;

public class SommeTableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] tableau = new int[n];

        
        for (int i = 0; i < n; i++) {
            int somme = 0;
            for (int j = 0; j <= i; j++) {
                somme += j; 
            }
            tableau[i] = somme;
        }

        
        System.out.println("Tableau des sommes :");
        for (int i = 0; i < n; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}
