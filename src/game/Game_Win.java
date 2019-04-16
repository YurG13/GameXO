package game;

public class Game_Win {
    public boolean version_1(String[][] xaxiTvyalner, int sizeWin) {
        int cont = 0;
        for (int i = 0; i < xaxiTvyalner.length - sizeWin; i++) {
            for (int j = 0; j < xaxiTvyalner.length - sizeWin; j++) {
                for (int l = j; l < xaxiTvyalner.length - sizeWin; l++) {
                    if (xaxiTvyalner[i][l].equals("X")) {
                        cont++;
                    } else if (xaxiTvyalner[i][l].equals("O")) {
//
                    } else {
                        break;
                    }
                }
                if (cont == sizeWin) {
                    return true;
                }
                cont = 0;

                for (int l = j; l < j+sizeWin; l++) {
                    if (xaxiTvyalner[l][i].equals("X")) {
                        cont++;
                    } else if (xaxiTvyalner[i][l].equals("O")) {
                        cont++;
                    } else {
                        break;
                    }
                }
                if (cont == sizeWin) {
                    return true;
                }
                cont = 0;
            }

        }
        return false;
    }
}
