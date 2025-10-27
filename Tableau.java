package exercice1etexercice2Tp3;

import java.util.Arrays;     
import java.util.Scanner;  
public class Tableau{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tableau = new int[5];
        System.out.println("Entrez 5 nombres entiers :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            tableau[i] = input.nextInt();
        }
        System.out.println("\nContenu du tableau avant tri :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }

       
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = 0; j < tableau.length - 1 - i; j++) {
                if (tableau[j] > tableau[j + 1]) {
                    int temp = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = temp;
                }
            }
        }

        System.out.println("\nContenu du tableau après tri croissant :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }

        
        System.out.print("\nEntrez un entier à rechercher : ");
        int nombre = input.nextInt();
        int indiceTrouve = -1;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nombre) {
                indiceTrouve = i; 
            }
        }

        
        if (indiceTrouve != -1) {
            System.out.println("Le nombre " + nombre + " se trouve à l’indice : " + indiceTrouve);
        } else {
            System.out.println("Le nombre " + nombre + " n’existe pas dans le tableau.");
        }

    }
}