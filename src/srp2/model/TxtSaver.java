package srp2.model;

public class TxtSaver implements Saver {
    Order order;

    public TxtSaver(Order order) {
        this.order = order;
    }

    @Override
    public void save() {
        System.out.println("Сохраняем в .txt-файл... ");
    }
}
