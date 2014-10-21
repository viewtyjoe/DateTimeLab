/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.*;
/**
 *
 * @author viewt_000
 */
public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date(2014 - 1900, 10, 21);
        System.out.println(date);
        
        Calendar c = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c2);
        System.out.println("");
        c.add(Calendar.DATE, 3);
        c2.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(c);
        System.out.println(c2);
    }
}
