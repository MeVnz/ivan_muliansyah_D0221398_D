package MvanZ;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang Index : ");
        int panjang = sc.nextInt();

        for(int i = 0; i < panjang; i++){
            System.out.print("Nilai index ke "+i+" : ");
            int nilai = sc.nextInt();
            arr.add(nilai);
        }
        System.out.println("===SEBELUM==="+arr);
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size()-1; j++){
                if(arr.get(j) > arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
        System.out.println("===SESUDAH==="+arr);
    }
}
