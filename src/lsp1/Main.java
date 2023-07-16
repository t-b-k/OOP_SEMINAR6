package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        Square square = new Square(2);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
        System.out.printf("In the square side = %d\n", square.getSide());
        view = new ShapeView(square);
        view.showArea();
    }
}
