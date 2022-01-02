public class App {
    public static void main(String[] args) {
        Client client = new Client("hicham","soussi",23);
        System.out.println(client.cout_assurance()+"\t Client au debut");
        System.out.println("----------------------------------------");
        Assurnce a = new RespansabilitéCivile("la responsabilité civile");
        System.out.println(a.cout()+"\t RC");
        Incendie b = new Incendie("incendie",a);
        System.out.println(b.cout()+"\t RC+ Incendie");
        Vol c = new Vol("vol",b);
        System.out.println(c.cout()+"\t RC+ Incendie+ Vol");
        System.out.println("----------------------------------------");
        client.setAssurnce(c);
        System.out.println(client.cout_assurance()+"\t client au finale");
    }
}
