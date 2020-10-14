package task3.workers;

public class ServiceDesk {
    private static int ticketCounter = 0;
    public static void createTicket(String description){
        ticketCounter++;
        if (description.contains("справк") ||description.contains("отчет") || description.contains("бюджет")){
            Accountant.takeTicket(ticketCounter);
        } else if(description.contains("доставк") ||description.contains("курьер")){
            Logistician.takeTicket(ticketCounter);
        } else if(description.contains("компьютер") || description.contains("принтер") || description.contains("сервер")) {
            SysAdmin.takeTicket(ticketCounter);
        }else if(description.contains("уборк")) {
            Cleaner.takeTicket(ticketCounter);
        } else System.out.println("Специалист по выполнению данной заявки не найден");
    }
}
