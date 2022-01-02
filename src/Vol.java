public class Vol extends Assurnce{
    private Assurnce assurnce;
    public Vol(String description,Assurnce assurance) {
        super(description);
        this.assurnce=assurance;
    }

    @Override
    public double cout() {
        return assurnce.cout()+1000;
    }
}
