package task4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Applcation {
    public static void main(String[] args) {
        System.out.println(getCommonSymbs("hello"," world"));
        System.out.println(getCommonSymbs("ping"," pong"));
        System.out.println(getCommonSymbs("qwer"," asdf"));
        System.out.println(getCommonSymbs("post"," get"));
    }

    private static String getCommonSymbs(String str1, String str2){
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)){
                    result = result + str1.charAt(i);
                }
            }
        }

        char[] chars = result.toCharArray();
        Arrays.sort(chars);
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();
    }
}
