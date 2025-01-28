package coreJavaHT_LanguageConstruct;

public class Task1 {

	/**
	 * Problem statement: You are driving a little too fast, and a police officer
	 * stops you. Write code to compute the result, encoded as an int value: 0=no
	 * ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is
	 * 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81
	 * or more, the result is 2. Unless it is your birthday -- on that day, your
	 * speed can be 5 higher in all cases.
	 */
	
	
	public static void main(String[] args) {
        int speed = 75;
        boolean isBirthday = false;
        int ticketType = getTicketType(speed, isBirthday);
        System.out.println("Ticket type: " + ticketType);
    }

    public static int getTicketType(int speed, boolean isBirthday) {
        int ticket = 0;
        
        // Increase speed threshold by 5 if it is the driver's birthday
        int speedonbirthday = isBirthday ? 5 : 0;
        
        if (speed <= 60 + speedonbirthday) {
            ticket = 0; 
        } else if (speed <= 80 + speedonbirthday) {
            ticket = 1; 
        } else {
            ticket = 2; 
        }
        
        return ticket;
    }

}
