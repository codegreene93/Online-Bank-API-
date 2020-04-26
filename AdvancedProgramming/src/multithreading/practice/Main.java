package multithreading.practice;

public class Main {
	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		
		
		TicketOffice1 ticketOffice1 = new TicketOffice1(cinema);
		Thread thread1 = new Thread(ticketOffice1, "TiccketOffice1");
		
		TicketOffice2 ticketOffice2 = new TicketOffice2(cinema);
		Thread thread2 = new Thread(ticketOffice2, "TicketOffice2");
		
		thread1.start();
		thread2.start();
		
		try {
			thread2.join();
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Room1 Vacancies: %d%n", cinema.getVacanciesCinema1());
		System.out.printf("Room 2 Vacancies: %d%n", cinema.getVacanciesCinema2());
	}
}
