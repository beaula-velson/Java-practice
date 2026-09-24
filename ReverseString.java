import java.util.Scanner;
public class ReverseString{
  public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);
    String word = sc.nextLine();
    String reverse = " ";
    for(int i = word.length() - 1 ; i >= 0 ; i--){
      reverse = reverse + word.charAt(i);
      }
    System.out.println(reverse);
    }
  }
