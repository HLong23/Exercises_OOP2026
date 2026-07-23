package Lab8_.B1_8;

public class MainTest {

    public static void main(String[] args) {

        MovableCircle circle =
                new MovableCircle(2, 3, 2, 2, 5);

        System.out.println(circle);

        circle.moveRight();
        System.out.println(circle);

        circle.moveDown();
        System.out.println(circle);

        System.out.println();

        MovableRectangle rectangle =
                new MovableRectangle(0, 0, 10, 10, 3, 3);

        System.out.println(rectangle);

        rectangle.moveRight();
        System.out.println(rectangle);

        rectangle.moveDown();
        System.out.println(rectangle);

        rectangle.moveLeft();
        System.out.println(rectangle);

        rectangle.moveUp();
        System.out.println(rectangle);
    }
}
