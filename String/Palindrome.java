import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
    String str="abcba";
    int i=0,j=str.length()-1;
     boolean flag=true;     //true -> it is palindrome
    while(i<j){
      if(str.charAt(i)!=str.charAt(j)){
        flag=false;
        break;
      }
      i++;
      j--;
    }
    if(flag==true){
      System.out.print("Palindrome");
    }else{
      System.out.print("Not Palindrome");
    }
  }
}
