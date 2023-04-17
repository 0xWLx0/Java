package project_6;

public class Employees {

    // instance variables
    private String F_name;
    private String L_name;
    private String ID;
    private int years_exp;

    // constructor
    Employees(String F_name, String L_name, String ID, int years_exp) {

        this.F_name = F_name;
        this.L_name = L_name;
        this.ID = ID;
        this.years_exp = years_exp;

    }

    // get the level
    public String level (int years_exp) {

        if(years_exp > 5)
            return "High level";

        return "Medium level";

    }

    // seters and geters
    
    public void setFName(String F_name) {

        this.F_name = F_name;

    }
    
    public String getFName() {

        return F_name;

    }

    public void setLName(String L_name) {

        this.L_name = L_name;

    }
    
    public String getLName() {

        return L_name;

    }

    public void setID(String ID) {

        this.ID = ID;

    }
    
    public String getID() {

        return ID;

    }

    public void setYearsExp(int years_exp) {

        this.years_exp = years_exp;

    }
    
    public int getYearsExp() {

        return years_exp;

    }
    
}
