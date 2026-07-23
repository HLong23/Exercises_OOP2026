package Lab8_.B1_3;

public class MainTest {
    public static void main(String[] args) {

        Movable movable = new MovablePoint(5, 6, 10, 15);

        System.out.println(movable);

        movable.moveLeft();
        System.out.println(movable);

        movable.moveUp();
        System.out.println(movable);

        movable.moveRight();
        System.out.println(movable);

        movable.moveDown();
        System.out.println(movable);
    }
}
