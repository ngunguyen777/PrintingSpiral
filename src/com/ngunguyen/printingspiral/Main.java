package com.ngunguyen.printingspiral;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int[][] arr = {{1, 2, 3, 4, 5, 6},
                       {7, 8, 9, 10,11,12},
                       {13,14,15,16,17,18},
                       {19,20,21,22,23,24},
                       {25,26,27,28,29,30},
                       {31,32,33,34,35,36}};

	    printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = arr.length;
        int colEnd = arr[0].length;

        while(rowBegin < rowEnd || colBegin < colBegin) {
            for (int i = rowBegin; i < colEnd; i++) {
                System.out.print(arr[rowBegin][i] + " ");
            }
            rowBegin++;
            for (int i = rowBegin; i < rowEnd; i++) {
                System.out.print(arr[i][rowEnd - 1] + " ");
            }
            colEnd--;
            for (int i = colEnd - 1; i >= colBegin; i--) {
                System.out.print(arr[rowEnd - 1][i] + " ");
            }
            rowEnd--;
            for (int i = rowEnd - 1; i >= rowBegin; i--) {
                System.out.print(arr[i][colBegin] + " ");
            }
            colBegin++;
        }

    }
}
