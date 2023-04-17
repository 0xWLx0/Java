package project_11;

public class Dignitaries {
    
    // instance variables
    private String person, villager, zombie;

    public Dignitaries() {

        this(null, null, null);

    }

    public Dignitaries(String person, String villager, String zombie) {

        this.person = person;
        this.villager = villager;
        this.zombie = zombie;

    }


    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getVillager() {
        return villager;
    }

    public void setVillager(String villager) {
        this.villager = villager;
    }

    public String getZombie() {
        return zombie;
    }

    public void setZombie(String zombie) {
        this.zombie = zombie;
    }    

}
