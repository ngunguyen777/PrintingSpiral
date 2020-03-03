package com.ngunguyen.printingspiral;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int[][] arr = {{1, 2, 3, 4, 5},
                       {6, 7, 8, 9, 10},
                       {11,12,13,14,15},
                       {16,17,18,19,20},
                       {21,22,23,24,25}};

	    printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = arr.length-1;
        int colEnd = arr[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin; i <= colEnd; i++){
                list.add(arr[rowBegin][i]);
            }
            rowBegin++;

            for(int i = rowBegin; i <= rowEnd; i++){
                list.add(arr[i][colEnd]);
            }
            colEnd--;

            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    list.add(arr[rowEnd][i]);
                }
            }
            rowEnd--;

            if(colBegin <= colEnd){
                for(int i = rowEnd; i >= rowBegin; i--){
                    list.add(arr[i][colBegin]);
                }
            }
            colBegin++;

        }
        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
}
