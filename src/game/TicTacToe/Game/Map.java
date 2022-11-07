package game.TicTacToe.Game;


public class Map {
    private char[][] field;

    public int checkGame() {
        int res = 0;
        if (this.field[0][0] == this.field[1][1] && this.field[0][0] == this.field[2][2] && this.field[0][0] != '□' ||
                this.field[2][0] == this.field[1][1] && this.field[2][0] == this.field[0][2] && this.field[2][0] != '□' ||
                this.field[0][0] == this.field[0][1] && this.field[0][0] == this.field[0][2] && this.field[0][0] != '□' ||
                this.field[1][0] == this.field[1][1] && this.field[1][0] == this.field[1][2] && this.field[1][0] != '□' ||
                this.field[2][0] == this.field[2][1] && this.field[2][0] == this.field[2][2] && this.field[2][0] != '□' ||
                this.field[0][0] == this.field[1][0] && this.field[0][0] == this.field[2][0] && this.field[0][0] != '□' ||
                this.field[0][1] == this.field[1][1] && this.field[0][1] == this.field[2][1] && this.field[0][1] != '□' ||
                this.field[0][2] == this.field[1][2] && this.field[0][2] == this.field[2][2] && this.field[0][2] != '□' )
            res = 1;
        return res;
    }

    public void showField() {
        for (char[] el: this.field) {
            System.out.println(el);
        }
    }

    public void putFigure(int x, int y, char figure) {
        this.field[y][x] = figure;
    }

    public void setField() {
        this.field = new char[][]{{'□', '□', '□'}, {'□', '□', '□'}, {'□', '□', '□'}};
    }
}
