package game.TicTacToe.Game;

import java.util.Scanner;

public class GameLogic {

    Scanner scanner = new Scanner(System.in);
    private int p1Score = 0;
    private int p2Score = 0;

    private void showScore() {
        System.out.println("Счёт первого игрока: " + this.p1Score);
        System.out.println("Счёт второго игрока: " + this.p2Score);
    }
    private void turn(Map currentGame) {
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.print("Символ: ");
        char symb = scanner.next().charAt(0);
        currentGame.putFigure(x, y, symb);
    }
    public void mainLoop(Map currentGame) {

        while (true) {
            System.out.println("Ходит первый игрок, введите координаты установки символа, затем символ");
            turn(currentGame);
            currentGame.showField();
            int winner1 = currentGame.checkGame();
            if (winner1 == 1) {
                System.out.println("Первый игрок победил");
                this.p1Score +=1;
                break;
            }
            System.out.println("Ходит второй игрок, введите координаты установки символа, затем символ");
            turn(currentGame);
            currentGame.showField();
            int winner2 = currentGame.checkGame();
            if (winner2 == 1) {
                System.out.println("Второй игрок победил");
                this.p2Score += 1;
                break;
            }
        }
        showScore();
    }
}
