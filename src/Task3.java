import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) { // следует поменять порядок блоков catch.
            // Сначала NullPointerException и IndexOutOfBoundsException, а затем Throwable
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) { //ArrayIndexOutOfBoundsException тоже подойдёт
            System.out.println("Массив выходит за пределы своего размера!");//Индекс больше или равен размеру массива
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException { //в коде нет операций,
        // которые могут вызвать исключение FileNotFoundException.
        // Вместо него IllegalArgumentException, если будет передан недопустимый аргумент,
        System.out.println(a + b);
    }

}
