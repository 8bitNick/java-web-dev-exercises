package exercises;

import java.util.Scanner;

public class SearchWithAliceInWonderland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        aliceQuote = aliceQuote.toLowerCase();
        String searchTerm;
        boolean isFound;

        System.out.println("Enter a string to search for:");
        searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();
        isFound = aliceQuote.contains(searchTerm);

        System.out.println("String " + searchTerm + " found in the quote: " + isFound + ".\n");

        if(isFound) {
            int startIndexOfTerm = aliceQuote.indexOf(searchTerm);
            System.out.println("That term begins at index " + startIndexOfTerm + " and is " + searchTerm.length() +
                    " letters long!");
        }
        String searchTermRemovedQuote = aliceQuote.replace(searchTerm, "");
        System.out.println("The string without the search term: ");
        System.out.println(searchTermRemovedQuote);
    }
}
