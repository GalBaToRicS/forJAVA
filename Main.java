import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String inputStr = in.nextLine();
        System.out.println(calc(inputStr));
    }

public static String calc(String inputStr) throws IOException {
    String[] parts = inputStr.split(" ");
    if (parts.length != 3)
        throw new IOException("Введены больше/меньше символов, чем надо");
    if (!parts[0].matches("-?\\d+") || !parts[2].matches("-?\\d+"))
        throw new IOException("Введены не целые  числа");
    int firstOperand = Integer.parseInt(parts[0]);
    int secondOperand = Integer.parseInt(parts[2]);
    if (firstOperand < 0 || firstOperand > 10 || secondOperand < 0 || secondOperand > 10)
        throw new IOException("Введены неверные числа");
    String answer;
    switch (parts[1]) {
        case "+":
            answer = Integer.toString(firstOperand + secondOperand);
            break;
        case "-":
            answer = Integer.toString(firstOperand - secondOperand);
            break;
        case "*":
            answer = Integer.toString(firstOperand * secondOperand);
            break;
        case "/":
            answer = Integer.toString(firstOperand / secondOperand);
            break;
        default:
            throw new IOException("Введена не арифметическая операция");
    }
    return answer;
}
}
