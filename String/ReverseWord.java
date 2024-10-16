// Reverse the sentence by indivisual words and spaces.
// input:hello world from java //output:olleh dlrow morf avaj 
import java.util.*;;
public class ReverseWord {

  public static String reverse(String sentence){
    String[] words=sentence.trim().split("\\s+");
    System.out.println(words);
    StringBuilder reverseSentence=new StringBuilder();
    for(String word:words){
      StringBuilder reversedWord = new StringBuilder(word);
      reverseSentence.append(reversedWord.reverse().toString()).append(" ");
  }
  return reverseSentence.toString().trim();
  }
  public static void main(String[] args) {
    String str="hello world from java";
    String result=reverse(str);
    System.out.print(result);
  }
}
