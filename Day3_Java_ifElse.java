/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_java_if.pkgelse;

import java.util.Scanner;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 *
 * @author Ivan
 */
public class Day3_Java_ifElse {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==1){
            System.out.println ("Weird");
        }else{
            if(2 <=N && N<=5){
                System.out.println ("Not Weird");
            }else if (6 <=N && N<=20){
                System.out.println ("Weird");
            }else if(N>20){
                System.out.println ("Not Weird");
            }   
        }
    }
    
}
