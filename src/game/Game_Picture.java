package game;

import java.util.Scanner;

public class Game_Picture {
    Scanner sc = new Scanner(System.in);
    String[][] sizeArray;
    int cont = 0;
    int qayl = 0;
    String nermucum[];
    int tver[] = new int[2];

    public String[][] xaxiTvyalner() {
        return sizeArray;
    }

    public void gamePicture(int size) {
        sizeArray = new String[size][size];
//        int cont
        for (int i = 0; i < size; i++) {
            System.out.print(i + "--");
            for (int j = 0; j < size; j++) {
                sizeArray[i][j] = "□";
                System.out.print(j +  sizeArray[i][j] + " " );
            }
            System.out.println();
        }
    }

    public void playersEnter() {
        cont++;
        System.out.println("nermuceq Dasht@");
        nermucum = sc.nextLine().split("");
        tver[0] = Integer.parseInt(nermucum[0]);
        tver[1] = Integer.parseInt(nermucum[1]);
        pictureGame(tver[0], tver[1]);
    }

    public void pictureGame(int tiv1, int tiv2) {
        qayl++;
        if (qayl%2 == 1) {
            sizeArray[tiv1][tiv2] = "X";
        } else {
            sizeArray[tiv1][tiv2] = "O";
        }

        newPictureMethod();
    }

    public void newPictureMethod() {
        for (int i = 0; i < sizeArray.length; i++) {
            System.out.print(i + "--");
            for (int j = 0; j < sizeArray.length; j++) {
                System.out.print(j + sizeArray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
