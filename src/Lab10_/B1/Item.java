package Lab10_.B1;

public abstract class Item {
    protected String title;
    protected int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item[" +
                "title='" + title + '\'' +
                ", year=" + year +
                ']';
    }
}
