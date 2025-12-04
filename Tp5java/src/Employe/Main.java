package Employe;

public class Main {
    public static void main(String[] args) {

        Entreprise ent = new Entreprise();

        Employe e1 = new Employe("Ali", 101, 12000);
        Employe e2 = new Employe("Sana", 102, 11000);

        Cadre c1 = new Cadre("Mourad", 201, 20000);
        Cadre c2 = new Cadre("Hana", 202, 21000);

        c1.ajouterEmploye(e1); // Ali dépend du cadre Mourad
        c2.ajouterEmploye(e2); // Sana dépend de Hana

        ent.ajouterEmploye(e1);
        ent.ajouterEmploye(e2);
        ent.ajouterEmploye(c1);
        ent.ajouterEmploye(c2);

        System.out.println("Nombre de cadres = " + ent.getNombreCadres());
        System.out.println("Nombre de non-cadres = " + ent.getNombreNonCadres());

        System.out.println("Employés au bureau 101 : " + ent.getEmployesParBureau(101));

        System.out.println("Cadres responsables de Ali : " + ent.getCadresResponsables("Ali"));

        System.out.println("Salaire moyen cadres = " + ent.getSalaireMoyenCadres());
        System.out.println("Salaire moyen non-cadres = " + ent.getSalaireMoyenNonCadres());
    }
}
