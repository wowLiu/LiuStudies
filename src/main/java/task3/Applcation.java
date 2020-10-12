package task3;

public class Applcation {
    public static void main(String[] args) {
        System.out.println(phoneValidator("+7(910)423-73-12"));
        System.out.println(phoneValidator("7(910)423-73-12"));
        System.out.println(phoneValidator("89215310934"));
        System.out.println(phoneValidator("+5(911)310-12-74"));
        System.out.println(phoneValidator("+7(9fg)125-42-99"));
        System.out.println(phoneValidator("+7(122)2342343"));
    }

    static boolean phoneValidator(String phone){
        boolean isOk = true;
        for (int i = 0; i < phone.length() && isOk; i++) {
            if(i == 0){
                isOk = checkSymbolAtPosition(phone,i,'+');
            } else if (i == 1){
                isOk =checkSymbolAtPosition(phone,i,'7');
            }else if (i == 2) {
                isOk = checkSymbolAtPosition(phone, i, '(');
            }else if (i == 6) {
                isOk = checkSymbolAtPosition(phone, i, ')');
            }else if (i == 10 || i == 13) {
                isOk =checkSymbolAtPosition(phone, i, '-');
            } else {
                isOk = checkSymbolIsNumber(phone.charAt(i));
            }
        }
        return isOk;
    }

    private static boolean checkSymbolAtPosition(String str,int position,char chr){
        return str.charAt(position) == chr;
    }

    private static boolean checkSymbolIsNumber(char chr){
        return Character.isDigit(chr);
    }
}
