package solution1;

public class ButtonFactory implements Factory{
    @Override
    public Button create() {
        return new Button();
    }
}
