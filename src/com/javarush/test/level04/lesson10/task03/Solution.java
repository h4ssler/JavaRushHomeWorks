package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String text;
        int numsOfOutput;
        int i = 0;
        
        Scanner sc = new Scanner(System.in);
        
        text = sc.nextLine();
        numsOfOutput = sc.nextInt();

        while(i < numsOfOutput){
            System.out.println(text);
            i++;
        }

    }
}
