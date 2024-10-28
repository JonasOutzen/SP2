package Program2;

import java.util.ArrayList;

public class LibraryRoyaltyCalculater {
    public static void main(String[] args) {
        ArrayList<Title> titles = new ArrayList<>();
        ArrayList<Auther> AuthorArrayList = new ArrayList<>();

        //Creating my own auther H.C. Andersen
        Auther HCAndersen = new Auther("H.C. Andersen");
        Title printedBook1 = new PrintedBook("The little mermaid", "SKØN", 1500, 300);
        Title printedBook2 = new PrintedBook("The ugly duckling", "BI", 2000, 150);
        Title audioBook1 = new AudioBook("The flying trunk", "LYRIK", 100, 50);

        //Adding his books
        HCAndersen.addTitle(printedBook1);
        HCAndersen.addTitle(printedBook2);
        HCAndersen.addTitle(audioBook1);


        //Testing the examples given by the teachers
        Auther testAutherPrinted = new Auther("testAutherPrinted");
        Title testBookPrinted = new PrintedBook("TestBookPrinted", "TE", 140, 72);

        Auther testAutherAudio = new Auther("testAutherAudio");
        Title testBookAudio = new AudioBook("TestBookAudio", "SKØN", 10, 400);

        testAutherPrinted.addTitle(testBookPrinted);
        testAutherAudio.addTitle(testBookAudio);

        // Printing authers with their royalty - In the auther.java class - I've made a toString
        // This toString method works with the AutherArrayList and prints all authers added to the Arraylist
        // With their royalty
        AuthorArrayList.add(HCAndersen);
        AuthorArrayList.add(testAutherAudio);
        AuthorArrayList.add(testAutherPrinted);
        System.out.print(AuthorArrayList);
    }
}




