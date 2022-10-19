import java.util.Scanner;

public class PhLevelAnalyser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ph value of the aquarium: ");
        int phValue = scanner.nextInt();
        if (phValue < 7){
            System.out.println("ph value is low, partial water change required");
        }
        else if (phValue >= 7 && phValue <=8){
            System.out.println("ph value is fine");
        }
        else if (phValue > 8){
            System.out.println("ph value is high, partial water change required");
        }

        scanner.close();
    }
}
