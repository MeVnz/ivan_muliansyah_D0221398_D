package JavaEndOfFile;

import java.util.Scanner;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day9_java_end_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 1;
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(k+" "+s);
            k++;
        }
    }
}
