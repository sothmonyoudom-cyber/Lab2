package exercises;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, english, physics, programming;
        int max, min;
        double average;
        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
        math = input.nextInt();
        english = input.nextInt();
        physics = input.nextInt();
        programming = input.nextInt();
        max = math;
        min = math;
        if (english > max) {
            max = english;
        }
        if (physics > max) {
            max = physics;
        }
        if (programming > max) {
            max = programming;
        }
        if (english < min) {
            min = english;
        }
        if (physics < min) {
            min = physics;
        }
        if (programming < min) {
            min = programming;
        }
        average = (math + english + physics + programming) / 4.0;
        System.out.print("Max score is: " + max + " (");
        if (math == max) {
            System.out.print("Math");
        }
        if (english == max) {
            if (math == max) {
                System.out.print(" and ");
            }
            System.out.print("English");
        }
        if (physics == max) {
            if (math == max || english == max) {
                System.out.print(" and ");
            }
            System.out.print("Physics");
        }
        if (programming == max) {
            if (math == max || english == max || physics == max) {
                System.out.print(" and ");
            }
            System.out.print("Programming");
        }
        System.out.println(" courses).");
        System.out.print("Min score is: " + min + " (");
        if (math == min) {
            System.out.print("Math");
        }
        if (english == min) {
            if (math == min) {
                System.out.print(" and ");
            }
            System.out.print("English");
        }
        if (physics == min) {
            if (math == min || english == min) {
                System.out.print(" and ");
            }
            System.out.print("Physics");
        }
        if (programming == min) {
            if (math == min || english == min || physics == min) {
                System.out.print(" and ");
            }
            System.out.print("Programming");
        }
        System.out.println(" course).");
        System.out.println("Average score of this student is: " + average);
        input.close();
    }
}