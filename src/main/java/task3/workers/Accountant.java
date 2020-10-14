package task3.workers;

 class Accountant {
     static String profession = "бухгалтером";
    protected static void takeTicket(int ticketNumber){
        System.out.println("«Заявка " + ticketNumber + " была принята " + profession);
    }
}
