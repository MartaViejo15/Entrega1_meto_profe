package es.uah.matcomp.mp.e1.b.composicionagregacion.e2_3;

public class Author_2_3 {
    private String name;
    private String email;

    public Author_2_3(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Author[" + "name=" + name + ", email=" + email + ']';
    }
}
