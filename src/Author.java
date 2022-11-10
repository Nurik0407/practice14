public class Author {
    private String fullName = "Ilim";
    private   String email;
    private    char gender='m';

    public Author(String fullName, String email, char gender) {
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  fullName ;

    }
}

