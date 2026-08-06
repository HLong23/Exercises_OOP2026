package Lab12_DesignPatterns.Decorator.B3;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        String encrypted = "[Encrypted]" + data;
        wrappee.writeData(encrypted);
    }

    @Override
    public String readData() {
        String data = wrappee.readData();
        return data.replace("[Encrypted]", "");
    }
}
