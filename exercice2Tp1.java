package onsTp1;

import java.util.Scanner;

public class exercice2Tp1 {

	public static void main(String[] args) {

		Scanner ons=new Scanner(System.in);

		System.out.print("donner une chaine de caractere:");

		String ch=ons.nextLine();

		System.out.print("donner un entier a:");

		int a=ons.nextInt();

		System.out.print("donner un entier b:");

		int b=ons.nextInt();

		

		System.out.print("donner un entier c:");

		int c=ons.nextInt();

		int z=a+b+c;

		int p=a*b*c;

		double m=(a+b+c)/3;

		System.out.println(ch+" "  +"la somme de trois entiers:" +z);

		System.out.println(ch+" "  +"la produit de trois entiers:" +p);

		System.out.println(ch+" "  +"la moyenne de trois entiers:" +m);				

	}

	 

}