package com.java_mentor;

import com.java_mentor.Calculator;
import com.java_mentor.ArabCalc;
import com.java_mentor.RomanCalc;

import java.util.Scanner;

public class Calculator_JM {
    public static void main(String[] args) {
        Calculator calc = input();
        System.out.println(!(calc.calculate() instanceof String)?((int)calc.calculate()==0?"Введите число от 1 до 10":calc.calculate()):calc.calculate());
    }
    public static Calculator input(){
        Scanner sc = new Scanner(System.in);
        Object a = sc.hasNextInt() ? sc.nextInt() : sc.next();
        String operator = sc.next();
        Object b = sc.hasNextInt() ? sc.nextInt() : sc.next();
        if (a instanceof Integer && b instanceof Integer){
            ArabCalc calc = new ArabCalc((int)a,(int)b,operator);
            return calc;
        } else if(a instanceof String && b instanceof String){
            RomanCalc calc = new RomanCalc((String)a,(String)b,operator);
            return calc;
        } else{
            System.out.println("Введите только арабские или только римские");
            return null;
        }
    }
}