package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] arrNums = new int[5];
        
        for(int i = 0; i <5; i++){
            arrNums[i] = Integer.parseInt(reader.readLine());
        }
        
        sort(arrNums);
    }
    
    static public void sort(int[] arr){
        int min;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }   
            }  
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        
    }
}
