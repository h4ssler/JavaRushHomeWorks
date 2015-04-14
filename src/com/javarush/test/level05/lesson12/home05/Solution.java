package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        boolean isEnd = true;
        String endWord;
        int slag;

        while(isEnd){
        endWord = br.readLine();
            if(endWord.equals("сумма")){
                isEnd = false;
                System.out.println(sum);
            }else{
                slag = Integer.parseInt(endWord);
                sum += slag;

            }
        }
        
    }
}
