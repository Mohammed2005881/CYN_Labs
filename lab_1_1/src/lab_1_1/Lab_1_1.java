/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_1_1;

import java.util.Scanner;

/**
 *
 * @author Owner
 */

public class Lab_1_1 {
public static void traversal(int number[]){
    System.out.println("The traversal array elements are : ");
    for (int i = 0; i <number.length; i++) {
        System.out.println("The index is ["+i+"]="+number[i]);
        
    }
    System.out.println("=======================");
}
public static void revers_teaversal(int numbers[]){
    System.out.println("The revers teaversal array element are :");
    for (int i = numbers.length-1; i >=0; i--) {
        System.out.println("The index is ["+i+"]="+numbers[i]);
        
    }
    System.out.println("=======================");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Lab_1_1 p=new Lab_1_1();
        int []arrys=new int[5];
        System.out.println("Enter five number");
        for (int i = 0; i <arrys.length; i++) {
            arrys[i]=input.nextInt();    
        }
        System.out.println("=============");
       Lab_1_1.traversal(arrys);
       
       
       Lab_1_1.revers_teaversal(arrys);
        
        
    }
    
}
