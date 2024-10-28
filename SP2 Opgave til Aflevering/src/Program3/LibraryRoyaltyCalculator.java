package Program3;

import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        ArrayList<Title> titles = new ArrayList<>();
        ArrayList<Author> AuthorArrayList = new ArrayList<>();

        //Creating my own auther H.C. Andersen
        Author HCAndersen = new Author("H.C. Andersen");
        Title printedBook1 = new PrintedBook("The little mermaid", "SKØN", 1500, 300);
        Title printedBook2 = new PrintedBook("The ugly duckling", "BI", 2000, 150);
        Title audioBook1 = new AudioBook("The flying trunk", "LYRIK", 100, 50);

        //Adding his books
        HCAndersen.addTitle(printedBook1);
        HCAndersen.addTitle(printedBook2);
        HCAndersen.addTitle(audioBook1);


        //Testing the examples given by the teachers
        Author testAuthorPrinted = new Author("testAuthorPrinted");
        Title testBookPrinted = new PrintedBook("TestBookPrinted", "TE", 140, 72);

        Author testAuthorAudio = new Author("testAuthorAudio");
        Title testBookAudio = new AudioBook("TestBookAudio", "SKØN", 10, 400);

        testAuthorPrinted.addTitle(testBookPrinted);
        testAuthorAudio.addTitle(testBookAudio);

        // Printing authors with their royalty - In the author.java class - I've made a toString
        // This toString method works with the AuthorArrayList and prints all authors added to the Arraylist
        // With their royalty
        AuthorArrayList.add(HCAndersen);
        AuthorArrayList.add(testAuthorAudio);
        AuthorArrayList.add(testAuthorPrinted);
        System.out.print(AuthorArrayList);
    }
}




