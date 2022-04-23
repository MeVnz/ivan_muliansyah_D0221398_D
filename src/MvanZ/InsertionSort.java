package MvanZ;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang Index : ");
        int panjang = sc.nextInt();
        
        for(int i = 0; i < panjang; i++){
            System.out.print("Index ke "+i+" : ");
            int nilai = sc.nextInt();
            arr.add(nilai);
        }
        int n = arr.size();
        int i = 1;
        int j;
        while(i<n){
            int temp = arr.get(i);
            for( j = i; j > 0; j--){
                if(temp < arr.get(j-1)){
                    arr.set(j, arr.get(j-1));
                }
                else{
                    break;
                }
            }
            arr.set(j, temp);
            i++;
        }
        System.out.println(arr);
    }
}
