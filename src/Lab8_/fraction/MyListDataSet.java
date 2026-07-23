package Lab8_.fraction;

import java.util.List;

public class MyListDataSet implements MyDataSet {
    private List<MyFraction> fractions;

    /**
     * Hàm dựng khởi tạo list chứa các phân số.
     */
    public MyListDataSet() {
        this.fractions = new java.util.ArrayList<>();
    }

    /**
     * Hàm dựng khởi tạo list chứa các phân số theo truyền vào.
     * @param fractions
     */
    public MyListDataSet(List<MyFraction> fractions) {
        this.fractions = new java.util.ArrayList<>();
        for (MyFraction fraction : fractions) {
            this.fractions.add(new MyFraction(fraction));
        }
    }

    @Override
    public boolean insert(MyFraction fraction, int index) {
        if (index < 0 || index > fractions.size()) {
            return false;
        }
        fractions.add(index, new MyFraction(fraction));
        return true;
    }

    @Override
    public boolean append(MyFraction fraction) {
        fractions.add(new MyFraction(fraction));
        return true;
    }

    @Override
    public MyDataSet toSimplify() {
        MyListDataSet result = new MyListDataSet();
        for (MyFraction fraction : fractions) {
            MyFraction simplified = new MyFraction(fraction);
            simplified.simplify();
            result.append(simplified);
        }
        return result;
    }

    @Override
    public MyDataSet sortIncreasing() {
        MyListDataSet result = new MyListDataSet();
        for (MyFraction fraction : fractions) {
            result.append(fraction);
        }
        result.fractions.sort((a, b) -> a.compareTo(b));
        return result;
    }

    @Override
    public MyDataSet sortDecreasing() {
        MyListDataSet result = new MyListDataSet();
        for (MyFraction fraction : fractions) {
            result.append(fraction);
        }
        result.fractions.sort((a, b) -> b.compareTo(a));
        return result;
    }

    @Override
    public String myDataSetToString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < fractions.size(); i++) {
            sb.append(fractions.get(i).toString());
            if (i < fractions.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void print() {
        System.out.println(myDataSetToString());
    }
}
