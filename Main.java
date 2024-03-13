import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" wpisz miasto zamieszkania:");
        String city = scanner.nextLine();
        System.out.println("wpisz wiek:");
        int age = scanner.nextInt();
        System.out.println("czy jest czwartek? (true/false)");
        boolean isThursday = scanner.nextBoolean();
        double ticketPrice = 40.0;
        if (age < 10) {
            ticketPrice = 0.0;
        } else if (age >= 10 && age <= 18) {
            ticketPrice *= 0.5;
        }
        if (city.equalsIgnoreCase("Warszawa")) {
            ticketPrice *= 0.9;
        }
        if (isThursday) {
            ticketPrice = 0.0;
        }
        double discount = 100 - (ticketPrice / 40 * 100); // Calculate discount percentage
        System.out.println("Data: " + city + ", " + age + " years old, " + (isThursday ? "weekday" : "weekend"));
        System.out.println("Ticket price: " + ticketPrice + " PLN, Discount: " + discount + "%");
        scanner.close();
    }
}
