package project_14;

public class Tester {

    public static void main(String[] args) {

        Deliverable[] deliverable = new Deliverable[2];

        Envelope envelope = new Envelope<String>("Ahmed", 12, "1244-23", "A4");
        Parcel parcel = new Parcel<Integer>("Norah", 500, 12345, 10, 3, 5);

        deliverable[0] = envelope;
        deliverable[1] = parcel;

        for (Deliverable element : deliverable) {

            System.out.println(element);

        }

    }

}
