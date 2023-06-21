import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookServiceInterface service=new Services();

        do{
            System.out.println("Welcome to book management system");
            System.out.println("1. Add book\n"+
                    "2. Show All books\n"+
                    "3. Show available books\n"+
                    "4. Borrow book\n"+
                    "5. Return book\n"+
                    "6. Exit program\n");

            System.out.println("Enter your choice !");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    service.addBook();
                    break;
                case 2:
                    service.showAllBooks();
                    break;
                case 3:
                    service.showAllAvailableBooks();
                    break;
                case 4:
                    service.borrowBook();
                    break;
                case 5:
                    service.returnBook();
                    break;
                case 6:
                    System.out.println("Thank you for Using our Services !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter a valid Choice !");

            }
        }
        while(true);
    }
}
