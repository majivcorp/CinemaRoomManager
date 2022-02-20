package cinema;

import java.util.*;

public class Cinema {
    Scanner sc = new Scanner(System.in);
    int rows = 0;
    int seats = 0;
    int totalSeats = 0;
    int purchasedTickets = 0;
    int currentIncome = 0;
    int totalIncome = 0;
    String[][] arr;

    public void createArray() {
        this.arr = new String[rows + 1][seats + 1];
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                arr[i][j] = i == 0 ? String.valueOf(j) : j == 0 ? String.valueOf(i) : "S";
            }
        }
        this.arr[0][0] = "  ";
    }

    public void printSeats() {
        System.out.println("Cinema: ");
        System.out.println(Arrays.deepToString(this.arr)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "\n"));
    }

    public void printOptions() {
        int option = 0;
        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            option = this.sc.nextInt();

            switch (option) {
                case 1:
                    this.printSeats();
                    break;
                case 2:
                    this.buyTicket();
                    break;
                case 3:
                    this.stats();
                    break;
                default:
                    break;
            }
        } while (option != 0);
    }

    public void buyTicket() {
        System.out.println("Enter a row number:");
        int chosenRow = this.sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int chosenSeat = this.sc.nextInt();

        if (chosenRow > this.rows || chosenSeat > this.seats) {
            System.out.println("Wrong input!");
            this.buyTicket();
        } else if (this.arr[chosenRow][chosenSeat] == "B") {
            System.out.println("That ticket has already been purchased!");
            this.buyTicket();
        } else {
            int price = this.rows * this.seats <= 60 || chosenRow <= this.rows / 2 ? 10 : 8;

            System.out.println("Ticket price: $" + price);

            this.arr[chosenRow][chosenSeat] = "B";
            this.currentIncome += price;
            this.purchasedTickets += 1;
        }
    }

    public void stats() {
        double percentage = this.purchasedTickets * 100.00 / this.totalSeats;
        System.out.println("Number of purchased tickets: " + this.purchasedTickets);
        System.out.printf("Percentage: %.2f%c\n", percentage, '%');
        System.out.println("Current income: $" + this.currentIncome);
        System.out.println("Total income: $" + this.totalIncome);
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        System.out.println("Enter the number of rows:");
        cinema.rows = cinema.sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        cinema.seats = cinema.sc.nextInt();
        cinema.totalSeats = cinema.rows * cinema.seats;

        cinema.totalIncome = cinema.totalSeats / 2 * 10 + cinema.totalSeats / 2 * 8;

        cinema.createArray();

        cinema.printOptions();

    }
}