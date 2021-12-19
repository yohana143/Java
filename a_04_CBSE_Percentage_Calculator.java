package com.company;
import java.util.Scanner;
public class a_04_CBSE_Percentage_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the marks of student");
        System.out.println("Enter subject 1 marks:");
        int sub1=sc.nextInt();
        System.out.println("Enter subject 2 marks:");
        int sub2=sc.nextInt();
        System.out.println("Enter subject 3 marks:");
        int sub3=sc.nextInt();
        System.out.println("Enter subject 4 marks:");
        int sub4=sc.nextInt();
        System.out.println("Enter subject 5 marks:");
        int sub5=sc.nextInt();

        int sum=sub1+sub2+sub3+sub4+sub5;

        int percentage =(sum*100)/500;
        System.out.println("The percentage obtained is");
        System.out.println(percentage);

        System.out.println("The cgpa obtained is");
        float cgpa=(sum)/50;   //5* 10  ,result is in the form of integers
        System.out.println(cgpa);


//        System.out.println("Enter your name");
//        String name=sc.next();
//        System.out.println("hello "+name+" have a nice day");

        //checking whether the entered number is an integer
//        System.out.println("Enter the number");
//        System.out.println(sc.hasNextInt());
    }
}
