package Program3;
public abstract class Title {

    //Variables
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    // Constructor
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalty(){
        return calculatePoints() * rate;
    }

    // These are methods used in PrintedBook.java and AudioBook.java
    protected abstract double calculatePoints();
    protected abstract double calculateLiteraturePoints();


    //Getters
    public String getLiteratureType() {
        return literatureType;
    }

    public int getCopies() {
        return copies;
    }
}
