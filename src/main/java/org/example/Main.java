package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text


        System.out.println("Task 1");

     int a = 3;
     int b = 4;
     System.out.println("arithmetic sum:" + (a+b));
     System.out.println("values of two variables:" + a+b);

        System.out.println("Task 2");

        String binary1 = "101";
        String binary2 = "11";
        String binary3 = "111";

        int d = Integer.parseInt(binary1, 2);
        int d2 = Integer.parseInt(binary2, 2);
        int d3 = Integer.parseInt(binary3, 2);

        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);

        int decimal1 = 2;
        int decimal2 = 23;
        int decimal3 = 15;
        System.out.println(Integer.toBinaryString(decimal1));
        System.out.println(Integer.toBinaryString(decimal2));
        System.out.println(Integer.toBinaryString(decimal3));

        System.out.println("Task 3");

        int i = 5;
        i = i++; // 5
        System.out.println(i);
        i = 5;
        i = i++ + i++; //11
        System.out.println(i);
        i = 5;
        i = i++ + ++i; //13, here my assumption was wrong
        System.out.println(i);
        i = 5;
        i = ++i + ++i; //12, here my assumption was wrong
        System.out.println(i);

    }
}