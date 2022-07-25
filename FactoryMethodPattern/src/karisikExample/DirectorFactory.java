package karisikExample;

public class DirectorFactory implements Factory{
    @Override
    public Employee create() {
        Director director = new Director(2,"Ahmet",25,"","",1000);
        return director;
    }
}
