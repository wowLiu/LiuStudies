package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {

    public static void main(String[] args) {
        Human[] humans = new Human[3];
        int index = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку в формате [%s %s %s]:");
            String input = null;
            try {
                input = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            boolean inputValid = Validator.validateSpaces(input);
            if (!inputValid) continue;

            String[] humanFields = Validator.getSubStrings(input);

            Human human = new Human();
            human.setLastName(humanFields[0]);
            human.setFirstName(humanFields[1]);

            human.setBirthDate(humanFields[2]);

            boolean isHumanValid = Validator.validateHuman(human);
            if (!isHumanValid) continue;

            humans[index++] = human;
            boolean isArrayFull = Validator.validateHumanArray(humans);
            if (isArrayFull) break;
        }
    }
}
