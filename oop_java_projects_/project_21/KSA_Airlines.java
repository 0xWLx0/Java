package project_21;

public abstract class KSA_Airlines implements Airlines {
    
    private String[] passengerName;
    private int[] passengerID;
    private final int SEATS;
    private int counter;

    public KSA_Airlines(int SEATS) {

        this.SEATS = SEATS;

        passengerName = new String[SEATS];
        passengerID = new int[SEATS];
        counter = 0;

    }

    public abstract void confirmation(int seat);
    
    public boolean booking (int ID, String name) {

        boolean isAvailableSeat = false;

        if(counter < SEATS) {

            passengerName[counter] = name;
            passengerID[counter] = ID;
            confirmation(counter);
            counter++;
            isAvailableSeat = true;

        }

        return isAvailableSeat;

    }

    public String getPassengerName(int seat) {

        return passengerName[seat];

    }

    public int getPassengerID(int seat) {

        return passengerID[seat];

    }

}
