package ru.eugen.tema.pe.acasa.tema.pe;

public class domasca {

    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
   static void numbers(int[] arr ) {
       if (arr[i] == 1) arr[1] == 0;
   } {else arr[i] = 1;
   }

       //Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
   static int[] masivStep (int size , int step){
   int[] arr =new int[size];
   for (int i = 0; i< arr.length; i++) {
       arr[i] = i * step;
      }
      return arr ;
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
     static void masivXtwo(int[] arr) {
       for (int i = 0; i < arr.length; i++);{
           if (arr[i] < 6) arr[i] *= 2;
         }
     }
//Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static int[][] doubleMassiveArray(int size ; int value) {
       int arr[][] = new int [size][size];
       for (int i = 0; i < size ; i++){
           arr[i][i]= value;
           arr[i][arr.length - 1 -i] = value ;
       }
       return arr
    }
//** Задать одномерный массив и найти в нем
// минимальный и максимальный элементы (без помощи интернета);

    static int minMax(int... arr){
       int min = arr[0];
       for (int i = 1; i < arr.length; i++){
           if (min  > arr[i] min = arr[i];
           }
       return min;
       }
    }
    static int minMax2(int... arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max  < arr[i] max = arr[i];
        }
        return max;
    }

}

