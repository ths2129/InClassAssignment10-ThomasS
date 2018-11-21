import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //140 Characters tweet, if too long printout characters over (substring)
        //@mention
        //#hastag
        //links http://
        //if and else statements to count @,#, links (no space have)
        //equalsIgnoreCase


        Scanner tweet = new Scanner(System.in);
        Title rules = new Title("New Tweet");
        int limit = 140;
        char mention = '@';
        char hashTag = '#';
        String link = "http//:";

        ArrayList<Character> social = new ArrayList<>();
        social.add('@');
        social.add('#');

        System.out.println("Please enter a tweet under 140 characters");
        String characters = tweet.nextLine();

        //int zero = 0;
        for (int i = characters.length(); i >= -1; i++) {
           // if (characters.charAt(i) == '@') ;
           // zero++;
           // System.out.println(zero);



        if (characters.length() <= limit) {
                System.out.println(characters.length() + " total characters");
                   //while ((characters.length() >= -1) && (characters.length() <= limit)) {

                    //Count the variables?

                    String go = characters.substring(i);
                    System.out.println(characters.substring(i).toLowerCase());
                    System.out.print("Number of attribution: ");
                    System.out.println(characters.lastIndexOf(mention)); //indexOf(mention/characters.length()));

                    System.out.print("Number of hash tags: ");
                    //int count = characters.lastIndexOf(hashTag) - characters.indexOf(hashTag);
                    System.out.println(characters.lastIndexOf(hashTag));
                    System.out.print("Number of links: ");
                    System.out.println(characters.lastIndexOf(link));
                    //System.out.println(count);
                   break;

                }


    else if (characters.length() > limit) {
                    System.out.print(characters.length() - 139 + " Over the 140 character limit!");
                break;
    }


            }}}



    /*String w1 = "The Adventure of the Tall Man";
    String w2 = "The Hound of the Baskervilles";

        System.out.println(w1.length()); //Counts the words and space
                System.out.println(w2.substring(4)); //Four words starts
                System.out.println(w1.substring (w1.length() - 4));
                System.out.println(w1.indexOf('d')); //char is ' not "
                System.out.println(w2.indexOf('d'));
                System.out.println(w1.compareTo(w2));
                System.out.println(w2.charAt (w2.length()-1)); // last letter
                System.out.println(w2.charAt(4)); //doesn't count space
                System.out.println(w1.charAt (w2.indexOf('k')));
                System.out.println(w2.substring(15).toUpperCase());

*/