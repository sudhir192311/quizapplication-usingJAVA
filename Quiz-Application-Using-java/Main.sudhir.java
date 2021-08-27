import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
*/
  it will crate a frame to start the game
  |------------------------------------|
  |                                    |
  |                                    |
  |                                    |
  |                                    |
  |                                    |
  |                                    |
  |          |------------|            |            
  |          | start quiz |            |
  |          |            |            |
  |          |------------|            |
  |                                    |
  |                                    |
  |                                    |
  |                                    |
  |                                    |
  |                                    |
  --------------------------------------
  */

public class Main extends JFrame {

  public Main() {
    setLayout(null);
    getContentPane().setBackground(new Color(50, 50, 50));

    JButton startButton = new JButton("Start Quiz");
    startButton.setBounds(225, 225, 200, 100);
    startButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
    startButton.setFocusable(false);

    startButton.addActionListener((ActionEvent e) -> {
      new Quiz();
      setVisible(false);
    });

    add(startButton);
    setVisible(true);
    setSize(650, 650);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) throws Exception {
    new Main();
  }
}

