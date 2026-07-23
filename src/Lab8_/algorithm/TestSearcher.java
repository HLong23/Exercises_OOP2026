package Lab8_.algorithm;

public class TestSearcher {
    private Searcher searcher;

    public TestSearcher(Searcher searcher) {
        this.searcher = searcher;
    }

    public static void main(String[] args) {
        TestSearcher test = new TestSearcher(new LinearSearch());
        test.testLinearSearch();
        test.testIterativeBinarySearch();
        test.testRecursiveBinarySearch();
    }

    public void testLinearSearch() {
        java.util.Random random = new java.util.Random();
        int size = 10 + random.nextInt(11);
        
        double[] data = new double[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextDouble() * 100;
        }
        
        Searcher linearSearch = new LinearSearch();
        
        System.out.print("Data: [");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
        
        double searchValue = data[size / 2];
        int result = linearSearch.search(searchValue, data);
        System.out.println("Linear search giá trị " + searchValue + ": " + result);
        
        double notFoundValue = 999.0;
        int notFoundResult = linearSearch.search(notFoundValue, data);
        System.out.println("Linear search giá trị " + notFoundValue + ": " + notFoundResult);
        
        System.out.println();
    }

    public void testIterativeBinarySearch() {
        java.util.Random random = new java.util.Random();
        int size = 10 + random.nextInt(11);
        
        double[] data = new double[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextDouble() * 100;
        }
        
        Sorter[] sorters = {new BubbleSort(), new InsertionSort(), new SelectionSort()};
        String[] sorterNames = {"Bubble Sort", "Insertion Sort", "Selection Sort"};
        
        for (int i = 0; i < sorters.length; i++) {
            IterativeBinarySearch iterativeSearch = new IterativeBinarySearch();
            iterativeSearch.setSorter(sorters[i]);
            
            double[] dataCopy = data.clone();
            
            System.out.println("Using " + sorterNames[i] + " Algorithm:");
            
            System.out.print("Before sorting: [");
            for (int j = 0; j < dataCopy.length; j++) {
                System.out.print(dataCopy[j]);
                if (j < dataCopy.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
            
            sorters[i].sort(dataCopy, true);
            
            System.out.print("After sorting: [");
            for (int j = 0; j < dataCopy.length; j++) {
                System.out.print(dataCopy[j]);
                if (j < dataCopy.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
            
            double searchValue = dataCopy[size / 2];
            int result = iterativeSearch.search(searchValue, data);
            System.out.println("Iterative binary search giá trị " + searchValue + ": " + result);
            
            double notFoundValue = 999.0;
            int notFoundResult = iterativeSearch.search(notFoundValue, data);
            System.out.println("Iterative binary search giá trị " + notFoundValue + ": " + notFoundResult);
            
            System.out.println();
        }
    }

    public void testRecursiveBinarySearch() {
        java.util.Random random = new java.util.Random();
        int size = 10 + random.nextInt(11);
        
        double[] data = new double[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextDouble() * 100;
        }
        
        Sorter[] sorters = {new BubbleSort(), new InsertionSort(), new SelectionSort()};
        String[] sorterNames = {"Bubble Sort", "Insertion Sort", "Selection Sort"};
        
        for (int i = 0; i < sorters.length; i++) {
            RecursiveBinarySearch recursiveSearch = new RecursiveBinarySearch();
            recursiveSearch.setSorter(sorters[i]);
            
            double[] dataCopy = data.clone();
            
            System.out.println("Using " + sorterNames[i] + " Algorithm:");
            
            System.out.print("Before sorting: [");
            for (int j = 0; j < dataCopy.length; j++) {
                System.out.print(dataCopy[j]);
                if (j < dataCopy.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
            
            sorters[i].sort(dataCopy, true);
            
            System.out.print("After sorting: [");
            for (int j = 0; j < dataCopy.length; j++) {
                System.out.print(dataCopy[j]);
                if (j < dataCopy.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
            
            double searchValue = dataCopy[size / 2];
            int result = recursiveSearch.search(searchValue, data);
            System.out.println("Recursive binary search giá trị " + searchValue + ": " + result);
            
            double notFoundValue = 999.0;
            int notFoundResult = recursiveSearch.search(notFoundValue, data);
            System.out.println("Recursive binary search giá trị " + notFoundValue + ": " + notFoundResult);
            
            System.out.println();
        }
    }
}
