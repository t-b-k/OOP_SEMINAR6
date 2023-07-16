package lsp2.factory;

public abstract class Orderable {
    protected final int price;
    protected final int quantity;

    public Orderable(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract int getAmount();
}
