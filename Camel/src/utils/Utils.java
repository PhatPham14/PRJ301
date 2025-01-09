/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author jicam
 */
public class Utils {
    
    public static String enterString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter a String: ");
        String s = sc.nextLine();
        return s;
    }
    public static void display(String s){
        System.out.print(s);
    }
    
}
