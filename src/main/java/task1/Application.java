package task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Application {
    public static void main(String[] args) {
        Human vasya = new Human();
        vasya.setLastName("Noncyr");
        vasya.setLastName("кириллица");
        vasya.setLastName("Уик");
        vasya.setLastName("Ву");
        vasya.setFirstName("Джон");
        vasya.setFirstName("Jora");
        vasya.setFirstName("Фу");
        vasya.setBirthDate("22.01.1999");
        vasya.setBirthDate("22.01.2033");
        vasya.setBirthDate("22.01.1999");

        System.out.print(vasya.getLastName() + " ");
        System.out.print(vasya.getFirstName() + " ");
        System.out.print(vasya.getBirthDate());
    }
}
