import java.util.Scanner;

public class PhLevelAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int phValue = scanner.nextInt();
        System.out.print("Enter the ph value of the aquarium: " + phValue );

        scanner.close();
    }
}
