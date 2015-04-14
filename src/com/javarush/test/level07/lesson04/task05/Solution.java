package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] numsArr = new int[20];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<numsArr.length; i++){
            numsArr[i] = sc.nextInt();
        }
        
        int[] smallNumsArr1 = new int[10];
        int[] smallNumsArr2 = new int[10];

        for (int i = 0; i < 10; i++){

            }

        int j = 0;
        for(int i = 10; i < numsArr.length; i++){
            smallNumsArr2[j] = numsArr[i];
            System.out.println(smallNumsArr2[j]);
            j++;
        }


    }
}
