package project_11;

public class Astrologer extends Dignitaries {

    private String Iron, Diamomnd, Sold, fire, coal;

    public Astrologer(String villager, String zombie, String Iron, String Diamond, String Sold, String fire, String coal) {

        super.setVillager(villager);
        super.setZombie(zombie);

        this.Iron = Iron;
        this.Diamomnd = Diamond;
        this.Sold = Sold;
        this.fire = fire;
        this.coal = coal;

    }

    public String getIron() {
        return Iron;
    }

    public void setIron(String iron) {
        Iron = iron;
    }

    public String getDiamomnd() {
        return Diamomnd;
    }

    public void setDiamomnd(String diamomnd) {
        Diamomnd = diamomnd;
    }

    public String getSold() {
        return Sold;
    }

    public void setSold(String sold) {
        Sold = sold;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public String getCoal() {
        return coal;
    }

    public void setCoal(String coal) {
        this.coal = coal;
    }

    @Override
    public String toString() {
        return "Astrologer [Iron=" + Iron + ", Diamomnd=" + Diamomnd + ", Sold=" + Sold + ", fire=" + fire + ", coal="
                + coal + "]";
    }

    

}
