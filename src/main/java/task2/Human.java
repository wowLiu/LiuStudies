package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (checkCyr(lastName) && checkLength(lastName) && checkLettersCase(lastName)){
            this.lastName = lastName;
        }else System.out.println("Incorrect last name " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (checkCyr(firstName) && checkLength(firstName) && checkLettersCase(firstName)){
            this.firstName = firstName;
        }else System.out.println("Incorrect first name " + firstName);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String sDate) {
        Date date = null;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (checkDate(date)){
            this.birthDate = date;
        } else System.out.println("Incorect date " + sDate);
    }

    private boolean checkCyr(String str){
        return Pattern.matches(".*\\p{InCyrillic}.*", str);
    }

    private boolean checkLettersCase(String str){
        return Pattern.matches("[А-Я][а-я]+", str);
    }

    private boolean checkLength(String str){
        return str.length() >= 3;
    }

    private boolean checkDate(Date date){
        Date currentDate = new Date();
        if (date != null){
            return date.before(currentDate);
        }
        else {
            System.out.println("Date is incorrect");
        }
        return false;
    }
}
