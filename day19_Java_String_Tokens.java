package JavaStringTokens;

import java.io.*;
import java.util.*;

public class day19_Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replaceAll("[!,?,._'@\\s]+", " ");
        //String[] result = s.split("\\s");
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens() ;
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}
