package Program;

public class PrintedBook extends Title {
    private int pages;

    //Constructor
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    // Calculating the right amount of points
    @Override
    protected double calculatePoints() {
        return pages * getCopies() * calculateLiteraturePoints();
    }

    //Switch to run through types of literature and assign the right amount of points
    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI" -> 3;
            case "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0.0;
        };
    }
}

