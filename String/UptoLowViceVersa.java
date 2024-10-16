// convert the lowercase char in uppercase and vice-versa


import java.util.*;
public class UptoLowViceVersa {
  public static void main(String[] args) {
    String str="ViKaSH";
    String result=Convert(str);
    System.out.print(result);
  }
  public static String Convert(String s){
    StringBuilder string=new StringBuilder();
    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        string.append(Character.toLowerCase(c));
      } else if (Character.isLowerCase(c)) {
        string.append(Character.toUpperCase(c));
      } else {
        string.append(c);
      }
  }

  return string.toString();
  }
}
