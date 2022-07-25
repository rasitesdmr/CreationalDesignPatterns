package solution2;

public class Client {
    public Client(Factory factory){
        Component button = factory.createButton();
        button.paint();
        Component list = factory.createList();
        list.paint();
        Component table = factory.createTable();
        table.paint();

    }
}
