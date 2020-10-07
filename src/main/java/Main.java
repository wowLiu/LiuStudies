public class Main {
    public static void main(String[] args) {
        System.out.println(method1(false, false, false, false));
        System.out.println(method1(true, true, true, true));
        System.out.println(method1(false, true, false, true));
        System.out.println(method1(true, false, true, false));
        System.out.println(method1(true, true, false, false));
    }

    private static boolean method1(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && !(c || d);
    }

}
//
//true || true = true
//true || false = true
//false || true = true
//false || false = false

//true && true = true
//true && false = false
//false && true = false
//false && false = false