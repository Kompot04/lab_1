package com.company;

import java.util.Arrays;

class MyMethod {

    // Створіть метод, який сортує будь який масив int[] методом вставок.
    public void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int k = i - 1;
            for (; k >= 0; k--) {
                if (value < arr[k]) {
                    arr[k + 1] = arr[k];
                } else {

                    break;
                }
            }
            arr[k + 1] = value;
        }
        System.out.println(Arrays.toString(arr));
    }


    //Створіть метод , який може перевернути будь яку число int.
    // Приклад: 357 на вході, метод поверне 753.
    public int inverse(int value) {
        int result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    public void print(int value) {
        System.out.println("value = " + value + ";");
        System.out.println("inversion = " + inverse(value) + ";");
    }


//Створіть метод, який дозволяє поєднати між собою будь яку кількість 
//масивів int[] та повернути результуючий масив, який буде складатися 
//виключно з простих чисел, які були у складі масивів.

    public boolean simpleNum(int number){
        if (number % 2 == 0 && number !=2)
            return false;
        for(int i = 3; i < number; i+=2){
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public int[] method(int[] ...num){
        int sumlength = 0;
        for(int[] i : num) {
            sumlength += i.length;
        }
        int[] combine = new int[sumlength];
        for(int i = 0, k = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++,k++){
                combine[k] = num[i][j];
            }
        }

        int[] simple = new int[sumlength];
        sumlength = 0;
        for(int i : combine) {
            if(simpleNum(i)){
                simple[sumlength] = i;
                sumlength++;
            }
        }

        int[] result = new int[sumlength];
        for(int i = 0; i < result.length; i++){
            result[i] = simple[i];
        }
        return result;
    }



    // Створіть метод, який приймає параметр int та конвертує його
   // з десяткової у шістнадцятирічну систему обчислення та повертає у вигляді String.
    public void decToHexa(int n) {
        char[] hexaDeciNum = new char[100];
        int i = 0;
        while (n != 0) {
            int temp = 0;
            temp = n % 16;
            if (temp < 10) {
                hexaDeciNum[i] = (char) (temp + 48);
                i++;
            } else {
                hexaDeciNum[i] = (char) (temp + 55);
                i++;
            }
            n = n / 16;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.println(hexaDeciNum[j]);
    }

//Створіть метод, який приймає параметр int та конвертує його
// з десяткової у восьмирічну систему числення та повертає у вигляді String.
    public  int decToOctal(int octalNumber) {
        int counter = 0;
        int result = 0;
        while (octalNumber != 0) {
            int temp = (int) ((octalNumber % 8) * Math.pow(10, counter));
            counter++;
            result += temp;
            octalNumber /= 8;
        }
        return result;
    }
}
    public class Main {

        public static void main(String[] args) {
            int[] arr = {5, 3, 6, 1, 8, 7, 2};
            MyMethod method= new MyMethod();
            method.sort(arr);

            MyMethod method2 = new MyMethod();
            method2.print(357);

            int n = 11;
            MyMethod method3 = new MyMethod();
           method3.decToHexa(n);

            MyMethod method4 = new MyMethod();
            System.out.println(method4.decToOctal(9));

        }
    }











