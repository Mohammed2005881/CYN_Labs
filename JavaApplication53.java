/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication53;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int arr[]={5,6,8,6};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("===============================================");
        int []arrys =new int[10] ;
        for (int i = 0; i < arrys.length; i++) {
            System.out.println("Enter the number: ");
            arrys[i]=input.nextInt();
            
        }
        System.out.println("===============================================");
        for (int bb : arrys) {
            System.out.println(bb);
            
        }
        
    }
    
}
