package MvanZ;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    private final ArrayList<Integer> arrayToSort;

    public MergeSort(ArrayList<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public ArrayList<Integer> getArrayAfterSorting() {
        return arrayToSort;
    }

    public void divideArrayElements(int indexStart, int indexEnd) {

        if (indexStart < indexEnd && (indexEnd - indexStart) >= 1) {
            int middleElement = (indexEnd + indexStart) / 2;

            divideArrayElements(indexStart, middleElement);
            divideArrayElements(middleElement + 1, indexEnd);

            mergeArrayElements(indexStart, middleElement, indexEnd);
        }
    }

    public void mergeArrayElements(int indexStart, int indexMiddle, int indexEnd) {

        ArrayList<Integer> tempArray = new ArrayList<>();

        int getLeftIndex = indexStart;
        int getRightIndex = indexMiddle + 1;

        while (getLeftIndex <= indexMiddle && getRightIndex <= indexEnd) {

            if (arrayToSort.get(getLeftIndex) <= arrayToSort.get(getRightIndex)) {

                tempArray.add(arrayToSort.get(getLeftIndex));
                getLeftIndex++;

            } else {

                tempArray.add(arrayToSort.get(getRightIndex));
                getRightIndex++;

            }
        }

        while (getLeftIndex <= indexMiddle) {
            tempArray.add(arrayToSort.get(getLeftIndex));
            getLeftIndex++;
        }

        while (getRightIndex <= indexEnd) {
            tempArray.add(arrayToSort.get(getRightIndex));
            getRightIndex++;
        }


        for (int i = 0; i < tempArray.size(); indexStart++) {
            arrayToSort.set(indexStart, tempArray.get(i++));

        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang Index : ");
        int panjang = sc.nextInt();
        for(int i = 0; i < panjang; i++){
            int nilai = sc.nextInt();
            arr.add(nilai);
        }
        MergeSort exampleClass1 = new MergeSort(arr);

        System.out.println("===SEBELUM===");
        for(int integer : exampleClass1.getArrayAfterSorting()){
            System.out.print(integer+" ");
        }
        System.out.println();

        exampleClass1.divideArrayElements(0, arr.size()-1);

        System.out.println("===SESUDA===");
        for(int integer : exampleClass1.getArrayAfterSorting()){
            System.out.print(integer+" ");
        }
        System.out.println();
    }
}    