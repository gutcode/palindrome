<p>For this week&rsquo;s assignment, you will write a program class that has two subroutines and a main routine. The program should be a part of the &lsquo;<code>Firstsubroutines</code>&rsquo; class and you should name your project Firstsubroutines if you are using Netbeans.</p>
<p>Your program must prompt the user to enter a string. The program must then test the string entered by the user to determine whether it is a palindrome. A palindrome is a string that reads the same backwards and forwards, such as "radar", "racecar", and "able was I ere I saw elba". It is customary to ignore spaces, punctuation, and capitalization when looking for palindromes. For example, "A man, a plan, a canal. Panama!" is considered to be a palindrome.</p>
<p>To determine whether a string is a palindrome, you can: convert the string to lower case; remove any non-letter characters from the string; and compare the resulting string with the reverse of the same string. If they are equal, then the original string is considered to be a palindrome.</p>
<p>Here&rsquo;s the code for computing the reverse of str:</p>
<pre>  String reverse;

  int i;

  reverse = "";

  for (i = str.length() - 1; i &gt;= 0; i--) {

   	reverse = reverse + str.charAt(i);

  }
  </pre>
<p>As part of your assignment, you must write a static subroutine that finds the reverse of a string. The subroutine should have one parameter of type String and a return value of type String.</p>
<p>You must also write a second subroutine that takes a String as a parameter and returns a String. This subroutine should make a new string that is a copy of the parameter string, except that all the non-letters have been omitted. The new string should be returned as the value of the subroutine. You can tell that a character, ch is a lower-case letter by testing if&nbsp;<code>(ch &gt;= 'a' &amp;&amp; ch &lt;= 'z')</code></p>
<p>(Note that for the operation of converting str to lower case, you can simply use the built-in&nbsp;<code>toLowerCase</code>&nbsp;subroutine by saying:&nbsp;<code>str = str.toLowerCase();</code>)</p>
<p>You should write a descriptive comment before each subroutine, saying what it does.</p>
<p>Finally, write a&nbsp;<code>main()</code>&nbsp;routine that will read in a string from the user and determine whether or not it is a palindrome. The main routine should use The program should print the string converted to lower case and stripped of any non-letter characters. Then it should print the reverse string. Finally, it should say whether the string is a palindrome. (Use the two subroutines to process the user's string.) For example, if the user's input is "Hello World!", then the output might be:</p>
<pre>    stripped: helloworld
    
    reversed: dlrowolleh
    
    This is NOT a palindrome.
    
    and if the input is "Campus motto: Bottoms up, Mac!", the output might be:
    
    stripped: campusmottobottomsupmac
    
    reversed: campusmottobottomsupmac  

    This IS a palindrome.
  </pre>
<p id="yui_3_17_2_1_1521399070483_141">You must complete your program, test, debug, and execute it. You should test two different cases, one that is a palindrome and another one that is not a palindrome. You must submit your java code file (preferably by cut and paste the code into the assignment dialog box). The output of your program must be captured by either copying the content in the output window and pasting it into the assignment dialog box or by capturing the image of the screen which contains the output of your java program or the output and submitting this with your assignment as an attachment. In windows you can capture a screen shot with the Ctrl Alt and Print Screen key sequence. This image can then be pasted into a Word, WordPad, or OpenOffice document which can be submitted with your assignment.</p>
