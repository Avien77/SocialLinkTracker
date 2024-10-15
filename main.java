import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("How many social links would you like to track?: ");
        int size = scanner.nextInt();   
        socialLinkStats[] socialLinks = new socialLinkStats[size];
        for (int i=0; i<size; i++){
            scanner.nextLine();  
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Role: ");
            String role = scanner.nextLine();
        
            System.out.print("Rank: ");
            int rank = scanner.nextInt();
            //How close someone is to you
            System.out.print("Value: ");
            int familiarity = scanner.nextInt();
            //How much emotional value they bring to you.
            

            // Instantiate a SocialLinkStats object and add it to the ArrayList
            socialLinks[i] = new socialLinkStats(rank, familiarity, role, name);
        }
        scanner.close();
    }
}