package Lab12_DesignPatterns.Decorator.B3;

public class FileDataSource implements DataSource {

    private String data;

    @Override
    public void writeData(String data) {
        this.data = data;
        System.out.println("Write to file: " + data);
    }

    @Override
    public String readData() {
        System.out.println("Read from file");
        return data;
    }
}
