package solution2;

public class FactoryImpl implements Factory{
    @Override
    public Button createButton() {
        return new Button();
    }

    @Override
    public List createList() {
        return new List();
    }

    @Override
    public Table createTable() {
        return new Table();
    }
}
