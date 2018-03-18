//The following is the solution to the unit 4 assignment. I used the programr service in this case to do the assignment, so your assignment may vary a bit in terms of the package and class declarations.

public class firstsubroutines {
	static String reverse(String str) {
  	// This subroutine gets a String and returns it's reverse value
    	String reverse;
      int i;
      reverse = "";
            
      for (i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
      }
      	return (reverse);
	}
 
  static String stripNonLetter(String str) {
  	// This subroutine gets a String in lower case and strips any non letter characters
    String strip;
    int i;
    strip = "";           
    for (i = 0; i < str.length() ; i++) {
    	if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
      	strip = strip + str.charAt(i);
      }
    }
    return (strip);
  }
  public static void main(String[] args) {
  	// This program gets a word from the user and returns it Stripped of non-letters(non letter)
    // And return reversed value.
    // Then compare the two results and indicate if it is a palindrome
    String userWord,userWordReverse;
    // get word from the user
    TextIO.putln("Please enter a word :");
    userWord=TextIO.getln();
    // change the word to lower case
    userWord=userWord.toLowerCase();
    // Print the Stripped value
    TextIO.putln("Stripped: "+stripNonLetter(userWord));
	// Print the Reversed value
	TextIO.putln("Reversed: "+reverse(stripNonLetter(userWord)));
	// Check if the work is a palindrome
	if ((stripNonLetter(userWord)).equals(reverse(stripNonLetter(userWord)))){
  	TextIO.putln("This IS a palindrome.");
	} else {
  	TextIO.putln("This is NOT a palindrome.");
 	}
 }
}
