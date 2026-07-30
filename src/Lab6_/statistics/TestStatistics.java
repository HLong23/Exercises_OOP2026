package Lab6_.statistics;

public class TestStatistics {
    private Statistics statistics;

    public TestStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public static void main(String[] args) {
        TestStatistics test = new TestStatistics(null);
        test.testMyLinkedList();
    }

    public void testMyLinkedList() {
        java.util.Random random = new java.util.Random();
        
        int length = 30 + random.nextInt(21);
        
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < length; i++) {
            list.append(1 + random.nextDouble() * 19);
        }
        
        this.statistics = new Statistics(list);
        
        System.out.println("Original Data: " + list.toString());
        
        MyLinkedList sortedList = statistics.sort();
        System.out.println("Sorted Data: " + sortedList.toString());
        
        System.out.println("Max: " + statistics.max());
        System.out.println("Min: " + statistics.min());
        System.out.println("Mean: " + statistics.mean());
        System.out.println("Variance: " + statistics.variance());
        
        double[] ranks = statistics.rank();
        System.out.print("Ranks: [");
        for (int i = 0; i < ranks.length; i++) {
            System.out.print(ranks[i]);
            if (i < ranks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        double searchValue = list.get(random.nextInt(length));
        boolean found = statistics.search(searchValue);
        System.out.println("Search for " + searchValue + ": " + (found ? "Found" : "Not found"));
    }
}
