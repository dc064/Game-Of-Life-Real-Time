package display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import settings.GlobalSettings;

public class GOLFrame extends JFrame {

  public GOLPanel panel;
  public JButton neighbourButton, borderButton, colorButton, delayIncreaseButton, delayDecreaseButton, randomCellButton;

  public GOLFrame() {
    this.setSize(GlobalSettings.window_w, GlobalSettings.window_h);
    setLayout(null);
    panel = new GOLPanel();
    neighbourButton = new JButton("Neighbourhood");
    borderButton = new JButton("Border");
    colorButton = new JButton("Color");
    delayIncreaseButton = new JButton("Delay +");
    delayDecreaseButton = new JButton("Delay -");
    randomCellButton = new JButton("Add random cells");

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.add(panel);
    this.add(neighbourButton);
    this.add(borderButton);
    this.add(colorButton);
    this.add(delayIncreaseButton);
    this.add(delayDecreaseButton);
    this.add(randomCellButton);

    this.neighbourButton.setBounds(GlobalSettings.window_w - 250, GlobalSettings.window_h - 150, 170, 60);
    this.neighbourButton.setVisible(true);
    neighbourButton.setVisible(true);
    neighbourButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        GlobalSettings.changeNeighbourhood();
      }
    });

    this.borderButton.setBounds(GlobalSettings.window_w - 250, GlobalSettings.window_h - 250, 170, 60);
    this.borderButton.setVisible(true);
    borderButton.setVisible(true);
    borderButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        GlobalSettings.changeBorders();
      }
    });

    this.colorButton.setBounds(GlobalSettings.window_w - 250, GlobalSettings.window_h - 350, 170, 60);
    this.colorButton.setVisible(true);
    colorButton.setVisible(true);
    colorButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        GlobalSettings.changeColor(GlobalSettings.color);
      }
    });

    this.delayIncreaseButton.setBounds(GlobalSettings.window_w - 250, GlobalSettings.window_h - 450, 170, 60);
    this.delayIncreaseButton.setVisible(true);
    delayIncreaseButton.setVisible(true);
    delayIncreaseButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        GlobalSettings.increaseDelay();
      }
    });

    this.delayDecreaseButton.setBounds(GlobalSettings.window_w - 250, GlobalSettings.window_h - 550, 170, 60);
    this.delayDecreaseButton.setVisible(true);
    delayDecreaseButton.setVisible(true);
    delayDecreaseButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        GlobalSettings.decreaseDelay();
      }
    });

    this.randomCellButton.setBounds(GlobalSettings.window_w - 250, GlobalSettings.window_h - 650, 170, 60);
    this.randomCellButton.setVisible(true);
    randomCellButton.setVisible(true);
    randomCellButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        GlobalSettings.addRandomCells();
      }
    });

    this.panel.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}