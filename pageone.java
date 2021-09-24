import java.awt.EventQueue;
import javax.swing.Timer;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.util.*;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
public class pageone {

    private JFrame framer;
    private JTextField firstbox;
    private JTextField secondbox;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pageone window = new pageone();
                    window.framer.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public pageone() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    static String firstname, lastname;
    static int numdigit = 3;
    static boolean isplusorminus = false;
    static int numbertotal = 20;
    static double time = 0.5;
    static int sum = 0;
    private JTextField result;
    private JTextField totalscore;
    private JTextField expected;
    private JTextField numberfield;
    static int counter = 0;
    static int starlevel = 0;
    static int dicegroup = 10;
    static double diceframe = 4;
    int i,j,k,l;
    static int countertwo = 0;
    int []answer = new int[10000];
    static int dicenumberr;
    private JTextField number;
    private JTextField boxI;
    private JTextField boxJ;
    private JTextField boxK;
    private JTextField boxL;
    private JTextField counting;
    private JTextField AA;
    private JTextField AB;
    private JTextField AC;
    private JTextField AD;
    private JTextField randomer;
    private JTextField textField;
    private JTextField alternate;
    private JTextField lastalternate;
    private JTextField sets;
    private void initialize() 
    {
       
        framer = new JFrame();
        framer.getContentPane().setBackground(Color.WHITE);
        framer.setBackground(Color.WHITE);
        CardLayout card = new CardLayout();
        framer.setBounds(100, 100, 450, 300);
        framer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framer.getContentPane().setLayout(card);
        
       // CardLayout card = new CardLayout();
        
        JPanel panel = new JPanel();
        panel.setForeground(Color.WHITE);
        panel.setBackground(Color.GRAY);
        framer.getContentPane().add(panel, "abcde");
        panel.setLayout(null);
        
        JButton btnNewButton_1 = new JButton("Have fun");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(!(firstbox.getText().equals("")&&secondbox.getText().equals("")))
            	{
                card.show(framer.getContentPane(),"abcde");
                firstname = firstbox.getText();
                lastname = secondbox.getText();
                textField.setText(firstname + " " + lastname);
            	}
            	else
            	JOptionPane.showMessageDialog(framer, "Please write a name!");
            }
        });
        
        btnNewButton_1.setBounds(312, 222, 117, 29);
        panel.add(btnNewButton_1);
        
        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		firstbox.setText("");
        		secondbox.setText("");
        	}
        });
        btnReset.setBounds(163, 222, 148, 29);
        panel.add(btnReset);
        
        JLabel lblNewLabel = new JLabel("First name:");
        lblNewLabel.setBounds(34, 114, 80, 16);
        panel.add(lblNewLabel);
        
        firstbox = new JTextField();
        firstbox.setBounds(155, 109, 258, 26);
        panel.add(firstbox);
        firstbox.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Last Name:");
        lblNewLabel_1.setBounds(44, 152, 82, 16);
        panel.add(lblNewLabel_1);
        
        secondbox = new JTextField();
        secondbox.setBounds(155, 147, 255, 26);
        panel.add(secondbox);
        secondbox.setColumns(10);
        
        JButton btnNewButton = new JButton("Generate a name");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	firstname = "";
            	lastname = "";
            	
                Random rand = new Random();
                Random rander = new Random();
                String []firstnam = {"Wandering","Seaquam","Tim","Tom","Jackson","IB","Trevor","Daniel","DaddySauce","International","Cute","Kawaii","Touma","Itou","Ogiso","Jim","Alice","David","Sanjana"};
                String []lastnam = {"Alita","Rachel","wang","Daniel","Ruttan","RIchmond","Vancouver","Sauce","Astley","Ashley","Rickroll","Confident","Kazusa","Eclipse","Setusna","Sai","Ava","Ellie","Bottonfield","Dhinsa"};
                
                int a = rand.nextInt(firstnam.length-1);
                int b = rander.nextInt(lastnam.length-1);
                
                firstname = firstnam[a];
                lastname = lastnam[b];
                
                firstbox.setText(firstname);
                secondbox.setText(lastname);
                
            }
        });
        btnNewButton.setBounds(22, 222, 148, 29);
        panel.add(btnNewButton);
        
        JButton btnNewButton_16 = new JButton("New button");
        btnNewButton_16.setIcon(new ImageIcon("/Users/timzou2005/Desktop/Code/Game.jpg"));
        btnNewButton_16.setBounds(115, 6, 196, 91);
        panel.add(btnNewButton_16);
        
        JPanel panel_1 = new JPanel();
        framer.getContentPane().add(panel_1,"abcde");
        panel_1.setLayout(null);
        
        JButton buttonCalculate = new JButton("Calculator game");
        buttonCalculate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                card.show(framer.getContentPane(),"CalculateGamer");
        	}
        });
        buttonCalculate.setBounds(34, 73, 170, 40);
        panel_1.add(buttonCalculate);
        
        JButton subscribe = new JButton("Subscribe us");
        subscribe.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "Subscriber");
        	}
        });
        subscribe.setBounds(97, 232, 124, 34);
        panel_1.add(subscribe);
        
        JButton btnNewButton_4 = new JButton("Dice Memory");
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "DiceGame");
        	}
        });
        btnNewButton_4.setBounds(226, 73, 179, 40);
        panel_1.add(btnNewButton_4);
        
        JButton btnNewButton_5 = new JButton("Setting");
        btnNewButton_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "generalsetting");
        		alternate.setText(firstname);
        		lastalternate.setText(lastname);
        	}
        });
        btnNewButton_5.setBounds(226, 146, 179, 34);
        panel_1.add(btnNewButton_5);
        
        JLabel lblNewLabel_6 = new JLabel("Hello, ");
        lblNewLabel_6.setBounds(67, 17, 61, 16);
        panel_1.add(lblNewLabel_6);
        
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(114, 12, 283, 26);
        panel_1.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton_7 = new JButton("Quit Game");
        btnNewButton_7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton_7.setBounds(220, 232, 133, 34);
        panel_1.add(btnNewButton_7);
        
        JButton btnNewButton_3 = new JButton("Game rule");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "GameAbout");
        	}
        });
        btnNewButton_3.setBounds(34, 146, 170, 34);
        panel_1.add(btnNewButton_3);
        
        JPanel GameAbout = new JPanel();
        framer.getContentPane().add(GameAbout, "GameAbout");
        GameAbout.setLayout(null);
        
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        textArea.setEditable(false);
        textArea.setBounds(6, 6, 322, 191);
        GameAbout.add(textArea);
        
        JButton Dicer = new JButton("Dice Game");
        Dicer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String a = "The Dice game is one of the most memorable game in the world." + "\n";
        		String b = "The game objective is to memorize all numbers shown to you." + "\n" + "Every four number will be placed into a dicebox";
        		String c = "\n" + "You will have 0.5 - 20 seconds memorizing each box, depending";
        		String d = "\n" + "on your choice. After that, I will give you a dicebox number," + "\n" + "and your goal is to write down what the four numbers in the dicebox are";
        		String f = "\n" + "The current world record holder of the game is Wang Feng." + "\n" + "His speed is 3.5s/dicebox";
        		textArea.setText(a + b + c + d + f);
        	}
        });
        Dicer.setBounds(327, 53, 117, 29);
        GameAbout.add(Dicer);
        
        JButton btnNewButton_8 = new JButton("Calculator");
        btnNewButton_8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String a = "1. Do you want to challenge your calculation speed? Here is chance!";
        		String b = "\n" + "2. The game's objective is to calculate numbers";
        		String c = "\n" + "3. Certain random number will flash every 0.3 - 2 seconds";
        		String d = "\n" + "4. Your goal is to calculate the sum of all of them";
        		String f = "\n" + "5. After you are done, click the answer button";
        		textArea.setText(a + b + c + d + f);
        	}
        });
        btnNewButton_8.setBounds(327, 139, 117, 29);
        GameAbout.add(btnNewButton_8);
        
        JButton btnNewButton_9 = new JButton("Leave");
        btnNewButton_9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(),"abcde");
        	}
        });
        btnNewButton_9.setBounds(129, 209, 191, 44);
        GameAbout.add(btnNewButton_9);
        
        JPanel CalculateGamer = new JPanel();
        framer.getContentPane().add(CalculateGamer, "CalculateGamer");
        CalculateGamer.setLayout(null);
        
        JLabel Number = new JLabel("Number");
        Number.setBounds(61, 84, 61, 16);
        CalculateGamer.add(Number);
        
        result = new JTextField();
        result.setBounds(124, 117, 320, 26);
        CalculateGamer.add(result);
        result.setColumns(10);
        
        JLabel Calculate = new JLabel("put your ans. here");
        Calculate.setBounds(6, 122, 149, 16);
        CalculateGamer.add(Calculate);
        
        JButton Check = new JButton("Generating a new game");
        Check.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		result.setText("");
        		expected.setText("");
        		Check.setVisible(false);
        		counter = 0;
        		 sum = 0;
        		int delay = (int)(time * 1000); //milliseconds
        		  ActionListener taskPerformer = new ActionListener() {
        		      public void actionPerformed(ActionEvent evt) {
        		    	   
        	        		Random rand = new Random();
        	        		Random porm = new Random();
        	        		Integer number;
        	        		number = rand.nextInt((int)Math.pow(10, numdigit));
        	        		if(isplusorminus == true)
        	        		{
        	        		    int onetwo = porm.nextInt(2);
        	        		    if(onetwo == 1)
        	        		    {
        	        		    	number = number *= -1;
        	        		    }
        	        		}
        	        		sum += number;
        	        		  
        	        		numberfield.setText(String.valueOf(number));
        	        		counter++;
        	        		if(counter == numbertotal)
        	        		{
        	        			((Timer)evt.getSource()).stop();
        	        			JOptionPane.showMessageDialog(framer, "Operation Completed");   
        	        			Check.setVisible(true);
        	        		}
        		      }
        		  };
   
        		   Timer timer = new Timer(delay,taskPerformer);
        		   timer.start();
        		   
        		
        		   
        		   
        		   
        		   
        		   
        	}
        });
        Check.setBounds(68, 181, 156, 52);
        CalculateGamer.add(Check);
        
        JButton Setting = new JButton("Personalize");
        Setting.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "Set");
        	}
        });
        Setting.setBounds(310, 16, 134, 38);
        CalculateGamer.add(Setting);
        
        JLabel lblNewLabel_3 = new JLabel("Expected Result");
        lblNewLabel_3.setBounds(16, 153, 106, 16);
        CalculateGamer.add(lblNewLabel_3);
        
        expected = new JTextField();
        expected.setEditable(false);
        expected.setBounds(124, 148, 320, 26);
        CalculateGamer.add(expected);
        expected.setColumns(10);
        
        JButton btnNewButton_2 = new JButton("Go back to the previous page");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "abcde");
        	}
        });
        btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        btnNewButton_2.setBounds(6, 6, 171, 46);
        CalculateGamer.add(btnNewButton_2);
        
        numberfield = new JTextField();
        numberfield.setEditable(false);
        numberfield.setBounds(123, 79, 296, 26);
        CalculateGamer.add(numberfield);
        numberfield.setColumns(10);
        
        JButton Answer = new JButton("Check your answer");
        Answer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		expected.setText(String.valueOf(sum));
        		    		
        		if(result.getText().equals(expected.getText()))
        		{
        			JOptionPane.showMessageDialog(framer, "Correct! Fantastique!");
        		}
        		else
        			JOptionPane.showMessageDialog(framer, "Sorry u wrong!");
        	}
        });
        Answer.setBounds(236, 181, 149, 52);
        CalculateGamer.add(Answer);
        
        JPanel DiceGame = new JPanel();
        framer.getContentPane().add(DiceGame, "DiceGame");
        DiceGame.setLayout(null);
        
        boxI = new JTextField();
        boxI.setBounds(28, 95, 81, 26);
        DiceGame.add(boxI);
        boxI.setColumns(10);
        
        boxJ = new JTextField();
        boxJ.setBounds(121, 95, 90, 26);
        DiceGame.add(boxJ);
        boxJ.setColumns(10);
        
        boxK = new JTextField();
        boxK.setBounds(223, 95, 83, 26);
        DiceGame.add(boxK);
        boxK.setColumns(10);
        
        boxL = new JTextField();
        boxL.setBounds(318, 95, 90, 26);
        DiceGame.add(boxL);
        boxL.setColumns(10);
        
        JButton Setter = new JButton("Personalize");
        Setter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(),"Settetion");
        	}
        });
        
        JButton commence = new JButton("start the test");
        commence.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "DiceRound");
        	}
        });
        Setter.setBounds(6, 147, 148, 43);
        DiceGame.add(Setter);
        
        
        JButton startgame = new JButton("Start memorizing number");
        startgame.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Random ran = new Random();
        		Setter.setVisible(false);
        		commence.setVisible(false);
        		startgame.setVisible(false);
        		int delay = (int)(diceframe * 1000);
        		counter = 0;
        		ActionListener taskPerformer = new ActionListener() {
      		      public void actionPerformed(ActionEvent evt) {
      		    	i = ran.nextInt(5) + 1;
            		j = ran.nextInt(5) + 1;
            		k = ran.nextInt(5) + 1;
            		l = ran.nextInt(5) + 1;
            		answer[counter * 4 + 0] = i;
            		answer[counter * 4 + 1] = j;
            		answer[counter * 4 + 2] = k;
            		answer[counter * 4 + 3] = l;
      		    	    boxI.setText(String.valueOf(i));
                        boxJ.setText(String.valueOf(j));
                        boxK.setText(String.valueOf(k));
                        boxL.setText(String.valueOf(l));
                        counting.setText(String.valueOf(counter));
      		    	    counter++;
      	        		if(counter >= dicegroup)
      	        		{
      	        			((Timer)evt.getSource()).stop();
      	        			Setter.setVisible(true);
      	        			commence.setVisible(true);
      	        			try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
      	        			JOptionPane.showMessageDialog(framer, "Memory Complete");
      	        			
      	        		}
      		      }
      		  };
 
      		   Timer timer = new Timer(delay,taskPerformer);
      		   timer.start();
        	}
        });
        startgame.setBounds(156, 147, 170, 43);
        DiceGame.add(startgame);
        
        JLabel The = new JLabel("The");
        The.setBounds(77, 46, 61, 16);
        DiceGame.add(The);
        
        counting = new JTextField();
        counting.setEditable(false);
        counting.setBounds(112, 41, 130, 26);
        DiceGame.add(counting);
        counting.setColumns(10);
        
        JLabel lblNewLabel_5 = new JLabel("th dicebox");
        lblNewLabel_5.setBounds(242, 46, 97, 16);
        DiceGame.add(lblNewLabel_5);
        
     
        commence.setBounds(325, 150, 125, 37);
        DiceGame.add(commence);
        
        JButton btnNewButton_15 = new JButton("Leave");
        btnNewButton_15.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "abcde");
        		
        	}
        });
        btnNewButton_15.setBounds(178, 202, 125, 37);
        DiceGame.add(btnNewButton_15);
        
        JPanel Subscriber = new JPanel();
        framer.getContentPane().add(Subscriber, "Subscriber");
        Subscriber.setLayout(null);
        
        JButton Instagram = new JButton("Instagram");
        Instagram.setIcon(new ImageIcon("/Users/timzou2005/Downloads/instagram.jpg"));
        Instagram.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Desktop d = Desktop.getDesktop();
        		try {
					d.browse(new URI("https://www.instagram.com/t_i_m_m_m_m_m_m_m_m_m_m/?hl=en"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        Instagram.setBounds(132, 80, 173, 81);
        Subscriber.add(Instagram);
        
        JButton Youtube = new JButton("youtube");
        Youtube.setIcon(new ImageIcon("/Users/timzou2005/Downloads/Youtube.png"));
        Youtube.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Desktop d = Desktop.getDesktop();
        		try {
					d.browse(new URI("https://www.youtube.com/channel/UCYHnw9Dsd4fR3UaRYc8GTnQ"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        Youtube.setBounds(6, 0, 173, 68);
        Subscriber.add(Youtube);
        
        JButton Dont = new JButton("Gmail");
        Dont.setIcon(new ImageIcon("/Users/timzou2005/Downloads/Gmail.png"));
        Dont.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Desktop d = Desktop.getDesktop();
        		try {
					d.browse(new URI("https://mail.google.com/mail/u/3/#inbox?compose=DmwnWrRnZMtQKQjMBFRXSBxMfPKrfWCTmKQQkqkDCDCwvgrhlzdfrkFVqdrZhLhfzRShSBSffxsB"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	}
        });
        Dont.setBounds(271, 177, 173, 89);
        Subscriber.add(Dont);
        
        JButton btnNewButton_6 = new JButton("Back to main room");
        btnNewButton_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "abcde");
        	}
        });
        btnNewButton_6.setBounds(6, 237, 173, 29);
        Subscriber.add(btnNewButton_6);
        
        JPanel DiceRound = new JPanel();
        framer.getContentPane().add(DiceRound, "DiceRound");
        DiceRound.setLayout(null);
        
        AA = new JTextField();
        AA.setBounds(32, 51, 76, 26);
        DiceRound.add(AA);
        AA.setColumns(10);
        
        AB = new JTextField();
        AB.setColumns(10);
        AB.setBounds(120, 51, 76, 26);
        DiceRound.add(AB);
        
        AC = new JTextField();
        AC.setColumns(10);
        AC.setBounds(208, 51, 76, 26);
        DiceRound.add(AC);
        
        AD = new JTextField();
        AD.setColumns(10);
        AD.setBounds(297, 51, 76, 26);
        DiceRound.add(AD);
        
        JButton start = new JButton("submit");
        start.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int a = answer[dicenumberr * 4 + 0];
        		int b = answer[dicenumberr * 4 + 1];
        		int c = answer[dicenumberr * 4 + 2];
        		int d = answer[dicenumberr * 4 + 3];
        		if(AA.getText().equals(String.valueOf(a)))
        		{
        			if(AB.getText().equals(String.valueOf(b)))
        			{
        				if(AC.getText().equals(String.valueOf(c)))
        				{
        					if(AD.getText().equals(String.valueOf(d)))
        					{
        						JOptionPane.showMessageDialog(framer,"Correct!");
        					}
        				}
        			}
        		}
        		else
        			JOptionPane.showMessageDialog(framer, "Sorry u wrong!");
        		start.setVisible(false);
        		
        	}
        });
        
        start.setBounds(158, 100, 149, 44);
        DiceRound.add(start);
        
        randomer = new JTextField();
        randomer.setEditable(false);
        randomer.setBounds(182, 0, 121, 26);
        DiceRound.add(randomer);
        randomer.setColumns(10);
        
        JLabel lblNewLabel_8 = new JLabel("box");
        lblNewLabel_8.setBounds(312, 5, 61, 16);
        DiceRound.add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("Write down all dice in the");
        lblNewLabel_9.setBounds(21, 5, 165, 16);
        DiceRound.add(lblNewLabel_9);
        
        JButton nanana = new JButton("Generate");
        nanana.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Random ran = new Random();
    			 dicenumberr = ran.nextInt(dicegroup);
    			randomer.setText(String.valueOf(dicenumberr));
    			nanana.setVisible(false);
    			start.setVisible(true);
    			AA.setEditable(true);;
    			AB.setEditable(true);
    			AC.setEditable(true);
    			AD.setEditable(true);
        	}
        });
        nanana.setBounds(6, 100, 153, 44);
        DiceRound.add(nanana);
        
        JButton bruh = new JButton("Start next round");
        bruh.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AA.setText("");
        		AB.setText("");
        		AC.setText("");
        		AD.setText("");
        		AA.setEditable(false);
        		AB.setEditable(false);
        		AC.setEditable(false);
        		AD.setEditable(false);
        		countertwo++;
        		nanana.setVisible(true);
        		if(countertwo == 20)
        		{
        			bruh.setVisible(false);
        			JOptionPane.showMessageDialog(framer,"You finish all problem.Congrats");
        		}
        	}
        });
        bruh.setBounds(319, 100, 117, 44);
        DiceRound.add(bruh);
        
        JButton quit = new JButton("quit");
        quit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		card.show(framer.getContentPane(), "DiceGame");
        		countertwo = 0;
        		bruh.setVisible(true);
        		nanana.setVisible(true);
        		start.setVisible(true);
        	}
        });
        quit.setBounds(158, 147, 149, 53);
        DiceRound.add(quit);
        
        JLabel abcdefe = new JLabel("1");
        abcdefe.setBounds(62, 33, 46, 17);
        DiceRound.add(abcdefe);
        
        JLabel lblNewLabel_15 = new JLabel("2");
        lblNewLabel_15.setBounds(155, 33, 61, 16);
        DiceRound.add(lblNewLabel_15);
        
        JLabel lblNewLabel_16 = new JLabel("3");
        lblNewLabel_16.setBounds(246, 33, 61, 16);
        DiceRound.add(lblNewLabel_16);
        
        JLabel lblNewLabel_17 = new JLabel("4");
        lblNewLabel_17.setBounds(332, 33, 61, 16);
        DiceRound.add(lblNewLabel_17);
        
        JPanel Set = new JPanel();
        framer.getContentPane().add(Set, "Set");
        Set.setLayout(null);
        
        JComboBox DigitNumber = new JComboBox();
        DigitNumber.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
        DigitNumber.setSelectedIndex(0);
        DigitNumber.setBounds(185, 31, 129, 27);
        Set.add(DigitNumber);
        
        JRadioButton plussign = new JRadioButton("+ sign only");
        plussign.setBounds(126, 70, 141, 23);
        Set.add(plussign);
        
        JRadioButton plusandminussign = new JRadioButton("both + and -");
        plusandminussign.setBounds(266, 70, 141, 23);
        Set.add(plusandminussign);
        
        JComboBox timing = new JComboBox();
        timing.setModel(new DefaultComboBoxModel(new String[] {"0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2.0"}));
        timing.setBounds(198, 105, 116, 27);
        Set.add(timing);
        
        JLabel lblNewLabel_2 = new JLabel("Total score is ");
        lblNewLabel_2.setBounds(69, 172, 121, 16);
        Set.add(lblNewLabel_2);
        
        JPanel Settetion = new JPanel();
        framer.getContentPane().add(Settetion, "Settetion");
        Settetion.setLayout(null);
        
        totalscore = new JTextField();
        totalscore.setEditable(false);
        totalscore.setBounds(167, 167, 258, 26);
        Set.add(totalscore);
        totalscore.setColumns(10);
        
        JButton apply = new JButton("Apply changes");
        apply.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		numdigit = DigitNumber.getSelectedIndex()+1;
        		if(plussign.isSelected()==true)
        		{
        			isplusorminus = false;
        		}
        		else
        			isplusorminus = true;
        		time = timing.getSelectedIndex() * 0.1 + 0.3;
        		starlevel = numdigit * 4 + 18 - timing.getSelectedIndex();
        	if(isplusorminus == true)
        		starlevel += 5;
        	 
        	totalscore.setText(String.valueOf(starlevel));
        	
        	if(plussign.isSelected()==true && plusandminussign.isSelected()==true)
        	{
        		JOptionPane.showMessageDialog(framer, "Error 1: You have to choose one between + and +/-");
        	}
        	else if(plussign.isSelected()== false && plusandminussign.isSelected()==false)
        	{
        		JOptionPane.showMessageDialog(framer, "Error 2: You can only choose one between + and +/-");
        	}
        	else if(number.getText().equals(""))
        		JOptionPane.showMessageDialog(framer, "Error 3: Please write the total number");
        	else
        	{
        		numbertotal = Integer.parseInt(number.getText());
        	card.show(framer.getContentPane(), "CalculateGamer");
        	}
        	
        		
        }
       
        });
        apply.setBounds(34, 205, 156, 49);
        Set.add(apply);
        
        JButton score = new JButton("Scoring rule");
        score.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(framer, "The formula is:" + "\n" + "4 * digits + 18 - time difficulties");
        		JOptionPane.showMessageDialog(framer, "A combination of +/- will have a bonus of 5 point");
        	}
        });
        score.setBounds(219, 205, 135, 49);
        Set.add(score);
        
        number = new JTextField();
        number.setText("20");
        number.setBounds(167, 134, 258, 26);
        Set.add(number);
        number.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Total Number");
        lblNewLabel_4.setBounds(69, 139, 86, 16);
        Set.add(lblNewLabel_4);
        
        JLabel plus = new JLabel("+/-");
        plus.setBounds(53, 74, 61, 16);
        Set.add(plus);
        
        JLabel lblNewLabel_12 = new JLabel("digit of each number");
        lblNewLabel_12.setBounds(17, 35, 138, 16);
        Set.add(lblNewLabel_12);
        
        JLabel lblNewLabel_13 = new JLabel("seconds");
        lblNewLabel_13.setBounds(313, 109, 61, 16);
        Set.add(lblNewLabel_13);
        
        JLabel lblNewLabel_14 = new JLabel("time per number appeared");
        lblNewLabel_14.setBounds(22, 109, 180, 16);
        Set.add(lblNewLabel_14);
        
  
        JPanel generalsetting = new JPanel();
        framer.getContentPane().add(generalsetting, "generalsetting");
        generalsetting.setLayout(null);
        
        alternate = new JTextField();
        alternate.setBounds(148, 35, 234, 26);
        generalsetting.add(alternate);
        alternate.setColumns(10);
        
        lastalternate = new JTextField();
        lastalternate.setBounds(145, 73, 237, 26);
        generalsetting.add(lastalternate);
        lastalternate.setColumns(10);
        
        JLabel lblNewLabel_7 = new JLabel("First Name");
        lblNewLabel_7.setBounds(47, 40, 89, 16);
        generalsetting.add(lblNewLabel_7);
        
        JLabel lblNewLabel_10 = new JLabel("last name");
        lblNewLabel_10.setBounds(57, 78, 61, 16);
        generalsetting.add(lblNewLabel_10);
        
        JButton save = new JButton("save");
        save.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	  if(!alternate.getText().equals("") && !lastalternate.getText().equals(""))
        	  {
        		card.show(framer.getContentPane(), "abcde");
        		firstname = alternate.getText();
        		lastname = lastalternate.getText();
        		textField.setText(firstname + " " + lastname);
        	  }
        	  else
        		 JOptionPane.showMessageDialog(framer, "Please enter your first name and last name");
        	 }
        });
        save.setBounds(236, 164, 166, 47);
        generalsetting.add(save);
        
        JLabel lblNewLabel_18 = new JLabel("Color");
        lblNewLabel_18.setBounds(83, 119, 61, 16);
        generalsetting.add(lblNewLabel_18);
        
       
        
        JButton colorful = new JButton("Generate random name");
        colorful.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 Random rand = new Random();
                 Random rander = new Random();
                 String []firstnam = {"Wandering","Seaquam","Tim","Tom","Jackson","IB","Trevor","Daniel","DaddySauce","International","Cute","Kawaii","Touma","Itou","Ogiso","Jim","Alice","David","Sanjana"};
                 String []lastnam = {"Alita","Rachel","wang","Daniel","Ruttan","RIchmond","Vancouver","Sauce","Astley","Ashley","Rickroll","Confident","Kazusa","Eclipse","Setusna","Sai","Ava","Ellie","Bottonfield","Dhinsa"};
                 
                 int a = rand.nextInt(firstnam.length-1);
                 int b = rander.nextInt(lastnam.length-1);
                 
                 alternate.setText(firstnam[a]);
                 lastalternate.setText(lastnam[b]);
                 
        	}
        });
        colorful.setBounds(47, 164, 157, 47);
        generalsetting.add(colorful);
        
        JButton red = new JButton("red");
        red.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.RED);
        		panel.setBackground(Color.RED);
        		panel_1.setBackground(Color.RED);
        		CalculateGamer.setBackground(Color.RED);
        		DiceGame.setBackground(Color.RED);
        		Subscriber.setBackground(Color.RED);
        		DiceRound.setBackground(Color.RED);
        		Set.setBackground(Color.RED);
        		Settetion.setBackground(Color.RED);
        		GameAbout.setBackground(Color.RED);
        		}
        });
        red.setForeground(Color.RED);
        red.setBackground(Color.RED);
        red.setBounds(122, 106, 100, 29);
        generalsetting.add(red);
        
        JButton blue = new JButton("blue");
        blue.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.BLUE);
        		panel.setBackground(Color.BLUE);
        		panel_1.setBackground(Color.BLUE);
        		CalculateGamer.setBackground(Color.BLUE);
        		DiceGame.setBackground(Color.BLUE);
        		Subscriber.setBackground(Color.BLUE);
        		DiceRound.setBackground(Color.BLUE);
        		Set.setBackground(Color.BLUE);
        		Settetion.setBackground(Color.BLUE);
        		GameAbout.setBackground(Color.BLUE);
        	}
        });
        blue.setForeground(Color.BLUE);
        blue.setBounds(208, 106, 89, 29);
        generalsetting.add(blue);
        
        JButton btnNewButton_10 = new JButton("yellow");
        btnNewButton_10.setForeground(Color.YELLOW);
        btnNewButton_10.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.YELLOW);
        		panel.setBackground(Color.YELLOW);
        		panel_1.setBackground(Color.YELLOW);
        		CalculateGamer.setBackground(Color.YELLOW);
        		DiceGame.setBackground(Color.YELLOW);
        		Subscriber.setBackground(Color.YELLOW);
        		DiceRound.setBackground(Color.YELLOW);
        		Set.setBackground(Color.YELLOW);
        		Settetion.setBackground(Color.YELLOW);
        		GameAbout.setBackground(Color.YELLOW);
        	}
        });
        btnNewButton_10.setBounds(283, 106, 89, 29);
        generalsetting.add(btnNewButton_10);
        
        JButton green = new JButton("green");
        green.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.GREEN);
        		panel.setBackground(Color.GREEN);
        		panel_1.setBackground(Color.GREEN);
        		CalculateGamer.setBackground(Color.GREEN);
        		DiceGame.setBackground(Color.GREEN);
        		Subscriber.setBackground(Color.GREEN);
        		DiceRound.setBackground(Color.GREEN);
        		Set.setBackground(Color.GREEN);
        		Settetion.setBackground(Color.GREEN);
        		GameAbout.setBackground(Color.GREEN);
        	}
        });
        green.setForeground(Color.GREEN);
        green.setBounds(355, 106, 89, 29);
        generalsetting.add(green);
        
        JButton btnNewButton_11 = new JButton("orange");
        btnNewButton_11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.ORANGE);
        		panel.setBackground(Color.ORANGE);
        		panel_1.setBackground(Color.ORANGE);
        		CalculateGamer.setBackground(Color.ORANGE);
        		DiceGame.setBackground(Color.ORANGE);
        		Subscriber.setBackground(Color.ORANGE);
        		DiceRound.setBackground(Color.ORANGE);
        		Set.setBackground(Color.ORANGE);
        		Settetion.setBackground(Color.ORANGE);
        		GameAbout.setBackground(Color.ORANGE);
        	}
        });
        btnNewButton_11.setForeground(Color.ORANGE);
        btnNewButton_11.setBounds(122, 130, 100, 26);
        generalsetting.add(btnNewButton_11);
        
        JButton btnNewButton_12 = new JButton("cyan");
        btnNewButton_12.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.CYAN);
        		panel.setBackground(Color.CYAN);
        		panel_1.setBackground(Color.CYAN);
        		CalculateGamer.setBackground(Color.CYAN);
        		DiceGame.setBackground(Color.CYAN);
        		Subscriber.setBackground(Color.CYAN);
        		DiceRound.setBackground(Color.CYAN);
        		Set.setBackground(Color.CYAN);
        		Settetion.setBackground(Color.CYAN);
        		GameAbout.setBackground(Color.CYAN);
        	}
        });
        btnNewButton_12.setForeground(Color.CYAN);
        btnNewButton_12.setBounds(208, 130, 89, 26);
        generalsetting.add(btnNewButton_12);
        
        JButton btnNewButton_13 = new JButton("pink");
        btnNewButton_13.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.MAGENTA);
        		panel.setBackground(Color.MAGENTA);
        		panel_1.setBackground(Color.MAGENTA);
        		CalculateGamer.setBackground(Color.MAGENTA);
        		DiceGame.setBackground(Color.MAGENTA);
        		Subscriber.setBackground(Color.MAGENTA);
        		DiceRound.setBackground(Color.MAGENTA);
        		Set.setBackground(Color.MAGENTA);
        		Settetion.setBackground(Color.MAGENTA);
        		GameAbout.setBackground(Color.MAGENTA);
        	}
        });
        btnNewButton_13.setForeground(Color.MAGENTA);
        btnNewButton_13.setBounds(285, 129, 89, 29);
        generalsetting.add(btnNewButton_13);
        
        JButton btnNewButton_14 = new JButton("gray");
        btnNewButton_14.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		generalsetting.setBackground(Color.GRAY);
        		panel.setBackground(Color.GRAY);
        		panel_1.setBackground(Color.GRAY);
        		CalculateGamer.setBackground(Color.GRAY);
        		DiceGame.setBackground(Color.GRAY);
        		Subscriber.setBackground(Color.GRAY);
        		DiceRound.setBackground(Color.GRAY);
        		Set.setBackground(Color.GRAY);
        		Settetion.setBackground(Color.GRAY);
        		GameAbout.setBackground(Color.GRAY);
        	}
        });
        btnNewButton_14.setBounds(355, 129, 89, 29);
        generalsetting.add(btnNewButton_14);
        //spinner.setModel(Integer, 0, 0, 233, 1);
        
        
        
        JLabel lblNewLabel_11 = new JLabel("Time frame");
        lblNewLabel_11.setBounds(21, 73, 113, 16);
        Settetion.add(lblNewLabel_11);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12", "12.5", "13", "13.5", "14", "14.5", "15", "15.5", "16", "16.5", "17", "17.5", "18", "18.5", "19", "19.5", "20"}));
        comboBox.setSelectedIndex(7);
        comboBox.setBounds(110, 69, 171, 27);
        Settetion.add(comboBox);
        
        JLabel Totalset = new JLabel("Total sets of numbers");
        Totalset.setBounds(18, 127, 171, 16);
        Settetion.add(Totalset);
        
        sets = new JTextField();
        sets.setText("10");
        sets.setBounds(172, 122, 230, 26);
        Settetion.add(sets);
        sets.setColumns(10);
        
        JButton confirm = new JButton("confirm");
        confirm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {           
                
                if(sets.getText().equals(""))
                	 JOptionPane.showMessageDialog(framer,"Please enter a number of total dice sets");
                else
                {
                	 card.show(framer.getContentPane(), "DiceGame");
        		dicegroup = Integer.parseInt(sets.getText());
                diceframe = comboBox.getSelectedIndex() * 0.5 + 0.5;   
                }
                
                
        	}
        });
        confirm.setBounds(115, 178, 166, 47);
        Settetion.add(confirm);
        
    
        
        
    }
}