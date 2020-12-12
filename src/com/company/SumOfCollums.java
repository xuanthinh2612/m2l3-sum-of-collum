package com.company;

import java.util.Scanner;

public class SumOfCollums {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new SumOfCollums().creat();
        System.out.println("insert index of collum");
        int index = scanner.nextInt();
        int sum = new SumOfCollums().sum(arr,index);
        System.out.println("Sum of collum at\t"+index+"\tis:\t"+sum);
    }
    int[][] creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert row");
        int row = scanner.nextInt();
        System.out.println("insert collum");
        int collum = scanner.nextInt();
        int[][] arr = new int[row][collum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                arr[i][j] = (int) Math.round(Math.random()*100);
            }
        }
        return arr;
    }
    public int sum(int[][] arr, int index){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total +=arr[i][index];
        }
        return total;
    }
}
