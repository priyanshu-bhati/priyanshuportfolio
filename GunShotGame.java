import java.util.Scanner;
import java.util.Random;

public class GunShotGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int bullets = 5;
        int score = 0;

        System.out.println("🎯 Welcome to the Gun Shot Game!");
        System.out.println("You have " + bullets + " bullets.");
        System.out.println("Try to hit the enemy. Press Enter to shoot.");

        while (bullets > 0) {
            System.out.print("Press Enter to shoot...");
            scanner.nextLine(); // Wait for Enter key

            boolean hit = random.nextBoolean(); // 50% chance to hit

            if (hit) {
                System.out.println("✅ Hit! Enemy down.");
                score++;
            } else {
                System.out.println("❌ Missed!");
            }

            bullets--;
            System.out.println("🔫 Bullets left: " + bullets + "\n");
        }

        System.out.println("🎮 Game Over!");
        System.out.println("🔢 Your Score: " + score + "/5");

        scanner.close();
    }
}