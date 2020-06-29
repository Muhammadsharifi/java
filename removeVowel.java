import java.util.Scanner;

public class removeVowel {
  public static void main(String [] args) {
    Scanner scnr = new Scanner(System.in);
    String userName;
    String newUserName;
    System.out.println("Enter a Name ");
    userName = scnr.nextLine();
    newUserName = userName.replaceAll("[aeiouAEIOU]","");
    System.out.println("Removing Vowels . . . .");
    System.out.println("Name Converted from " + userName + " --> " + newUserName);

  }
}
