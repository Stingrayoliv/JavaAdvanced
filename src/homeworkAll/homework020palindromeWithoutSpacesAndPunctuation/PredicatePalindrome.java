 package homeworkAll.homework020palindromeWithoutSpacesAndPunctuation;

import java.util.function.Predicate;

 public class PredicatePalindrome implements Predicate<String> {

     @Override // comparison does not take into account spaces and punctuation marks
     public boolean test(String s) {
         if (s == null) return false;

         //with using regular expressions
         String stringWithoutSpacesAndPunctuationMarks = s.replaceAll("\\p{Punct}|\\s","");
         return new StringBuffer(stringWithoutSpacesAndPunctuationMarks).
                 reverse().toString().equalsIgnoreCase(stringWithoutSpacesAndPunctuationMarks);
     }
 }
