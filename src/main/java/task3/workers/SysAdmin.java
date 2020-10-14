package task3.workers;

class SysAdmin {
    static String profession = "системным администратором";
    protected static void takeTicket(int ticketNumber){
        System.out.println("«Заявка " + ticketNumber + " была принята " + profession);
    }
}