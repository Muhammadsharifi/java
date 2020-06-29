import java.util.Scanner;
public class printingNum {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userDigit = scnr.nextInt();

      if ((userDigit <= 19) || (userDigit >= 99))
          System.out.println("Input must be 20-98");
      do {
      System.out.println(userDigit + " ");

      if (userDigit % 11 == 0)
      break;
      --userDigit;
              }
          while ((userDigit > 19));
    }
}
