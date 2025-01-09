/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Control;
import dto.Camel;
import utils.Utils;

/**
 *
 * @author jicam
 */
public class Main {

    public static void main(String[] args) {
        Control view = new Control();
        Camel C = new Camel();
        C.setS("I love C programming");
        int []a = null;
        a.
        a[0]=1;
        System.out.println(a[1]);
        System.out.println(a[0]);
//        draw(trim("I love C programming"),findMax(trim("I love C programming")));
    }

    public static int findMax(int[] a) {
        int max;
        max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int[] trim(String s) {
        int dem1 = 0, dem2 = 0;
        int[] a = null;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).equals(" ")) {
                a[dem2] = dem1;
                dem2++;
                dem1 = 0;
            } else {
                dem1++;
            }
        }
        a[dem2] = dem1;
        return a;
    }

    public static void draw(int[] a, int max) {
        for (int i = max; i >= 0; i--) {
            for (int j = 0; i < a.length; j++) {
                if (a[j] > i) {
                    Utils.display("*");
                } else {
                    Utils.display(" ");
                }
            }
            Utils.display("\n");
        }

    }
}

