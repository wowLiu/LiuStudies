public class Main {
    public static void main(String[] args) {
        System.out.println(intoMeter(115));
        System.out.println(intoMeter(800));
        System.out.println(intoMeter(278));
    }
    public static int intoMeter(int sm){
        return (int) Math.floor(Double.valueOf(sm / 100));
    }
}
