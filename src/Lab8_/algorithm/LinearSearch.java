package Lab8_.algorithm;

public class LinearSearch implements Searcher {
    @Override
    public int search(double value, double[] data) {
        for (int i = 0; i < data.length; i++) {
            if (Math.abs(data[i] - value) < 1e-9) {
                return i;
            }
        }
        return -1;
    }
}
