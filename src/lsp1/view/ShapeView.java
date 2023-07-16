package lsp1.view;

import lsp1.shape.Quadraliteral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadraliteral quadraliteral;

    public ShapeView(Quadraliteral quadraliteral) {
        this.quadraliteral = quadraliteral;
    }

    public void showArea() {
        System.out.printf("Area of %s equals:", quadraliteral.getClass().getSimpleName());
        System.out.println(quadraliteral.getArea());
    }
}
