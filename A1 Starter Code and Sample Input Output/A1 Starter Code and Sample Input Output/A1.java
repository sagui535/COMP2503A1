import java.util.Scanner;
import java.util.ArrayList;

/** 
 * COMP 2503 Winter 2024 Assignment 1 
 * 
 * This program reads a text file and compiles a list of the 
 * words together with how many each word appears. 
 *
 * Words from a standard list of stop words are not included.
*/
public class A1 
{
   
   private ArrayList<Token> wordlist = new ArrayList<Token>();

   private String[] stopwords = { "a", "about", "all", "am", "an", 
         "and", "any", "are", "as", "at", "be", "been", "but", "by", "can", 
         "cannot", "could", "did", "do", "does", "else", "for", "from", 
         "get", "got", "had", "has", "have", "he", "her", "hers", "him", 
         "his", "how", "i", "if", "in", "into", "is", "it", "its", "like", 
         "more", "me", "my", "no", "now", "not", "of", "on", "one", 
         "or", "our", "out", "said", "say", "says", "she", "so", "some",
         "than", "that", "the", "their", "them", "then", "there", "these", 
         "they", "this", "to", "too", "us", "upon", "was", "we", "were", 
         "what", "with", "when", "where", "which", "while", "who", 
          "whom", "why", 
         "will", "you", "your"};

   private int totalwordcount = 0;

   private int stopwordcount = 0;

   private Scanner input = new Scanner( System.in);

   public static void main( String[ ] args) 
   {	
      A1 a1 = new A1();
      a1.run();
   }



   private void printResults() 
   {
       System.out.println( "Total Words: " + totalwordcount);
       System.out.println( "Unique Words: " + wordlist.size()); 
       System.out.println( "Stop Words: " + stopwordcount);
       System.out.println();
       System.out.println( "10 Most Frequent");
       
       /* TODO:
        * Use collection sort to sort the wordlist in descending frequency order.
        * Then print the first 10.
        */

       System.out.println();
       System.out.println( "10 Least Frequent");
       /* TODO:
        * Use collection sort to sort the wordlist in ascending frequency order.
        * Then print the first 10.
        */

       System.out.println();
       System.out.println( "All");
       /* TODO:
        * Use collection sort to sort the wordlist by its natural ordering (alphabetical).
        * Then print all the words.
        */
   }

   /**  
   Read the input file and process it. 
   Input is on standard input and is read one 
   word at a time -- separated by whitespace. 
 
   All non alphabetic characters are stripped out and 
   words are all converted to lower case. 
  
   Any non-stopword word is stored in the list of words 
   and the number of occurances is tracked.
   */
   private void readFile() 
   {
	   /* TODO: read the input one word at a time, turn to lower-case, 
	    * trim the whitespaces and all other characters but a-z.
	    * If the word is a stopword, ignore it. Otherwise,
 		* Create a new token object, if not already in the wordlist, 
 		* add the token to the word list, otherwise, increase the frequency count.
 		*/
   }

   /** Run the program. Read the file, then print the results. 
   */
   public void run() 
   {
      readFile();
      printResults();
   }

}
