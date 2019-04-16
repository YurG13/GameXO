package game;

import java.util.Scanner;

public class Players_Parametr {
    Scanner sc = new Scanner(System.in);

    public String[] playersParametr() {
        String[] parametr = new String[4];

        System.out.print("Input a name Player1 _ : ");
        parametr[0] = sc.nextLine();

        System.out.print("\n Input a name Player2 _ : ");
        parametr[1] = sc.nextLine();

        System.out.print("\n Input a symbol << X >> or << O >> Player1 _ : ");
        parametr[2] = sc.nextLine();

        if (parametr[2].equals("X")) {
            parametr[3] = "O";
        } else {
            parametr[3] = "X";
        }

//        System.out.println("\n Input size Game: ");
//        parametr[4] = sc.nextLine();
        return parametr;
    }
}
