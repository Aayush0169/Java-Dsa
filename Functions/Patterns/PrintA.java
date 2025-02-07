public class PrintA {
    public static void main(String[] args) {
        int height = 7; // Height of the letter A
        int width = (2 * height) - 1; // Width of the letter A

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == (width / 2) - i || j == (width / 2) + i || (i == height / 2 && j > (width / 2) - i && j < (width / 2) + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
