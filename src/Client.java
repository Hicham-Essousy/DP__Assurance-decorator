public class Client {
    private String nom;
    private String prenom;
    private int age;
    private Assurnce assurnce;

    public Client(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.assurnce = new Respansabilit√©Civile("Responsabilite civile");
    }

    public double cout_assurance(){
        return assurnce.cout();
    }

    public void setAssurnce(Assurnce assurnce) {
        this.assurnce = assurnce;
    }
}
