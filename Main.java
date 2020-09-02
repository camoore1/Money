import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an amount of money");
    double money = sc.nextDouble();
    int cents = (int) (money * 100);
    // start by finding 10, 5, 1, .25, .10, .05, .01
    int tens = cents/1000;
    cents -= tens*1000;
    int fives = cents/500;
    cents -= fives*500;
    int ones = cents/100;
    cents -= ones*100;
    int quarters = cents/25;
    cents -= quarters*25;
    int dimes = cents/10;
    cents -= dimes*10;
    int nickels = cents/5;
    cents -= nickels*5;
    int pennies = cents/1;
    cents -= pennies*1;

    System.out.println(tens + " ten dollar bills");
    System.out.println(fives + " five dollar bills");
    System.out.println(ones + " one dollar bills");
    System.out.println(quarters + " quarters");
    System.out.println(dimes + " dimes");
    System.out.println(nickels + " nickels");
    System.out.println(pennies + " pennies");
  }
}