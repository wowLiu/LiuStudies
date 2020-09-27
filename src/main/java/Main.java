public class Main {
    public static void main(String[] args) {
        System.out.println(oddOrNot(14));
        System.out.println(oddOrNot(19));
    }

    public static boolean oddOrNot(int n) {
        return  n % 2 != 0;
        // остаток при делении на два !не равен 0 (то, что после запятой). т.е. нечетное
    }
}
