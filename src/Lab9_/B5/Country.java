package Lab9_.B5;

public abstract class Country {
    protected String code;
    protected String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public abstract int getPopulation();

    public abstract double getArea();

    public abstract double getGdp();
}
