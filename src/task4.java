import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String binaryNum = scan.nextLine();
        int decimalNum = Integer.parseInt(binaryNum,2);
        System.out.println(decimalNum);
    }
}
