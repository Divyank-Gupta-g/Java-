//Write a Java program to add two matrices of the same size.

import java.util.*;

class matrixadd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("rows: ");
        int r = sc.nextInt();
        System.out.print("Columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] s = new int[r][c];

        System.out.println("Enter the elements in first matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){ 
                a[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Enter the elements in second matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                b[i][j] = sc.nextInt();
            } 
        }

        System.out.println("First matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Second matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Sum matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                s[i][j] = a[i][j] + b[i][j];
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
