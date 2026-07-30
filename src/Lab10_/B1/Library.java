package Lab10_.B1;

public class Library {

    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        if (rents == null || rents.length == 0) {
            return null;
        }

        Rent longest = rents[0];

        for (int i = 1; i < rents.length; i++) {
            if (rents[i].getDuration() > longest.getDuration()) {
                longest = rents[i];
            }
        }

        return longest;
    }
}
