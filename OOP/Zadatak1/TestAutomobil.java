package domaci6;

public class TestAutomobil {

    public static void main(String[] args) {

        Covek vlasnik1 = new Covek("Marko", "Markovic");
        Covek vlasnik2 = new Covek("Ivan", "Ivanovic");
        Covek vlasnik3 = new Covek();

        Automobil auto1 = new Automobil(new Covek("Marko", "Markovic"));
        Automobil auto2 = new Automobil(vlasnik2);
        Automobil auto3 = new Automobil(vlasnik3);

        auto2.getVlasnik().setIme("Nikola");
        System.out.println(auto2);



    }




}
