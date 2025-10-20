package onsTp2Exercice3;
import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez une année : ");
        int annee = input.nextInt(); 
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println(annee + " est une année bissextile.");
        } else {
            System.out.println(annee + " n'est pas une année bissextile.");
        }

       
    }
}