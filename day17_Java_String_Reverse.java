package JavaStringReverse;

import java.io.*;
import java.util.*;

public class day17_Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(A);
        String balikan = sb.reverse().toString();
        System.out.println(A.equals(balikan)?"Yes":"No");
    }
}
