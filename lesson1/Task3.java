//3. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.


package lesson1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrSize = input1.nextInt();
        int [] array = createRandomIntArray(arrSize);
        printArray(array);
        System.out.print("Введите число, по которому будем сортировать: ");
        int num = input1.nextInt();

        int j = 0;
        for (int i = 0; i < arrSize; i++) {
            if (array[i] != num) {
                array[j] = array[i];
                j++;
            }
        }
        for (int i = j; i < arrSize; i++){
            array[i] = num;
        }
        printArray(array);
    }
    public static int[] createRandomIntArray(int size){
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }
    public static void printArray(int arr[]){
        System.out.print("[");
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("%d]\n", arr[arr.length - 1]);
    }
}
