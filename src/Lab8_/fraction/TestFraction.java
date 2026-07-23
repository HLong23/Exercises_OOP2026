package Lab8_.fraction;

public class TestFraction {
    private MyDataSet myDataSet;

    public TestFraction(MyDataSet myDataSet) {
        this.myDataSet = myDataSet;
    }

    public static void main(String[] args) {
        TestFraction testArray = new TestFraction(new MyArrayDataSet());
        testArray.testMyArrayDataSet();
        
        TestFraction testList = new TestFraction(new MyListDataSet());
        testList.testMyListDataSet();
    }

    public void testMyArrayDataSet() {
        java.util.Random random = new java.util.Random();
        int numbers = 30 + random.nextInt(21);
        
        MyArrayDataSet dataSet = new MyArrayDataSet();
        for (int i = 0; i < numbers; i++) {
            int numerator = 1 + random.nextInt(100);
            int denominator = 1 + random.nextInt(100);
            dataSet.append(new MyFraction(numerator, denominator));
        }
        
        System.out.println("Original dataset:");
        dataSet.print();
        
        System.out.println("Sorted increasing:");
        MyDataSet increasing = dataSet.sortIncreasing();
        increasing.print();
        
        System.out.println("Sorted decreasing:");
        MyDataSet decreasing = dataSet.sortDecreasing();
        decreasing.print();
        
        System.out.println("Simplified (original order):");
        MyDataSet simplified = dataSet.toSimplify();
        simplified.print();
        
        System.out.println("Simplified (increasing order):");
        MyDataSet simplifiedIncreasing = simplified.sortIncreasing();
        simplifiedIncreasing.print();
        
        System.out.println("Simplified (decreasing order):");
        MyDataSet simplifiedDecreasing = simplified.sortDecreasing();
        simplifiedDecreasing.print();
    }

    public void testMyListDataSet() {
        java.util.Random random = new java.util.Random();
        int numbers = 30 + random.nextInt(21);
        
        MyListDataSet dataSet = new MyListDataSet();
        for (int i = 0; i < numbers; i++) {
            int numerator = 1 + random.nextInt(100);
            int denominator = 1 + random.nextInt(100);
            dataSet.append(new MyFraction(numerator, denominator));
        }
        
        System.out.println("Original dataset:");
        dataSet.print();
        
        System.out.println("Sorted increasing:");
        MyDataSet increasing = dataSet.sortIncreasing();
        increasing.print();
        
        System.out.println("Sorted decreasing:");
        MyDataSet decreasing = dataSet.sortDecreasing();
        decreasing.print();
        
        System.out.println("Simplified (original order):");
        MyDataSet simplified = dataSet.toSimplify();
        simplified.print();
        
        System.out.println("Simplified (increasing order):");
        MyDataSet simplifiedIncreasing = simplified.sortIncreasing();
        simplifiedIncreasing.print();
        
        System.out.println("Simplified (decreasing order):");
        MyDataSet simplifiedDecreasing = simplified.sortDecreasing();
        simplifiedDecreasing.print();
    }
}
