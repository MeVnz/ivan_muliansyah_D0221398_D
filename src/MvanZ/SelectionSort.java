package MvanZ;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang Index : ");
        int panjang = sc.nextInt();

        for(int i = 0; i <=panjang-1; i++){
            System.out.print("Index ke "+i+" : ");
            int nilai = sc.nextInt();
            arr.add(nilai);
        }
        for(int i = 0; i <=panjang-2; i++){
            int angka = i;
            for(int j = i+1; j <=panjang-1; j++){
                if(arr.get(j) < arr.get(angka)){
                    angka = j;
                }
            }
            if(angka != 1){
                int temp = arr.get(i);
                arr.set(i, arr.get(angka));
                arr.set(angka, temp);
            }
        }
        System.out.println(arr);
    }
}
