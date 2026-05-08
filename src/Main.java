
import java.util.Random;
import java.util.Scanner;

public class Main {
     static void main(String[] args) {


         // method = a block of reusable code that is executed when called

        String name = "Castelano";
        int age = 25;

         happyBirthday(name, age);
     }

         static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you! ");
        System.out.printf("Happy Birthday dear %s! ", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n ");
    }




}