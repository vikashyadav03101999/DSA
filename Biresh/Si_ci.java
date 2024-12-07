package Biresh;
import java.util.*;
public class Si_ci {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double si,a,r,t,p;
    int ch;
    System.out.println("enter principal");
    p=sc.nextDouble();
    System.out.println("enter rate");
    r=sc.nextDouble();
    System.out.println("enter time");
    t=sc.nextDouble();
    System.out.println("enter 1 si/2nd ci");
    ch=sc.nextInt();
    switch (ch) {
      case 1:
      si=(p*r*t)/100.0;
      System.out.println(si);
      break;
      case 2: a=p*Math.pow(1+(r/100.0),t);
      System.out.println(a);
      break;

      default:System.out.println("wrong choice");
    }
  }
}
