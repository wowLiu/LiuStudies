package task5;

import java.util.Random;

public class Applcation {
    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix();
        int[][] invertedMatrix = invertMatrix(matrix);
        print(matrix);
        System.out.println("--------------");
        print(invertedMatrix);
    }

    public static int[][] createRandomMatrix(){
        int rand1 = (int)(Math.random()*2+3);
        int rand2 = (int)(Math.random()*2+3);
        int[][] matrix = new int[rand1][rand2];
        for (int i = 0; i < rand1; i++) {
            for (int j = 0; j < rand2; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }
    public static void print(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    public static int[][] invertMatrix(int[][] matrix){
        int[][] invertedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    invertedMatrix[j][i] = matrix[i][j];
            }
        }
        return invertedMatrix;
    }
}
