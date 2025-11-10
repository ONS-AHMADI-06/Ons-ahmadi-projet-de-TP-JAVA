package compte;

import java.util.Scanner;

public class compte {
	
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Donner le solde initial compte1: ");
	        Double soldecmpt = sc.nextDouble();
	        Double s2=900.0;

	        compte c1 = new compte(soldecmpt);
	        compte c2 = new compte(s2);
	        
	        c1.afficher();
	        c2.afficher2();

	        System.out.print("Montant à déposer compte1 : ");
	        Double dep = sc.nextDouble();
	        c1.deposer(dep);
	        c1.afficher();

	        System.out.print("Montant à retirer compte1: ");
	        Double ret = sc.nextDouble();
	        c1.retirer(ret);
	        c1.afficher();
	        
	        System.out.print("a3tiini el montant li bech taba3tho l compte 2: ");
	        Double ver = sc.nextDouble();
	        if (ver <= soldecmpt) {
	        	s2 += ver;
	        	c2.deposer(ver);
	        	c1.retirer(ver);
	            System.out.println("Dépôt de compte2 : " + s2 + " TND");
	            System.out.print("Montant à retirer compte1: " + soldecmpt);
	         
	        } else {
	        	System.out.println("Solde li hatito lezem ikoun asgher men montant l mawjoud fel compte2 !" );
	        }

	        sc.close();
	    }

    Double solde;
    Double ver;


    public compte(Double solde) {
        this.solde = solde;
    }
   

    public void deposer(Double montant) {
        if (montant >= 0.0) {
        	this.solde += montant;
            System.out.println("Dépôt : " + montant + " TND");
         
        } else {
        	System.out.println("Solde li hatito lezem ikoun akber men 0.0!" );
        }

    }

    public void retirer(Double montant) {
        if (montant <= this.solde) {
            this.solde -= montant;
            System.out.println("Retrait : " + montant + " TND");
        } else {
            System.out.println("Solde ma ykafich !" + montant + " alakhater aandek fel compte: " + this.solde );
        }
    }

    public void afficher() {
        System.out.println("Solde actuel du compte1 : " + this.solde + " TND");
    }
    public void afficher2() {
        System.out.println("Solde actuel du compte2 : " + this.solde + " TND");
    }
   
}
