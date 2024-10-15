
import java.util.*;
public class UptoLowViceVersa {
  public static void main(String[] args) {
    String str="ViKaSH";
    String result=Convert("str");
    System.out.print(result);
  }
  public static String Convert(String s){
    StringBuilder string=new StringBuilder();
    for(char c:s.toCharArray()){
      if(Character.toUpperCase(c)){
        s.append(Character.toLowerCase(c));
      }
    }
  }
}
