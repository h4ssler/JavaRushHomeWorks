package com.javarush.test.level04.lesson13.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 1; i  <= 10; i++){
            drawEight(i);
        }
        

    }
    
    public static void drawEight(int i){
        String text8 = "";
        for(int j = 1; j <= i; j++){
            text8 += "8";
        }
        System.out.print(text8);
        System.out.println();
    } 
}
