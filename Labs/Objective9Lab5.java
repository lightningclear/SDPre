import java.util.Scanner;
public class Objective9Lab5 {

  public static void main(String[]args){
    java.util.Scanner kb = new java.util.Scanner(System.in);
      double num1, num2;
      boolean keepGoing = true;
      int choice;
      double answer = 0.0;

      System.out.println("please enter a number");
      num1 = kb.nextDouble();
      System.out.println("Please enter a second number");
      num2 = kb.nextDouble();


      while(keepGoing) {
        printMenu();
        System.out.print("Which would you like to do? ");
        choice = kb.nextInt();

        switch(choice) {
          case 1:
          answer = findSum(num1, num2);
          System.out.println(answer);
          break;
          case 2:
          answer = findAverage(num1, num2);
          System.out.println(answer);
          break;
          case 3:
          answer = calcTax(num1, num2);
          System.out.println(answer);
          break;
          case 4:
          System.out.println("Goodbye");
          keepGoing = false;
          break;
          default:
          System.out.println("Please pick again");

        }
      }
  }

  public static void printMenu() {
      System.out.println();
      System.out.println("====== Menu =====");
      System.out.println("                 ");
      System.out.println(" 1. Add Numbers  ");
      System.out.println(" 2. Find Average ");
      System.out.println(" 3. Calculate Tax");
      System.out.println(" 4. Exit         ");
      System.out.println("                 ");
      System.out.println("=================");
    }
    public static double findAverage(double x,double y){
      double findAverage = (x+y)/2;
      return findAverage;
    }
    public static double findSum(double c, double d) {
      double findSum = c+d;
      return findSum;
    }
    public static double calcTax(double e,double f){
      double calcTax = (e+f) * 0.0831;
      return calcTax;
    }
  }
