//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы


package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arrSize = input1.nextInt();
        double [] array = createRandomDoubleArray(arrSize);
        printArray(array);
        double min = array[0];
        double max = array [0];

        for (int i = 1; i < arrSize; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.printf("Минимальное значение: %.2f\n", min);
        System.out.printf("Максимальное значение: %.2f\n", max);
    }
    public static double[] createRandomDoubleArray(int size){
        double [] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random()*10;
        }
        return arr;
    }
    public static void printArray(double arr[]){
        System.out.print("[");
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.printf("%.2f ", arr[i]);
        }
        System.out.printf("%.2f]\n", arr[arr.length - 1]);
    }
}
