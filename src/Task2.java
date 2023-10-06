
public class Task2 {

    try { //блок try/catch вне метода
        int d = 0;
        double catchedRes1 = intArray[8] / d;//intArray не объявлен
        // требуется обработка ArrayIndexOutOfBoundsException,
        // при делении двух int результат всегда будет округлен до значения типа int.
        // Чтобы получить результат с плавающей точкой, следует преобразовать один из операндов в тип double
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
//    catch (ArrayIndexOutOfBoundsException e){
//        System.out.println("Catching exception: " + e);
//    }


}
