package task3.workers;

class Logistician {
    static String profession = "логистом";
    protected static void takeTicket(int ticketNumber){
        System.out.println("«Заявка " + ticketNumber + " была принята " + profession);
    }
}