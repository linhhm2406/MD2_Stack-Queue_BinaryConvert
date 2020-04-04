import java.util.Scanner;
import java.util.Stack;

public class BinaryConvert {
    Stack<String> stack = new Stack<>();
    String result="";
    int number;
    int stackSize = 0;

    public void inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        number = input.nextInt();
    }

    public void numberDivision2() {
        while (number != 0) {
            stack.push(number % 2 + "");
            number = number / 2;
        }
        stackSize = stack.size();
    }

    public void pushBackToResultArray() {
        for (int i = 0; i < stackSize; i++) {
            result += stack.pop() + "";
        }
    }

    public void displayResult() {
        System.out.println(result);
    }
}


