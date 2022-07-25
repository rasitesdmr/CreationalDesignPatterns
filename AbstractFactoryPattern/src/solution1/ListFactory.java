package solution1;

public class ListFactory implements Factory{
    @Override
    public List create() {
        return new List();
    }
}
