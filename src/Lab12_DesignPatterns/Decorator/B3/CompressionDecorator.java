package Lab12_DesignPatterns.Decorator.B3;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        String compressed = "[Compressed]" + data;
        wrappee.writeData(compressed);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        return data.replace("[Compressed]", "");
    }
}
