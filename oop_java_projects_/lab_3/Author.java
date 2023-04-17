package lab_3;

public class Author {

    // instance variables
    private final String name;
    private final String email;

    public Author() {

        this(null, null);

    }

    public Author(String name, String email) {

        this.name = name;
        this.email = email;

    }

    public String getName() {

        return name;

    }

    public String getEmail() {

        return email;

    }

    @Override
    public String toString() {

        return String.format("by %s [%s]", name, email);

    }
    
}
