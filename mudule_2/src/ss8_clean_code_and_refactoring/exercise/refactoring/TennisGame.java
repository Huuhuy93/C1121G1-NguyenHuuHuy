package ss8_clean_code_and_refactoring.exercise.refactoring;

public class TennisGame {
    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String scorePlayer = "";
        int tempScore = 0;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    scorePlayer = "Love-All";
                    break;
                case 1:
                    scorePlayer = "Fifteen-All";
                    break;
                case 2:
                    scorePlayer = "Thirty-All";
                    break;
                case 3:
                    scorePlayer = "Forty-All";
                    break;
                default:
                    scorePlayer = "Deuce";
                    break;

            }
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int brandResult = scorePlayer1 - scorePlayer2;
            if (brandResult == 1) scorePlayer = "Advantage player1";
            else if (brandResult == -1) scorePlayer = "Advantage player2";
            else if (brandResult >= 2) scorePlayer = "Win for player1";
            else scorePlayer = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    scorePlayer += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        scorePlayer += "Love";
                        break;
                    case 1:
                        scorePlayer += "Fifteen";
                        break;
                    case 2:
                        scorePlayer += "Thirty";
                        break;
                    case 3:
                        scorePlayer += "Forty";
                        break;
                }
            }
        }
        return scorePlayer;
    }
}
