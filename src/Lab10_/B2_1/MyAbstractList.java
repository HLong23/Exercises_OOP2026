package Lab10_.B2_1;

public abstract class MyAbstractList implements MyList {

    protected void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            sb.append("[")
                    .append(get(i))
                    .append("] ");
        }

        return sb.toString();
    }
}
