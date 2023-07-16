package lsp2.model;

import lsp2.factory.Orderable;

public class Order extends Orderable {

    public Order(int quantity, int price) {
        super(quantity, price);
    }

    public int getAmount() {
        return this.quantity * this.price;
    }

    @Override
    public String toString() {
        return String.format("Regular order: Quantity = %d, Price = %d", this.getQuantity(), this.getPrice());
    }
}
