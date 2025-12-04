package Vehicule;

public class Main {
    public static void main(String[] args) {

        Camion c = new Camion("150-TN-888", "Mercedes", 5000);
        c.demarrer();
        c.accelerer(40);
        c.charger(2000);
        c.charger(4000); // surcharge
        c.freiner(20);
        c.arreter();

        System.out.println("---------------");

        Bus b = new Bus("90-TN-450", "Volvo", 60);
        b.demarrer();
        b.monter(30);
        b.monter(40); // bus plein
        b.descendre(10);
        b.accelerer(50);
        b.freiner(20);
        b.arreter();
    }
}
