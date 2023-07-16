package lsp2.model;

import lsp2.factory.Orderable;

public class OrderBonus extends Orderable {

    public OrderBonus(int quantity, int price) {
        super(quantity, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Bonus order: Quantity = %d, Price = %d", this.getQuantity(), this.getPrice());
    }
}
