package calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		  double num1;
	      double num2;
	      double ans;
	      char op;
	      Scanner reader = new Scanner(System.in);
	      System.out.println("Введите два числа: ");
	      num1 = reader.nextDouble();
	      num2 = reader.nextDouble();
	      System.out.print("Выберите операцию (+, -, *, /): ");
	      op = reader.next().charAt(0);
	      switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	         default:  System.out.println("ВЫБЕРИТЕ ОПЕРАЦИЮ");
	            return;
	      }
	      System.out.print("Ответ : ");
	      System.out.println(num1 + " " + op + " " + num2 + " = " + ans);

	}

}
