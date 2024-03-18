package Private;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Domino {

    //private static final int WINNING_SCORE = 105;

    public static void main(String[] args) {
        String Score = JOptionPane.showInputDialog("How Much In Is The Maximum Win : ");
        int WINNING_SCORE = Integer.parseInt(Score);
        String input = JOptionPane.showInputDialog("How Many Players : ");
        int players = Integer.parseInt(input);

        List<Player> playersList = new ArrayList<>();
        for (int i = 1; i <= players; i++) {
            String playerName = JOptionPane.showInputDialog("What Is Name User " + i + " : ");
            playersList.add(new Player(playerName));
        }

        boolean gameOver = false;
        while (!gameOver) {
            for (Player player : playersList) {
                String input2 = JOptionPane.showInputDialog("How Many Points " + player.getName() + ": ");
                int playerPoints = Integer.parseInt(input2);

                player.setScore(player.getScore() + playerPoints);

                if (player.getScore() >= WINNING_SCORE) {
                    gameOver = true;
                    JOptionPane.showMessageDialog(null, "Win " + player.getName() + " !");
                    break;
                }

                JOptionPane.showMessageDialog(null,   player.getName() + " : " + player.getScore());
            }
        }
    }

}

class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}