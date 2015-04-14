package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0, slag;

        boolean isExit = true;
        while(isExit){
            slag = sc.nextInt();
            sum = sum + slag;


            
            if(slag == -1){
                isExit = false;
            }
        }
        System.out.println(sum);
    }
}
