package project_21;

public class IllegalClassException extends RuntimeException {
    
    public IllegalClassException() {

        this("Unknown class\n\nAvailable classes:\nA\nB\nC");

    }
    
    public IllegalClassException(String message) {

        super(message);

    }

}
