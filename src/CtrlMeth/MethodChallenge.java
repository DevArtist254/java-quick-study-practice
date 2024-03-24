package CtrlMeth;

public class MethodChallenge {

    public static void main(String[] args) {

        displayHighScorePosition("Kevin", calculateHighScorePos(1800));
        displayHighScorePosition("Brian", calculateHighScorePos(700));
        displayHighScorePosition("Jeff", calculateHighScorePos(300));
        displayHighScorePosition("James", calculateHighScorePos(50));

    }

    public static void displayHighScorePosition(String playerName, int highScore) {
        System.out.println(playerName + " managed to get into position " + highScore + " on the high score list");
    }

    public static int calculateHighScorePos(int playerScore) {

        //Default data
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
