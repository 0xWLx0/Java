package project_21;

import java.util.Scanner;

public class AirlineReservationSystem {

    public static void main(String[] args) throws IllegalClassException {   

        KSA_Airlines FlyNas = new FlyNas("E");
        KSA_Airlines Adeel = new Adeel("A");

        boolean isFlyNasAvailable = true; 
        boolean isAdeelAvailable = true;

        while(isAdeelAvailable || isFlyNasAvailable)
        {
            boolean catchError = false;

            try{

                isFlyNasAvailable = FlyNas.booking(1, "Ali");
                isAdeelAvailable = Adeel.booking(2, "Nasir");

            }
            catch(IllegalClassException illegalClassException) {

                catchError = true;
                System.err.println(illegalClassException);
                break;

            }
            finally {

                if(!catchError)
                    System.out.println("Enjoy your flight!");
                else
                    System.out.println("Please check your class");

         
            }
    
        }

    }

}
