package Lab12_DesignPatterns.BuilderPattern.B2;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private boolean wifi;

    private Computer() {

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", wifi=" + wifi +
                '}';
    }

    public static class Builder {

        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private boolean wifi;

        public Builder withCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder withRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder withGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder withWifi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        public Computer build() {

            Computer computer = new Computer();

            computer.cpu = cpu;
            computer.ram = ram;
            computer.storage = storage;
            computer.gpu = gpu;
            computer.wifi = wifi;

            return computer;
        }

    }

}
