package srp2;

import srp2.model.*;

public class Main {
    public static void main(String[] args) {
        ConsoleViewer viewer = new ConsoleViewer();
        Order order = viewer.inputFromConsole();
        Saver jsonSaver = new JsonSaver(order);
        jsonSaver.save();
        Saver txtSaver = new TxtSaver(order);
        txtSaver.save();
    }
}
