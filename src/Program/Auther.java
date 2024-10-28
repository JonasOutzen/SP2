package Program;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Auther {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Auther(String name) {
        this.name = name;
    }

    //Method to add titles
    public void addTitle(Title title) {
        titles.add(title);
    }

    //For-loop to run through arrays  and calculate royalty
    public float calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return (float) total;
    }

    //Code to have only two decimals on authers pay:
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public String toString() {
        return ("\n" + name + ": " + df.format(calculateTotalPay()) + " kr");
    }
}


