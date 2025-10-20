package onsTp2Exercice2;

import java.util.Scanner;

public class pairImpair {

	public static void main(String[]args) {

		 Scanner objet= new Scanner(System.in);

		 System.out.print("Entrez un nombre entier : ");

		 if (objet.hasNextInt()) {

	            int nombre = objet.nextInt(); 

	            System.out.println("Vous avez saisi : " + nombre);

	            if (nombre % 2 == 0) {

	                System.out.println("Le nombre est pair.");

	            } else {

	                System.out.println("Le nombre est impair.");

	            }

	        } else {

	        	System.out.println("Erreur, Vous devez entrer un nombre entier ");

	        }
	}

}