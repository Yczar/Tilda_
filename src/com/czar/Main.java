package com.czar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey there tilda");

        matrixPrinter(matrixMultiplier(matrixReader(), matrixReader()));
    }

    public static int[][] matrixReader(){
        int[][] matrix = new int[2][2];

        System.out.println("Please enter your 2 X 2 matrix details:");
        System.out.println();
        for (int i = 0; i <matrix.length; i++){
            for (int j = 0; j <matrix[0].length; j++){
                System.out.println("row: " + (i+1) + "" + " Column:" + (j+1));
                Scanner scan = new Scanner(System.in);
                matrix[i][j] = scan.nextInt();

            }
        }
        return matrix;
    }
    //Method to multiply the first and the second matrix
    public static int[][] matrixMultiplier(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2.length];

        for (int i = 0; i <result.length; i++){
            for (int j = 0; j <result[0].length; j++){
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

    //Method to print out both the matrix multiplication
    public static void matrixPrinter(int[][] result){

        System.out.println();
        System.out.println("The multiplication of both inputed matrix is:");
        for (int i = 0; i <result.length; i++){
            for (int j = 0; j <result[0].length; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
