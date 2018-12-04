package ru.mirea.prakt4;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
intmilanScore = 0, madridScore = 0;
    String milanName = "AC Milan", madridName = "Real Madrid";
JLabelresultLabel = new JLabel("Result: 0 X 0"),
lastScorerLabel = new JLabel("Last Scorer: N/A"),
winnerLabel = new JLabel("Winner: DRAW");
    Button milanButton = new Button(milanName),
madridButton = new Button(madridName);

    public static void main(String[] args) {
        new Gui();
    }

    public Gui() {
super("test example");
setSize(500, 200);
setLayout(new GridLayout(3, 2));
setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);

milanScore = madridScore = 0;
milanName = "AC Milan";
madridName = "Real Madrid";

resultLabel = new JLabel("Result: 0 X 0");
lastScorerLabel = new JLabel("Last Scorer: N/A");
winnerLabel = new JLabel("Winner: DRAW");

milanButton = new Button(milanName);
madridButton = new Button(madridName);
milanButton.addActionListener(e -> {
milanScore++;
updateLabels(milanName);
        });
madridButton.addActionListener(e -> {
madridScore++;
updateLabels(madridName);
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

setVisible(true);

    }

    public void updateLabels(String lastScorer) {
resultLabel.setText(String.format("Result: %d X %d", milanScore, madridS-core));
lastScorerLabel.setText(String.format("Last Scorer: %s", lastScorer));
        String winnerName = milanScore<madridScore ?madridName : milanS-core>madridScore ? milanName : "DRAW";
winnerLabel.setText("Winner: " + winnerName);
    }
}
