package project_11;

public class Farm extends Dignitaries {
    
    // instance variables
    private String chicken, lamb, pork;

    public Farm(String person, String chicken, String lamb, String pork) {

        super.setPerson(person);
        this.chicken = chicken;
        this.lamb = lamb;
        this.pork = pork;

    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getLamb() {
        return lamb;
    }

    public void setLamb(String lamb) {
        this.lamb = lamb;
    }

    public String getPork() {
        return pork;
    }

    public void setPork(String pork) {
        this.pork = pork;
    }

    @Override
    public String toString() {
        return "Farm [chicken=" + chicken + ", lamb=" + lamb + ", pork=" + pork + "]";
    }

    

}
