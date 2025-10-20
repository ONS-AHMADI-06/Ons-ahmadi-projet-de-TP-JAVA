package onsTp2Exercice1;

import java.util.Scanner;



public class test {

    public static void main(String[] args) {

    	 Scanner input = new Scanner(System.in);

        

        System.out.print("Entrez le rayon du cercle : ");

        double rayon = input.nextDouble();

        cercle c1 = new cercle(rayon);

        System.out.println("Surface du cercle : " + c1.surface());



        System.out.println();

        System.out.print("Entrez la longueur du rectangle : ");

        double longueur = input.nextDouble();

        System.out.print("Entrez la largeur du rectangle : ");

        double largeur = input.nextDouble();



        rectangle r = new rectangle(longueur, largeur);

        System.out.println("Surface du rectangle : " + r.surface());

    }

}
