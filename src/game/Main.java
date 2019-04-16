package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Players_Parametr pParametr = new Players_Parametr();
        Game_Size size_game = new Game_Size();
        Game_Picture game_picture = new Game_Picture();
        Game_Win winGame = new Game_Win();

        Scanner sc = new Scanner(System.in);
        String parametr[],symbolPlayer1, symbolPlayer2, namePlayer2, namePlayer1;
        int size[], sizeField, sizeWin;

        parametr = pParametr.playersParametr();
        namePlayer1 = parametr[0];
        namePlayer2 = parametr[1];
        symbolPlayer1 = parametr[2];
        symbolPlayer2 = parametr[3];

        System.out.println("P1 " + namePlayer1 + "\nP2 " + namePlayer2 + "\nS1 " + symbolPlayer1 + "\nS2 " + symbolPlayer2);

        size = size_game.sizeField();
        sizeField = size[0];
        sizeWin = size[1];

        System.out.println("Size field is: " + sizeField + "\nSize Win is: " + sizeWin);

        game_picture.gamePicture(sizeField);

//
        game_picture.playersEnter();
        int i = 1;
        while (!winGame.version_1(game_picture.xaxiTvyalner(), sizeWin) && i < sizeWin*sizeWin) {
            game_picture.playersEnter();
            i++;
        }

        if (winGame.version_1(game_picture.xaxiTvyalner(), sizeWin)) {
            System.out.println("You Win!");
        } else {
            System.out.println("Xax@ avartvec");
        }
    }
}
