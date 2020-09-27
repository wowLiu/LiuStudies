public class RectangularAnalyser {
    public static boolean isSquareMoreThanPerimeter(int weight, int height){
        int square = weight * height;
        int perimeter = (weight + height) * 2;
        return square > perimeter;
    }

}
