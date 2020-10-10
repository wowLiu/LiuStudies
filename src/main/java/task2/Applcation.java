package task2;

public class Applcation {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        array[i][j] = 1;
                    } else array[i][j] = 0;
                }else {
                    if (j % 2 == 0) {
                        array[i][j] = 0;
                    } else array[i][j] = 1;
                }
            }
        }
        printWhile(array);
    }


    public static void printFor(int[][] array){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void printForEach(int[][] array){
        for (int [] k :array){
            for(int i: k){
                System.out.println(i);
            }
        }
    }

    public static void printWhile(int[][] array){
        int i = 0;
        int j = 0;
        while (i < 8) {
            while (j < 8) {
                System.out.print(array[i][j]);
                j++;
            }
            j = 0;
            System.out.println();
            i++;
        }
    }
}
