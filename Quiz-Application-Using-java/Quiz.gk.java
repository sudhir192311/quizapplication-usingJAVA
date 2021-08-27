import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Quiz extends JFrame implements ActionListener {
*/
 @ here all qun are set by the owener(sudhir)
*/
  String[] questions = { "Who is the prime minister of India ?", "What is Java ?", "Who is the CEO of Google ?",
      "To become an Indian citizen, which of the following is not a condition?",
      "Vande Mataram, the nationalist song, written by Vankim Chandra Chatterjee is a part of the book",
      "The first Indian train in 1853, traveled between",
      " In which country can you see a unique replica of the original Parthenon in Greece?",
      "Which Indian city in the state of Gujarat is named after Mahatma Gandhi, the father of the Indian Nation?",
      "In which country would you drive down an Autobahn?",
      "When was the National Dairy Development Board established?", "Which is the capital of Kerala?",
      "Which one of the following is not an element of the state?", "Union Public Service Commission is appointed by",
      "According to astrology enemy planet of Mars",
      "What word describes the tendency of alcohol to evaporate quickly?",
      "The compound of metal found in nature is called?",
      "Which one of the following contains maximum number of carbon?", "The term ‘Ebola’ stand for",
      "The term ‘carbon credit’ originated from which one of thr following international summit?",
      "What is the full form of 'RAW'?", "'MALABAR' is a naval exercise between India and which country?.",
      "The study of birds is called?", "How many cards are there in a pack of cards (not incl. jokers)?",
      "What does www stand for?", "Who is the South African born CEO of SpaceX and the brains behind Tesla?",
      "Which company is responsible for the iPhone, iPad and iWatch and many other products?",
      "What is the name of Mickey Mouse’s partner?", "The University of Nalanda was set up by which Gupta ruler?",
      "What city is the capital of France?", "Holkar Trophy is associated with which sport?",
      "What brand is also known as the Golden Arches?", " Vanilla is native to which country?",
      "Who is the first Indian woman to win an Asian Games gold in 400m run",
      "Ringo, John, Paul and George are better known as which famous band?",
      "Who is 'Tom' in famous cartoon Tom and Jerry?", "What is the main ingredient of bread?",
      "How many rings are there in the Audi logo?", "What is the name of person which controls a football match",
      "What brand has the slogan ‘Have a break, have a ‘what’’?",
      "Who among the following is the founder and proponent of the 'Art of Living'?",
      "Which country manufactures the most number of cars?",
      "The Scientists at Indian Veterinary Research Institute have recently developed a low-cost vaccine for which disease?",
      "The National Game of Japan is", "Which one of the following is the chemical name of Baking Powder?",
      "According to the famous saying, how many lives does a cat have?", "Which scientist discovered radium?",
      "Which is highest gallantary award in India", "When is the World Population Day",
      " What is the largest mammal currently inhabiting the earth?",
      "What is the name of the rainforest that is synonymous with Brazil?",
      "Light sensitive device that converts text, images, drawings in digital form is: ",
      "Who is known as the Human Computer of India?", "Orkut.com is now owned by",
      "Who dubbed the ‘King of Pop’, which artist released the album Thriller, which went on to be the bestselling album of all time?",
      "Which country is building 'Mars Science City' to develop technology to colonize Mars?",
      "The first European to reach India by sea was", "Where is the world’s oldest university?" };
  /*
  @ all qsns possible four option 
  */

  String[][] options = { { "Manmohan Singh", "Narendra Modi", "Pratibha Patil", "Amit Shah" },
      { "Framework", "Programming Language", "Coffee", "All of the above" },
      { "Sundar Pichai", "Bill Gates", "Mark Zuckerberg", "Larry Paige" },
      { " Birth", "Descent", "Acquiring property", "Naturalization" },
      { "Durgesh Nandini", "Saraswati Chandra", "Anand Math", "Kopal Kundala" },
      { "Bombay and Pune", "Bombay and Thane", "Howrah to Kharagpur", "Bombay to Ahmedabad" },
      { "USA", "New Zealand", "Australia", "Canada" }, { "Ahmedabad", "Gandhi Nagar", "Jamnagar", "Vadodara" },
      { "Brazil", "Tokyo", "India", "Germany." }, { "1976", "1990", "1965", "2000" },
      { "Mumbai", "Indore", "Dispur", "Thiruvananthapuram" }, { "Population", "Land", "Mobile", "Government" },
      { "Parliament", "President", "Chief Justice", "Selection Committee" }, { "Earth", "Mercury", "Venus", "Jupiter" },
      { "Volatility", "Evaporation", "Combustion", "None of these" }, { "Ore", "Mineral", "Flux", "Slag" },
      { "Stainless steel", "Mild steel", "wrought iron", "cast iron" },
      { "A viral desease outbreak in West Africa", "A viral desease outbreak in China", "A city destroyed by ISIS",
          "None of these" },
      { "Kyoto Protocol", "Earth Summit", "Montreal protocol", "G-8 Summit" },
      { "Research and Analytical Wings", "Research and Wings", "Research and Analysis Wings",
          "Research and Analytical Wing" },
      { "USA", "China", "Britain", "Italy" }, { "Osteology", "Ornithology", "Pomology", "Pedology" },
      { "51", "50", "52", "60" }, { "We Will Win", "World Wide Web", "War War War", "None of these" },
      { "Sundar Pichai", "Elon Musk", "Jeff Bezos", "Mukesh Ambani" }, { "Samsung", "Xiaomi", "Apple", "Nokia" },
      { "Ginnie Mouse", "Minnie Mouse", "Tony Mouse", "Penny Mouse" },
      { "Kumargupta I", "Chandragupta II", "Samudragupta", "Kumargupta II" },
      { "London", "New York", "Paris", "Tokyo" }, { "Bridge", "Hockey", "Badminton", "Ludo" },
      { "KFC", "Pizza Hut", "McDonalds", "None of the these" }, { "Britain", "Italy", "Madagascar", "Japan" },
      { "Kamaljit Sandhu", "P.T. Usha", "K.Malleshwari", "P.V. Sindhu" },
      { "One Direction", "The Beatles", "BTS", "None of these" }, { "Pig", "Mouse", "Dog", "Cat" },
      { "Salt", "Rice", "Flour", "Sugar" }, { "4", "5", "3", "9" },
      { "A referee", "An Umpire", "A goalkeeper", "A spectator" }, { "Snickers", "Parle", "KitKat", "Oreo" },
      { "Sri Sri Ravi Shankar", "Swami Chinmayananda", "Bhagwan Rajnesh", "Maharishi Mahesh Yogi" },
      { "China", "Japan", "India", "USA" }, { "Bird Flu", "Covid-19", "Bird Flu", "Monkey Pox" },
      { "Karate", "Sumo wrestling", "Tennis", "Ice Hockey" },
      { "Sodium Bicarbonate", "Sodium Chloride", "Sodium Carbonate", "Sodium Hydroxide" }, { "8", "7", "5", "9" },
      { "Marie Curie", "Albert Einstein", "Isaac Newton", "Benjamin Franklin" },
      { "Param Vishishtat Seva Medal", "Param Vir Chakra", "Kirti Chakra", "Vir Chakra" },
      { "May 31", "October 4", "July 11", "May 3" }, { "chimpanzee", "pig", "Blue Whale", "Humans" },
      { "Ecuador’s Cloud forests", "Alaska’s rainforests", "Liberia", "Amazon rainforest" },
      { "Scanner", "Keyboard", "OMR", "Plotter" },
      { "Aryabhatt", "Shakunthala Devi", "Rabindranath Tagore", "None of these" },
      { "Yahoo", "Facebook", "Google", "Amazon" }, { "Madonna", "Michael Jackson", "Justin Bieber", "Taylor Swift" },
      { "USA", "UAE", "China", "Qatar" }, { "Christopher Columbus", "Marco Polo", "Vasco da Gama", "John Cabot" },
      { "Fez Morocco", "Harvard University", "Oxford University", "Nalanda University" } };
  /*
  @all the correct option set by the owner(sudhir)
  */

  char[] answers = { 'B', 'B', 'A', 'C', 'C', 'B', 'A', 'B', 'D', 'C', 'D', 'C', 'B', 'B', 'A', 'B', 'D', 'A', 'A', 'D',
      'A', 'B', 'C', 'B', 'C', 'C', 'B', 'A', 'C', 'A', 'C', 'C', 'B', 'B', 'D', 'C', 'A', 'A', 'C', 'A', 'A', 'C', 'B',
      'A', 'D', 'A', 'B', 'C', 'C', 'D', 'A', 'B', 'C', 'B', 'B', 'C', 'A' };

  char guess, answer;
  int index;
  int correctGuesses = 0;
  int noOfQuestions = questions.length;
  int result;
  int seconds = 10;
  boolean markedWrong = false;

  JTextField textField = new JTextField();
  JTextArea jTextArea = new JTextArea();
  JButton optionA = new JButton();
  JButton optionB = new JButton();
  JButton optionC = new JButton();
  JButton optionD = new JButton();
  JLabel ansLabelA = new JLabel();
  JLabel ansLabelB = new JLabel();
  JLabel ansLabelC = new JLabel();
  JLabel ansLabelD = new JLabel();
  JLabel secondsLeft = new JLabel();
  JTextField noOfRight = new JTextField();
  JTextField percentage = new JTextField();
  JButton endButton = new JButton();

  Timer timer = new Timer(1000, (ActionEvent e) -> {
    seconds--;
    secondsLeft.setText(String.valueOf(seconds));
    if (seconds <= 0) {
      displayAnswer();
    }
  });
  */
    @ another frame will be create for the game 
     
      -------------------------------------------                                        
      |          QUESTION NO                    |
      |                                         |
      |                                         |
      | QUESTION !                              |    
      |                                         |
      |  OPTION !                               |
      |   A    option 1                         |
      |                                         |
      |                                         |
      |   B    option 2                         |
      |                                         |
      |                                         |
      |   C    option 3                         |
      |                                         |
      |                                         | 
      |   D    option 4                         |
      |                                         |
      |                               END TEST  |
      |                                         |
      |                              --------   |
      |                               TIMER     |
      |                              --------   |
       ------------------------------------------                                    
      
      

  public Quiz() {
    setLayout(null);
    getContentPane().setBackground(new Color(50, 50, 50));

    textField.setBounds(0, 0, 650, 50);
    textField.setBackground(new Color(25, 25, 25));
    textField.setForeground(new Color(25, 255, 0));
    textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
    textField.setBorder(BorderFactory.createBevelBorder(1));
    textField.setHorizontalAlignment(JTextField.CENTER);
    textField.setEditable(false);

    jTextArea.setBounds(0, 50, 650, 100);
    jTextArea.setLineWrap(true);
    jTextArea.setWrapStyleWord(true);
    jTextArea.setBackground(new Color(25, 25, 25));
    jTextArea.setForeground(new Color(25, 255, 0));
    jTextArea.setFont(new Font("Times New Roman", Font.BOLD, 25));
    jTextArea.setBorder(BorderFactory.createBevelBorder(1));
    jTextArea.setEditable(false);

    optionA.setBounds(0, 150, 100, 100);
    optionA.setFont(new Font("Times New Roman", Font.BOLD, 25));
    optionA.setFocusable(false);
    optionA.setText("A");
    optionA.addActionListener(this);

    ansLabelA.setBounds(125, 150, 500, 100);
    ansLabelA.setText("Option A");
    ansLabelA.setBackground(new Color(25, 25, 25));
    ansLabelA.setForeground(new Color(25, 255, 0));
    ansLabelA.setFont(new Font("Times New Roman", Font.BOLD, 25));

    optionB.setBounds(0, 250, 100, 100);
    optionB.setFont(new Font("Times New Roman", Font.BOLD, 25));
    optionB.setFocusable(false);
    optionB.setText("B");
    optionB.addActionListener(this);

    ansLabelB.setBounds(125, 250, 500, 100);
    ansLabelB.setText("Option B");
    ansLabelB.setBackground(new Color(25, 25, 25));
    ansLabelB.setForeground(new Color(25, 255, 0));
    ansLabelB.setFont(new Font("Times New Roman", Font.BOLD, 25));

    optionC.setBounds(0, 350, 100, 100);
    optionC.setFont(new Font("Times New Roman", Font.BOLD, 25));
    optionC.setFocusable(false);
    optionC.setText("C");
    optionC.addActionListener(this);

    ansLabelC.setBounds(125, 350, 500, 100);
    ansLabelC.setText("Option C");
    ansLabelC.setBackground(new Color(25, 25, 25));
    ansLabelC.setForeground(new Color(25, 255, 0));
    ansLabelC.setFont(new Font("Times New Roman", Font.BOLD, 25));

    optionD.setBounds(0, 450, 100, 100);
    optionD.setFont(new Font("Times New Roman", Font.BOLD, 25));
    optionD.setFocusable(false);
    optionD.setText("D");
    optionD.addActionListener(this);

    ansLabelD.setBounds(125, 450, 500, 100);
    ansLabelD.setText("Option D");
    ansLabelD.setBackground(new Color(25, 25, 25));
    ansLabelD.setForeground(new Color(25, 255, 0));
    ansLabelD.setFont(new Font("Times New Roman", Font.BOLD, 25));

    secondsLeft.setBounds(535, 510, 100, 100);
    secondsLeft.setFont(new Font("Times New Roman", Font.BOLD, 60));
    secondsLeft.setBackground(new Color(25, 25, 25));
    secondsLeft.setForeground(new Color(255, 0, 0));
    secondsLeft.setText(String.valueOf(seconds));
    secondsLeft.setBorder(BorderFactory.createBevelBorder(1));
    secondsLeft.setOpaque(true);
    secondsLeft.setHorizontalAlignment(JTextField.CENTER);

    noOfRight.setBounds(225, 225, 200, 100);
    noOfRight.setBackground(new Color(25, 25, 25));
    noOfRight.setForeground(new Color(25, 255, 0));
    noOfRight.setFont(new Font("Times New Roman", Font.BOLD, 50));
    noOfRight.setBorder(BorderFactory.createBevelBorder(1));
    noOfRight.setHorizontalAlignment(JTextField.CENTER);
    noOfRight.setEditable(false);

    percentage.setBounds(225, 325, 200, 100);
    percentage.setBackground(new Color(25, 25, 25));
    percentage.setForeground(new Color(25, 255, 0));
    percentage.setFont(new Font("Times New Roman", Font.BOLD, 50));
    percentage.setBorder(BorderFactory.createBevelBorder(1));
    percentage.setHorizontalAlignment(JTextField.CENTER);
    percentage.setEditable(false);

    endButton.setBounds(535, 400, 100, 100);
    endButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
    endButton.setFocusable(false);
    endButton.setText("End Test");
    endButton.addActionListener(this);

    add(endButton);
    add(secondsLeft);
    add(textField);
    add(jTextArea);
    add(optionA);
    add(optionB);
    add(optionC);
    add(optionD);
    add(ansLabelA);
    add(ansLabelB);
    add(ansLabelC);
    add(ansLabelD);

    setVisible(true);
    setSize(650, 650);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    nextQuestion();

  }

  public void nextQuestion() {
    if (index >= noOfQuestions) {
      results();
    } else {
      textField.setText("Question " + (index + 1));
      jTextArea.setText(questions[index]);
      ansLabelA.setText(options[index][0]);
      ansLabelB.setText(options[index][1]);
      ansLabelC.setText(options[index][2]);
      ansLabelD.setText(options[index][3]);
      timer.start();
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    optionA.setEnabled(false);
    optionB.setEnabled(false);
    optionC.setEnabled(false);
    optionD.setEnabled(false);

    if (e.getSource() == endButton) {
      timer.stop();
      index = noOfQuestions - 1;
      results();
    }
    if (e.getSource() == optionA) {
      answer = 'A';
      if (answer == answers[index]) {
        correctGuesses++;
      }
    }
    if (e.getSource() == optionB) {
      answer = 'B';
      if (answer == answers[index]) {
        correctGuesses++;
      }
    }
    if (e.getSource() == optionC) {
      answer = 'C';
      if (answer == answers[index]) {
        correctGuesses++;
      }
    }
    if (e.getSource() == optionD) {
      answer = 'D';
      if (answer == answers[index]) {
        correctGuesses++;
      }
    }

    displayAnswer();
  }

  public void displayAnswer() {
    timer.stop();
    optionA.setEnabled(false);
    optionB.setEnabled(false);
    optionC.setEnabled(false);
    optionD.setEnabled(false);

    if (answers[index] != 'A') {
      ansLabelA.setForeground(new Color(255, 0, 0));
    }
    if (answers[index] != 'B') {
      ansLabelB.setForeground(new Color(255, 0, 0));
    }
    if (answers[index] != 'C') {
      ansLabelC.setForeground(new Color(255, 0, 0));
    }
    if (answers[index] != 'D') {
      ansLabelD.setForeground(new Color(255, 0, 0));
    }

    Timer pause = new Timer(2000, (ActionEvent e) -> {
      ansLabelA.setForeground(new Color(25, 255, 0));
      ansLabelB.setForeground(new Color(25, 255, 0));
      ansLabelC.setForeground(new Color(25, 255, 0));
      ansLabelD.setForeground(new Color(25, 255, 0));

      answer = ' ';
      seconds = 10;

      secondsLeft.setText(String.valueOf(seconds));
      optionA.setEnabled(true);
      optionB.setEnabled(true);
      optionC.setEnabled(true);
      optionD.setEnabled(true);
      index++;

      nextQuestion();

    });

    pause.setRepeats(false);
    pause.start();
  }

  public void results() {
    optionA.setEnabled(false);
    optionB.setEnabled(false);
    optionC.setEnabled(false);
    optionD.setEnabled(false);
    endButton.setEnabled(false);

    result = (int) ((correctGuesses / (double) noOfQuestions) * 100);
    textField.setText("RESULTS");
    jTextArea.setText("");
    optionA.setText("");
    optionB.setText("");
    optionC.setText("");
    optionD.setText("");
    ansLabelA.setText("");
    ansLabelB.setText("");
    ansLabelC.setText("");
    ansLabelD.setText("");
    noOfRight.setText("Points: " + correctGuesses);
    percentage.setText(result + "%");

    add(percentage);
    add(noOfRight);
  }
}
