package myWorks.reverseString;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: rio
 * Date: 09.04.15
 * Time: 13:35
 * Не проблемы должны толкать вас в спину, а вперед вести мечты.
 */
public class Reverse
{
    String text;
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Reverse rv = new Reverse();
      rv.text = sc.nextLine();

        System.out.println("Вы ввели: " + rv.text);
        System.out.println("Перевернутая строка: " + reverseString(rv.text));

        if(isPalyndrome(rv.text)){
            System.out.print("Введенная строка является палиндромом");
        }else{
            System.out.print("Введенная строка не является палиндромом!");
        }
        
    }
    
    public static String reverseString(String text){
        String rText = "";
        char[] arrText = new char[text.length()];

        arrText = text.toCharArray();

        for(int i = arrText.length; i>0; i--){
            rText = rText + arrText[i-1];
        }


        return rText;
        
        
    }
    
    public static boolean isPalyndrome(String text){
        String rText = reverseString(text);
        return text.equalsIgnoreCase(rText);
    }
}
