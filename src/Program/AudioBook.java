package Program;

public class AudioBook extends Title {
    private int durationInMinutes;

    //Constructor
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    // Calculating the right amount of points
    @Override
    protected double calculatePoints() {
        return durationInMinutes * 0.5 * getCopies() * calculateLiteraturePoints();
    }

    //Switch to run through types of literature and assign the right amount of points
    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI" -> 1.5;
            case "TE" -> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0.0;
        };
    }
}
