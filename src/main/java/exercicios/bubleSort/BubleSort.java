package exercicios.bubleSort;

import java.util.Arrays;

public class BubleSort {

    static int[] numeros = {5, 3, 2, 4, 7, 1, 0, 6};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(numeros)));
    }

    public static int[] bubbleSort(int[] array) {
        int tamanhoArray = array.length;
        int auxiliar;
        for (int i = 0; i < tamanhoArray; i++) {
            for (int j = 1; j < (tamanhoArray - i); j++) {
                if (array[j - 1] > array[j]) {
                    auxiliar = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = auxiliar;
                }
            }
        }
        return array;
    }

}
