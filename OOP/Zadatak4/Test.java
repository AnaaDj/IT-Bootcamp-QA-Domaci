package Domaci8.Zadatak2;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {

        Planina p = new Planina("Durmitor","Crna Gora",2300);

        RekreativniPlaninar r = new RekreativniPlaninar(1,"Marko", "Markovic", 2,
                "Sumadijski", 200);
        RekreativniPlaninar r1 = new RekreativniPlaninar(3,"Marina", "Markovic", 2,
                "Sumadijski", 1000);
        RekreativniPlaninar r2 = new RekreativniPlaninar(4,"Ivana", "Markovic", 2,
                "Sumadijski", 3000);



        Alpinista a = new Alpinista(2,"Ivan","Ivanovic",10);
        Alpinista a1 = new Alpinista(5,"Ivana","Ivanovic",20);
        Alpinista a2 = new Alpinista(6,"Iva","Ivanovic",5);



        ArrayList <Planinar> sviPlaninari = new ArrayList<>();
        sviPlaninari.add(r);
        sviPlaninari.add(r1);
        sviPlaninari.add(r2);
        sviPlaninari.add(a);
        sviPlaninari.add(a1);
        sviPlaninari.add(a2);

        for (int i = 0; i < sviPlaninari.size(); i++) {
            System.out.println(sviPlaninari.get(i));
            System.out.println(sviPlaninari.get(i).uspesanUspon(p));
            System.out.println(sviPlaninari.get(i).clanarina());
            System.out.println("///////////////");
            System.out.println();

        }
        int suma0 = 0;
        for (int i = 0; i < sviPlaninari.size(); i++) {
            suma0 = suma0 + sviPlaninari.get(i).clanarina();
        }
        System.out.println("Suma clanarina je: " + suma0);

    }
    }


