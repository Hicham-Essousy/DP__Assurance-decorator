public class Incendie extends Assurnce{
    private Assurnce assurnce;
    public Incendie(String description,Assurnce assurnce) {
        super(description);
        this.assurnce=assurnce;
    }

    @Override
    public double cout() {
        return assurnce.cout()+500;
    }
}
