package solution1;

public class TableFactory implements Factory{
    @Override
    public Table create() {
        return new Table();
    }
}
