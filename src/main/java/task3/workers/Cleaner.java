package task3.workers;

class Cleaner {
    static String profession = "уборщиком";
    protected static void takeTicket(int ticketNumber){
        System.out.println("«Заявка " + ticketNumber + " была принята " + profession);
    }
}