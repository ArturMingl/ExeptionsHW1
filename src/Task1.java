import java.util.Scanner;

public class Task1 {
    //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        boolean bool = true;

        while (bool) {
            System.out.print("Введите дробное число: ");
            try {
                float val = Float.parseFloat(iscan.nextLine());
                System.out.print("Вы ввели - " + val);
                bool = false;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Попробуйте ещё раз");
            }
        }
        iscan.close();
    }
}