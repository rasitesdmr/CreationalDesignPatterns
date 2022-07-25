package solution2;

import solution1.ButtonFactory;
import solution1.Client;
import solution1.ListFactory;
import solution1.TableFactory;

public class Main {
    public static void main(String[] args) {
        new Client(new ListFactory());
        new Client(new ButtonFactory());
        new Client(new TableFactory());

    }
}
