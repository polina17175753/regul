import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу");
        String word = scanner.nextLine();

        Zavtrak.Zavtrak(word);
    }
}