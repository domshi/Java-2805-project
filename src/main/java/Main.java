import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner units = new Scanner(System.in);
    System.out.println("Enter the number of units you would like to buy: ");
    int unit = units.nextInt();
    int cost = unit * 2;
    double totalCost = (cost * 0.7) + cost;
    System.out.println("The cost of units without tax is " + cost);
    System.out.println("The cost of the units with tax is " + totalCost);
    
  }
}