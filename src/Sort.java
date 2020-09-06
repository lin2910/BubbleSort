import java.util.Scanner;

//Сортировка пузырьком
//Сортировка по возрастанию
// Ввод массива десяти целых чисел и вывод отсортированного массива
public class Sort {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Input massive: ");
        for (int i = 0; i < 10; i++)
            numbers[i] = in.nextInt();


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int t = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
