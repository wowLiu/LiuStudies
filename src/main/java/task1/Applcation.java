package task1;

public class Applcation {
    public static void main(String[] args) {
        String[] massive = {"Пятница", "это", "лучший", "день", "недели"};

        methodFor(massive);
        methodForEach(massive);
        methodWhile(massive);
    }

    private static void methodFor(String[] massive){
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i]);
            if (i != massive.length-1){
                System.out.print(" ");
            }else{
                System.out.print(".");
            }
        }
    }

    private static void methodForEach(String[] massive){
        String[] massiveTemp = new String[massive.length];
        for (int i = 0; i < massive.length; i++) {
            massiveTemp[i] = massive[i] + " ";
        }

        massiveTemp[massiveTemp.length-1] = massiveTemp[massiveTemp.length-1].replace(" ", ".");

        for (String element:massiveTemp) {
            System.out.print(element);
        }
    }

    private static void methodWhile(String[] massive){
        int i = 0;
        while (i < massive.length){

            System.out.print(massive[i]);
            i++;
            if (i != massive.length){
                System.out.print(" ");
            }else{
                System.out.print(".");
            }
        }
    }
}
