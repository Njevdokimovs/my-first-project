package lv.acodemy.classroom;

import java.util.concurrent.LinkedTransferQueue;

public class Loops {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*

        for(int i = 0; i < 10; i++) {
        // defina counter;
        // condition
        // increment

         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }

        //numbers[0] = 1
        // numbers[1] = 2

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "");
            //  System.out.println(numbers[i]);
        }
        //numbers[0];
        //numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        // Create String array with 10 names
        // Print all names using for & for each


        String[] names = {"nikita", "vika", "liga", "inna", "dima", "artur", "katja", "edgar", "inessa", "natalja" };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        for (String name :
                names) {
            System.out.println(name);
        }
        System.out.println("--------");

        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("inna")) {
                System.out.println(names[i]);
            }
        }

        // do, do while

    /*
    do {
    // code to be executed
    }(while is true)
     */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        // move numbers from arrayOfNum to emptyArray using loop
        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];
            // 1;
        }
        //0
        //emptyArray[0] = 0
        //arrayOfNum[0] = 1;

        //1
        //emptyOfNum[1] = 0
        //arrayOfNum[1] = 2;
    }
}