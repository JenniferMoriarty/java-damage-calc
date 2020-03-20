import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in); //sets up so you can get user input 
    System.out.println("enter damage:"); //like cout

    int num = myScanner.nextInt();  // like cin
    num = num*5+10; //not the real formula
    System.out.println("Knockback is: " + num);  // Output final number
  }
}
