import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("How many social links would you like to track?: ");
        int size = scanner.nextInt();   
        socialLinkStats[] socialLinks = new socialLinkStats[size];
        for (int i; i<size; i++){
            System.out.print("Rank: ");
            int rank = scanner.nextInt();
            
            System.out.print("Familiarity: ");
            int familiarity = scanner.nextInt();
            
            scanner.nextLine();  
            
            System.out.print("Role: ");
            String role = scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            // Instantiate a SocialLinkStats object and add it to the ArrayList
            socialLinks.add(new socialLinkStats(rank, familiarity, role, name));
        }
}
}