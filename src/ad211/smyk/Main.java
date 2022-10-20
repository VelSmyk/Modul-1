package ad211.smyk;
import java.util.Scanner;

public class Main {
 public static void main(String[] args){
     comparingSumOfModules();
 }

    private static void comparingSumOfModules() {
        Scanner in = new Scanner(System.in);
        int size, sumOfFirstPart=0, sumOfSecondPart=0;
        do {
            System.out.print("Input an even size of array(): ");
            size = in.nextInt();
        } while(size % 2 != 0); // задання розміру масиву

        int[] array = new int[size]; // ініціалізація масиву

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*(10+1)-5);
            System.out.println("Array[" + i + "]\t-\t" + array[i]);
            if (i < array.length/2) {
                sumOfFirstPart+=Math.abs(array[i]); //знаходження суми модулів елементів першої половини масиву
            }
            else{
                sumOfSecondPart+=Math.abs(array[i]); //знаходження суми модулів елементів другої половини масиву
            }
        }
        if(sumOfFirstPart == sumOfSecondPart){
            System.out.println("Sum of modules fist part of array = Sum of modules second part of array.");
        } else if (sumOfFirstPart > sumOfSecondPart) {
            System.out.println("Sum of modules fist part of array > Sum of modules second part of array.");
        } else {
            System.out.println("Sum of modules fist part of array < Sum of modules second part of array.");

        }

    }
}
