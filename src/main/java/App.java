import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String DNAsequence = scanner.nextLine();
        int blockSize = 0;
        int maxBlockSize = 0;
        for (int currentIndex = 0; currentIndex < DNAsequence.length(); ++currentIndex) {
            if (currentIndex != 0 && DNAsequence.charAt(currentIndex) == DNAsequence.charAt(currentIndex - 1)) {
                ++blockSize;
            } else {
                maxBlockSize = Math.max(maxBlockSize, blockSize);
                blockSize = 1;
            }
        }
        maxBlockSize = Math.max(maxBlockSize, blockSize);
        System.out.println(maxBlockSize);
    }
}
