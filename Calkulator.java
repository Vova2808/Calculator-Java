import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    double num1;
    double num2;
    double answear;
    char op;
    Scanner reader = new Scanner(System.in);
    System.out.print("One num: ");
    num1 = reader.nextDouble();
    System.out.print("Two num: ");
    num2 = reader.nextDouble();
    System.out.print("Operater (+, -, *, /): ");
    op = reader.next().charAt(0);

    switch(op) {
      case '+': answear = num1 + num2;
        break;
      
      case '-': answear = num1 - num2;
        break;

      case '*': answear = num1 * num2;
        break;

      case '/': answear = num1 / num2;
        break;

      default:  System.out.printf("Error! Enter correct operator");
        return;
    }
    System.out.printf("Answear: ");
    System.out.printf(num1 + " " + op + " " + num2 + " = " + answear);
  }
}
