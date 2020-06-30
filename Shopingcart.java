import java.util.Scanner;
public class Shopingcart {
  static int totalItems;
  static String [] items;
  static double [] prices;
  static int [] quantity;

  public static void main(String [] args){
    System.out.println("Welcome to my Store");
    totalItems = getnumberofItems("How many items do you want to buy: ");
    items = new String[totalItems];
    prices = new double[totalItems];
    quantity = new int[totalItems];

    int count = 0;
    while( count < totalItems){
      getItemDetails(count);
      count++;
    }
    displaycart();

  }
  private static void getItemDetails(int index){
    items[index]= getItemname("Enter Item "+ (index+1)+ " Name: ");
    prices[index]= getItemPrice("Enter Item "+ (index+1) + " Price: ");
    quantity[index] = getItemQuantity("Enter Item " + (index+1) + " Quantity: ");

  }
  public static void displaycart(){
    System.out.println("---------------------------------------------------------");
    System.out.println("Shoping cart Detail.....");
    System.out.println("---------------------------------------------------------");
    System.out.println("Quantity--------Item Name------------price----");
    for (int i =0; i <totalItems; i++){
      showLineItem(i);
    }
    System.out.println("---------------------------------------------------------");
    double subtotal = calculateSubtotal();
    double tax = subtotal * .0875;
    double total = subtotal + tax;
    System.out.println("subtotal: " + subtotal+"$");
    System.out.println("Sales tax @ 0.0865%: "+ tax+"$");
    System.out.println("Total Cost: "+ total+"$");
    //System.out.println("Average Cost of All Items: "+ subtotal / getTotalItems());
    // how to add discount here.
    // if item is more than 3
    
  }
  private static int getTotalItems(){
    int sum = 0;
    for (int item: quantity)
    sum += item;
    return sum;
  }
   private static double calculateSubtotal(){
     double total = 0;
     for (int i=0; i<totalItems; i++){
       total += prices[i] * quantity[i];
     }
     return total;
   }
  private static void showLineItem(int index){
    String quantitytext = quantity[index] + "\t--\t" ;
    String itemText = items[index] + "                 ";
    String priceText = prices[index]+ " = "+ prices[index] *quantity[index];
    System.out.println(quantitytext + itemText + priceText);
  }
  private static double getItemPrice(String m){
    System.out.print(m);
    Scanner scnr = new Scanner(System.in);
    return scnr.nextDouble();

  }
  private static String getItemname(String m){
    System.out.print(m);
    Scanner scnr = new Scanner(System.in);
    return scnr.nextLine();

  }
  private static int getItemQuantity(String m){
    System.out.print(m);
    Scanner scnr = new Scanner(System.in);
    return scnr.nextInt();
  }
  private static int getnumberofItems(String m){
    System.out.print(m);
    Scanner scnr= new Scanner(System.in);
    return scnr.nextInt();

  }
}
