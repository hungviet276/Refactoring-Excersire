public class TennisGame {

    public static String getScore(String nameOfPlayerOne, String nameOfPlayerTwo, int scoreOfPlayerOne, int scoreOfPlayerTwo) {
        String score = "";
        int tempScore=0;
        if (scoreOfPlayerOne==scoreOfPlayerTwo)
        {
            score = getScoreOfPlayer(scoreOfPlayerOne);
        }
        else if (scoreOfPlayerOne>=4 || scoreOfPlayerTwo>=4)
        {
            int minusResult = scoreOfPlayerOne-scoreOfPlayerTwo;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scoreOfPlayerOne;
                else { score+="-"; tempScore = scoreOfPlayerTwo;}
                score = getTempScore(score, tempScore);
            }
        }
        return score;
    }

    private static String getTempScore(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                score+="Love";
                break;
            case 1:
                score+="Fifteen";
                break;
            case 2:
                score+="Thirty";
                break;
            case 3:
                score+="Forty";
                break;
        }
        return score;
    }

    private static String getScoreOfPlayer(int scoreOfPlayerOne) {
        String score;
        switch (scoreOfPlayerOne)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
