public class Objective5Lab4 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.print("please enter a number:");
     int num = scanner.nextInt();

    if(num % 2 == 0){
      System.out.println("The Number is Even.");
    }
    else{
      System.out.println("The Number is Odd.");
    }
  }
}
