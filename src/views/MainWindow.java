/*
* File: App.java
* Author: Kovács Attila
* Copyright: 2023,Kovács Attila 
* Date: 2023-12-04
* Licenc: MIT
*
*/
package views;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private static final String tablePanel = null;

    public void ButtonGenerate() {
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");
        JButton nextBtn = new JButton("Következő");
    }

    public void TableGenerate() {
        JPanel tablePanel = new JPanel();
    }

    public void FlopButton() {
        JButton flop1Btn = new JButton("");
        JButton flop2Btn = new JButton("");
        JButton flop3Btn = new JButton("");
    }

    public void HandPanel() {
        JPanel handPanel = new JPanel();
    }

    public void HumanCards() {
        JButton humanCard1Btn = new JButton();
        JButton humanCard2Btn = new JButton();
    }

    public void ButtonPanel() {
        JPanel buttonPanel = new JPanel();
    }

    public void TurnRiverButton() {
        JButton turnButton = new JButton();
        JButton riverButton = new JButton();
    }

    public MainWindow() {
        this.tablePanel.setSize(100, 100);
        this.tablePanel.setBackground(Color.LIGHT_GRAY);
        this.tablePanel.add(flop1Btn);
        this.tablePanel.add(flop2Btn);
        this.tablePanel.add(flop3Btn);
    }

    public Flopbuttonvisible(){
        this.flop1Btn.setVisible(false);
        this.flop2Btn.setVisible(false);
        this.flop3Btn.setVisible(false);
  }

    public ButtonStartNextStop(){
        this.buttonPanel.add(startBtn);
        this.buttonPanel.add(nextBtn);
        this.buttonPanel.add(stopBtn);
}

    public handPanel(){
    this.handPanel.add(this.humanCard1Btn);
    this.handPanel.add(this.humanCard2Btn);
}

    public tablePanel2(){
        this.tablePanel.add(turnButton);
        this.tablePanel.add(riverButton);
        
}
public TurnRiverButton(){
    this.turnButton.setVisible(false);
    this.riverButton.setVisible(false);

}

    this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.PAGE_AXIS));

    this.add(buttonPanel);this.add(tablePanel);
    this.add(handPanel);this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300,250);
}
