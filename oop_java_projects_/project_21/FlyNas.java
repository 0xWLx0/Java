package project_21;

public class FlyNas extends KSA_Airlines {

    private final String flightClass;

    public FlyNas() {

        super(10);
        flightClass = "C";

    }

    public FlyNas(String flightClass) {

        super(10);

        this.flightClass = flightClass.substring(0).toUpperCase();

    }

    @Override
    public String flightClass() {

        return flightClass;

    }

    @Override
    public double flightCost() throws IllegalClassException {

        double result = 0.0;

        switch(flightClass) {

            case "A":
                result = 'C' * 10;
                break;
            
            case "B": 
                result = 'B' * 10;
                break;

            case "C":
                result = 'A' * 10;
                break;
            
            default:
                throw new IllegalClassException();

        }

        return result;

    }

    @Override
    public void confirmation(int seat) {

        System.out.printf("FlyNas: Congrats, %s your flight is booked successfully with FlyNas and your seat number is: %d%nClass %s%nCost: %.2f%n", super.getPassengerName(seat), (seat + 1), flightClass, flightCost());

    }

}
