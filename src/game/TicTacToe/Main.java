package game.TicTacToe;

import game.TicTacToe.Game.GameLogic;
import game.TicTacToe.Game.Map;

import java.util.Scanner;


public class Main {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        GameLogic game = new GameLogic();
        Map currentGame = new Map();
        System.out.println("Игра крестики-нолики, первым ходит крестик, потом нолик");
        char cont = 'y';
        while (cont == 'y') {
            currentGame.setField();
            currentGame.showField();
            game.mainLoop(currentGame);
            System.out.println("Хотите продолжить? y - да, n - нет");
            cont = scanner.next().charAt(0);

        }
    }

    public static void main(String[] args) {
        startGame();
    }

}
