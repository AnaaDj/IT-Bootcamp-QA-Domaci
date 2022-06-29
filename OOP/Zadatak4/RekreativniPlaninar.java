package Domaci8.Zadatak2;

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;
    private String okrugRekreativca;
    private int maxUsponBezOpreme;

    public RekreativniPlaninar(int identifikacioniBroj, String ime, String prezime, int tezinaOpreme, String okrugRekreativca, int maxUsponBezOpreme) {
        super(identifikacioniBroj, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrugRekreativca = okrugRekreativca;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }


    public RekreativniPlaninar() {
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrugRekreativca() {
        return okrugRekreativca;
    }

    public int getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }

    @Override
    public void stampaj() {
    }

    @Override
    public int clanarina() {
        return 1000;
    }

    public int usponSaOpremom () {
        int usponSaOpremom = maxUsponBezOpreme - (tezinaOpreme * 50);
        return usponSaOpremom;
    }

    @Override
    public String uspesanUspon(Planina p) {
        if (usponSaOpremom() > p.getVisina()) {
            return "Uspesno";
        } return "Neuspesno";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rekreativac, id: ").append(getIdentifikacioniBroj()).append("\n");
        sb.append("Ime: ").append(getIme()).append(" ").append(getPrezime()).append("\n");
        sb.append("Okrug: ").append(getOkrugRekreativca());
        return sb.toString();
    }
}
