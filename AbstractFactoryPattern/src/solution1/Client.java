package solution1;

public class Client {
    public Client(Factory factory){
        Component component = factory.create();
        component.paint();
    }
}
