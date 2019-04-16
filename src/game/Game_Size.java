package game;

import java.util.Scanner;

public class Game_Size {
    Scanner sc = new Scanner(System.in);

    public int[] sizeField() {
        int[] size = new int[2];

        System.out.print("Input a size Game: ");
        size[0] = sc.nextInt();

        System.out.print("\nInput a Win size: ");
        size[1] = sc.nextInt();

        return size;
    }
}
