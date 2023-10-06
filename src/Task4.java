import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите любой текст, кроме пустой строки: ");
        String input = scanner.nextLine();

        try {
            if (input.isEmpty()) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            } else {
                System.out.println("Вы ввели: " + input);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
