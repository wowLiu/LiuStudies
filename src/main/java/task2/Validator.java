package task2;

public  class Validator {
    public static boolean validateSpaces(String str) {
        int spaceCunter = 0;
        for (char chr : str.toCharArray()) {
            if (chr == ' ') {
                spaceCunter++;
            }
        }
        if (spaceCunter == 2) {
            System.out.println("Spaces count is correct: " + (spaceCunter == 2));
            return true;
        } else {
            System.out.println("Spaces count is correct: " + (spaceCunter == 2));
            return false;
        }
    }

    public static String[] getSubStrings(String str) {
        String [] array = str.split(" ");
        System.out.println("Substrings :");
        for (String element : array) {
            System.out.print(element + " ");
        }
        return array;
    }

    public static boolean validateHuman(Human human) {
        boolean vresults = human.getBirthDate() != null &&
                human.getFirstName() != null &&
                human.getLastName() != null;
        System.out.println("Human data initialized: " + vresults);
        return vresults;
    }

    public static boolean validateHumanArray(Human[] humans){
        boolean arrayFull = !(humans[humans.length-1] == null);
        System.out.println("Array is full: " + arrayFull);
        return arrayFull;
    }
}
