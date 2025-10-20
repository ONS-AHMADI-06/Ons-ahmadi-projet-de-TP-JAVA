package onsTp2Exercice4;
import java.util.Scanner;
public class calculatrice {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double a = input.nextDouble();

        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
        char operateur = input.next().charAt(0); 

        System.out.print("Entrez le deuxième nombre : ");
        double b = input.nextDouble();
        double resultat = 0;
        boolean operationValide = true;
        switch (operateur) {
            case '+':
                resultat = a + b;
                break;
            case '-':
                resultat = a - b;
                break;
            case '*':
                resultat = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultat = a / b;
                } else {
                    System.out.println("Erreur : Division par zéro !");
                    operationValide = false;
                }
                break;
            default:
                System.out.println("Erreur : Opérateur invalide !");
                operationValide = false;
        }
        if (operationValide) {
            System.out.println("Résultat : " + a + " " + operateur + " " + b + " = " + resultat);
        }
    }
}