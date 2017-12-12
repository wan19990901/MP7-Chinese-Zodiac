import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Highlighter.HighlightPainter;
import java.util.*;
import java.awt.color.*;

@SuppressWarnings("unused")

public class Zodiac extends JFrame implements ActionListener	 {
	public static Scanner sc = new Scanner(System.in);
	public static final long serialVersionUID = 0;
	JPanel p1, p2, p3, p4, p5, p6,p7,p8,p9;
	JPanel animalPics;
	JTextField tField2;
	JTextArea tArea, tImage;
	JLabel label1, label2, label3, label4;
	JMenu EditMenu, About;
	JMenuBar menuBar1;
	JMenuItem fmi1, fmi2, fmi3, developer, name1, name2;
	JButton enter, mys, fnl, rml, acl, backspace, clear;
//	Zodiac rat, ox, tiger, rabbit, dragon, snake, horse, goat, monkey, rooster, dog, pig;

	
	public Zodiac(String title) {
		
		super( title );

		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.setBounds(50, 50, 800, 500);
		
		setLayout( new FlowLayout() );  
		
		menuBar1 = new JMenuBar();
		
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		
		EditMenu = new JMenu ("Edit");		
		About = new JMenu("About");
		
		fmi1 = new JMenuItem(" Copy   ");
		fmi2 = new JMenuItem(" Paste  ");
		fmi3 = new JMenuItem(" Quit    ");
		
		EditMenu.add(fmi1);
		EditMenu.add(fmi2);
		EditMenu.addSeparator();
		EditMenu.add(fmi3);
		
		developer = new JMenuItem("Developer :");
		name1 = new JMenuItem("Guangya Wan");
		name2 = new JMenuItem("Lillian Lau");
		
		About.add(developer);
		About.addSeparator();
		About.add(name1);
		About.add(name2);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		p8 = new JPanel();
		p9 = new JPanel();
		
		animalPics = new JPanel();

		tArea = new JTextArea(1300,1700);
		tField2 = new JTextField(200);

		// Buttons
		enter = new JButton ("Enter");
		fnl = new JButton 	("Finance");
		acl = new JButton 	("Career");
		rml = new JButton 	("Romance");
		clear = new JButton	("Reset");
		mys = new JButton("Mysterious event");
		
		// Text area
		tArea.setLocation(5, 5);
		tArea.setAlignmentX(75);
		tArea.setAlignmentY(30);
		
		
	}

	/**
	 * launch the game
	 */
	public void launchGame() {

		tArea.setText("Welcome to ShengXiao Finder! " + "\n"
				+ "Please input your year of birth " + "\n" + "to discover your Chinese horoscope.");
		tArea.setEnabled(false);
		
		label1.setText("   Your fortune:");
		label2.setText("   Please input your year of birth: ");
		tField2.setEditable(true);
		label3.setText("   Try clicking the mystery button!");
		menuBar1.add(EditMenu);
		menuBar1.add(About);
		label3.setFont(getFont());

		//    ratPic.getImage();
		p2.add(label1);
		p2.add(tArea);
	p2.add(label3);
		
		p3.add(label2);
		p3.add(tField2);
		
		p4.add(clear);
		p4.add(enter);
		
		p5.add(fnl);
		p5.add(rml);
		p5.add(acl);
		
//		p6.add(label3);
		p6.add(mys);
		
		//add images of the animals
		animalPics.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\rat.png"))));
		animalPics.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\ox.png"))));
		animalPics.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\tiger.jpg"))));
		p7.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\rabbit.png"))));
		p7.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\dragon.png"))));
		p7.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\snake.png"))));
		p8.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\horse.jpg"))));
		p8.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\sheep.png"))));
		p8.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\monkey.png"))));
		p9.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\rooster.png"))));
		p9.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\dog.jpg"))));
		p9.add((new JLabel(new ImageIcon("C:\\Users\\wangu\\Desktop\\Animals\\pig.jpg"))));
		
		// set the layout of the interface
		this.setLayout(new GridLayout (6, 20) );
		p2.setLayout(new GridLayout (1, 3, 4, 4) );
		p3.setLayout(new GridLayout (1, 2, 4, 4) );
		p4.setLayout(new GridLayout (1, 2, 4, 4) );
		p5.setLayout(new GridLayout (1, 4, 4, 4) );
		p6.setLayout(new GridLayout (1, 0, 5, 5));
		
		animalPics.setLayout(new GridLayout(1, 3, 5, 5));
		p7.setLayout(new GridLayout(1, 3, 5, 5));
		p8.setLayout(new GridLayout(1, 3, 5, 5));
        p9.setLayout(new GridLayout(1, 3, 5, 5));
		tArea.setLineWrap(true);
		tArea.setSize(2000, 1500);

		this.setResizable(true);
//		this.add(p1);
		
		//this.add(tField);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.add(p5);
		this.add(p6);
		this.setVisible(true);
		this.setJMenuBar(menuBar1);
//		this.pack();
		this.add(label3,BorderLayout.CENTER);
		this.add(animalPics);
		this.add(p7);
		this.add(p8);
		this.add(p9);
		
		// ACTION LISTENERS
		clear.addActionListener(this);
		tField2.addActionListener(this);
		enter.addActionListener(this);
		
		fnl.addActionListener(this);
		acl.addActionListener(this);
		rml.addActionListener(this);
		
		fmi1.addActionListener(this);
		fmi2.addActionListener(this);
		fmi3.addActionListener(this);
		mys.addActionListener(this);
		
		// Format buttons and panels
		tArea.setFont(new Font("Microsoft JhengHei", Font.BOLD, 23));
		tField2.setFont(new Font("Microsoft JhengHei",Font.PLAIN,23));
		fnl.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		acl.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		rml.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		mys.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		enter.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		clear.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		label1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		label2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));
		label3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 25));

	}


	public static void main(String[] args) throws BadLocationException {
		
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		Zodiac a = new Zodiac("Chinese zodiac");
		a.launchGame();
	}
	
	public String Fnl(int year) {
		//return something based on their zodiac

		if(year == 1984 || year == 1996) { //Rat
			return 
					"Your overall financial luck is " + "\n"
					+ "about average." + "\n"
					+ "Avoid investments with significant risks, " + "\n"
					+ "as windfalls are not to be expected.";
		}

		if(year == 1985 || year == 1997) { //Ox
			return 
					"2017 is your lucky year!" + "\n"
					+ "You will easily obtain wealth this year, " + "\n"
					+ "but may encounter situations that require " + "\n"
					+ "over-stretching your budget.";
		}

		if (year == 1986 || year == 1998) { //Tiger
			return 
					"Apparently, you have offended the " + "\n" + 
					"Grand Duke of Jupiter this year." + "\n"
					+ "Hence, you will suffer financial losses.";
		}

		if (year == 1987 || year == 1999) { //Rabbit
			return 
					"You will be prone to facing lawsuits " + "\n"
					+ "and thus suffer a financial loss. " + "\n" +
					"Be wary of relatives asking to " + "\n"
					+ "borrow money.";
		}

		if (year == 1988 || year == 2000) { //Dragon
			return 
					"This is your year of excellence at work, " + "\n"
					+ "leading to an increase in income." + "\n" +
					"Avoid gambling or speculating.";
		}

		if (year == 1989 || year == 2001) { //Snake
			return
					"Your financial luck is in decline." + "\n" +
					"You will not have many opportunities " + "\n"
					+ "for bonuses at the workplace.";
		}

		if (year == 1990 || year == 2002) { //Horse
			return 
					"Money-making opportunities are in store!" + "\n" +
					"However, you may have large expenditures " + "\n" +
					"due to illnesses in the family.";
		}

		if (year == 1991 || year == 2003) { //Sheep
			return
					"You are unlikely to have " + "\n"
					+ "good luck in wealth." + "\n" +
					"You may face significant financial issues, " + "\n"
					+ "which will lead to a tighter budget.";
		}

		if (year == 1992 || year == 2004) { //Monkey
			return 
					"Your financial luck has increased!" + "\n" +
					"You will have a stable source of income " + "\n" 
					+ " due to good performance at " + "\n"
					+ "the workplace.";
		}

		if (year == 1993 || year == 2005) { //Rooster
			return
					"You will have stable income " + "\n" + 
					"with low likelihood of windfall." + "\n" +
					"Choose low-risk investments " + "\n"
					+ "and plan your finances carefully.";
		}

		if (year == 1994 || year == 2006) { //Dog
			return
					"Your wealth luck will remain " + "\n"
					+ "largely unchanged." + "\n" +
					"You will have many opportunities for " + "\n"
					+ "accumulating wealth, " + "\n"
					+ "but don't be greedy.";
		}

		if (year == 1995 || year == 2007) { //Pig
			return
					"Problems at work will limit " + "\n"
					+ "opportunities for improved income."  + "\n" +
					"Be wary of telephone and " + "\n"
					+ "internet scams.";
		}
		return "Please put a valid input!";
	}
	
	public String Career(int year) { // used to be Acl
		if(year == 1984 || year == 1996) { //Rat
			return 
					"Career development is in store for women." + "\n" +
					"Male rats will be slightly unlucky " + "\n" + 
					"so be sure to make an effort " + "\n" +
					"in building good relationships.";
		}

		if(year == 1985 || year == 1997) { //Ox
			return 
					"Your work will be recognized by a superior." + "\n" +
					"This is the year to focus on advancing " + "\n"
					+ "yourself as opportunities for " + "\n" +
					"career advancement abound.";
		}

		if (year == 1986 || year == 1998) { //Tiger
			return 
					"You will have good interpersonal" + "\n" 
					+ "relationships and receive help from "
					+ "friends and colleagues.";
		}

		if (year == 1987 || year == 1999) { //Rabbit
			return
					"It will be a challenging year for you," + "\n"
					+ "so avoid any job changes." + "\n" +
					"Take the initiative to lead at work.";
		}

		if (year == 1988 || year == 2000) { //Dragon
			return 
					"New opportunities and " + "\n"
					+ "breakthroughs in store!" + "\n" + 
					"Use this opportunity for " + "\n"
					+ "professional development," + "\n"
					+ "and improve on your work efficiency.";
		}

		if (year == 1989 || year == 2001) { //Snake
			return
					"This year sees an improvement in " + "\n"
					+ "interpersonal relationships at work." + "\n" + 
					"Prepare yourself for greater " + "\n"
					+ "work pressure.";
		}

		if (year == 1990 || year == 2002) { //Horse
			return 
					"You will face great changes in your career," + "\n"
					+ "but also receive a lot of " + "\n"
					+ "help from others." + "\n" +
					"Keep your head on your shoulders, " + "\n"
					+ "keep working hard.";
		}

		if (year == 1991 || year == 2003) { //Sheep
			return
					"Take the initiative to seek change " + "\n"
					+ "and innovation in your career. " + "\n" + 
					"Listen to your peers and colleagues," + "\n"
					+ "and be sure to keep up with the times.";
		}

		if (year == 1992 || year == 2004) { //Monkey
			return 
					"Your career luck has improved slightly " + "\n"
					+ "over the past year." + "\n" +
					"However, you will be prone to making " + "\n"
					+ "wrong decisions, so tread with caution.";
		}

		if (year == 1993 || year == 2005) { //Rooster
			return
					"Avoid making major changes in your " + "\n"
					+ "career and impulsive choices at work." + "\n" + 
					"This may result in career setbacks.";
		}

		if (year == 1994 || year == 2006) { //Dog
			return
					"You will have overall good luck " + "\n"
					+ "for the coming year." + "\n" +
					"Keep an eye out for a good mentor.";
		}

		if (year == 1995 || year == 2007) { //Pig
			return
					"This is a suitable year for you " + "\n"
					+ "to continue with higher education." + "\n"
					+ "You may easily offend your superiors," + "\n"
					+ "thus making it difficult " + "\n"
					+ "for you to get promoted.";
		}	
		return "Please input a valid value";
	}
	
	public String Rml(int year) {
		if(year == 1984 || year == 1996) { //Rat
			return 
					"Male rats will encounter women " + "\n"
					+ "older and more accomplished than them."  + "\n"
					+ "It is not advisable for female rats " + "\n"
					+ "to be romatically involved this year," + "\n"
					+ "as you will peak in your career this year.";
		}

		if(year == 1985 || year == 1997) { //Ox
			return 
					"You will have many opportunities " + "\n"
					+ "to meet 'The One' this year." + "\n"
					+ "This is a good time to start thinking " + "\n"
					+ "about marriage, for oxen in relationships.";
		}

		if (year == 1986 || year == 1998) { //Tiger
			return 
					"Single tigers will stand a good chance " + "\n"
					+ "of meeting the right one this year. " + "\n" +
					"You are unlikely to face major conflicts " + "\n"
					+ "with your partner.";
		}

		if (year == 1987 || year == 1999) { //Rabbit
			return 
					"You may face the possibility of a " + "\n"
					+ "long-distance relationship. " + "\n" +
					"Improve communication with your partner. ";
		}

		if (year == 1988 || year == 2000) { //Dragon
			return 
					"This is a stable year for you in " + "\n" 
					+ "the romance department." + "\n"
					+ "Use this opportunity for professional " + "\n"
					+ "development.";
		}

		if (year == 1989 || year == 2001) { //Snake
			return
					"Snakes should avoid dating this year." + "\n" +
					"However, snakes already in relationships " + "\n"
					+ "are in store for advances " + "\n"
					+ "in the relationship.";
		}

		if (year == 1990 || year == 2002) { //Horse
			return 
					"You will have good luck with " + "\n"
					+ "the opposite sex, but most of which " + "\n"
					+ "are unfavorable. " + "\n" +
					"For those in relationships, " + "\n"
					+ "pay more attention to your partner. ";
		}

		if (year == 1991 || year == 2003) { //Sheep
			return
					"Developing romantic relationships " + "\n"
					+ "may negatively impact career development." + "\n" +
					"Married sheep may also be prone " + "\n" 
					+ "to extramarital affairs.";
		}

		if (year == 1992 || year == 2004) { //Monkey
			return 
					"Single monkeys will mingle more "
					+ "this year, and will easily " + "\n"
					+ "form relationships.";
		}

		if (year == 1993 || year == 2005) { //Rooster
			return
					"This year won't be great emotionally," + "\n"
					+ "so let your love life take a backseat." + "\n" +
					"Do not allow social pressure to " + "\n"
					+ "force you into forming romantic " + "\n"
					+ "relationships.";
		}

		if (year == 1994 || year == 2006) { //Dog
			return
					"Singles will have good luck " + "\n"
					+ "in looking for a partner." + "\n" +
					"However, men will unlikely have " + "\n"
					+ "stable relationships this year.";
		}

		if (year == 1995 || year == 2007) { //Pig
			return
					"This is not a good year for developing " + "\n"
					+ "romantic relationships." + "\n"
					+ "You are unlikely to find the right one," + "\n"
					+ "so take it easy.";
		}	   
		return "Please input a valid value";
	}

	public String theZodiac(int year) {
		if(year == 1984 || year == 1996) { //Rat
			return "You were born in the year of the Rat!";
		}

		if(year == 1985 || year == 1997) { //Ox
			return "You were born in the year of the Ox!";
		}

		if (year == 1986 || year == 1998) { //Tiger
			return "You were born in the year of the Tiger!";
		}

		if (year == 1987 || year == 1999) { //Rabbit
			return "You were born in the year of the Rabbit!";
		}

		if (year == 1988 || year == 2000) { //Dragon
			return "You were born in the year of the Dragon!";
		}

		if (year == 1989 || year == 2001) { //Snake
			return "You were born in the year of the Snake!";
		}

		if (year == 1990 || year == 2002) { //Horse
			return "You were born in the year of the Horse!";
		}

		if (year == 1991 || year == 2003) { //Sheep
			return "You were born in the year of the Sheep!";
		}

		if (year == 1992 || year == 2004) { //Monkey
			return "You were born in the year of the Monkey!";
		}

		if (year == 1993 || year == 2005) { //Rooster
			return "You were born in the year of the Rooster!";
		}

		if (year == 1994 || year == 2006) { //Dog
			return "You were born in the year of the Dog!";
		}

		if (year == 1995 || year == 2007) { //Pig
			return "You were born in the year of the Pig!";
		}	   
		return null;
	}


	@Override
	public void actionPerformed(ActionEvent x) {
		// TODO Auto-generated method stub
		//think about if there are any other features to add!
		try {
			String text = tField2.getText();
			String cpContent = "";

			if(x.getSource() == enter) {
				int num = Integer.parseInt(text);
				tArea.setText(Animals.setZodiac(num));
			}
			if(x.getSource() == fnl) {
				int num = Integer.parseInt(text);
				tArea.setText(Fnl(num));
			}   
			if(x.getSource() == acl) {
				int num = Integer.parseInt(text);
				tArea.setText(Career(num));;
			}   
			if(x.getSource() == rml) {
				int num = Integer.parseInt(text);
				tArea.setText(Rml(num));
			}

			// And also think about what to do when they press those 12 zodiacs, maybe display some graphics?
			if(x.getSource() == clear) {
				tField2.setText("");
			}
			if(x.getSource() == mys) {
				{		
					//			try {
					Desktop.getDesktop().browse(java.net.URI.create("https://www.youtube.com/watch?v=may2s9j4RLk"));	
					//			}catch (IOException e) {
					//				// TODO Auto-generated catch block
					//				e.printStackTrace();
					//			}
				}

			}
			if(x.getSource() == fmi1){
				cpContent = tField2.getText();
			}

			if(x.getSource() == fmi2){
				tField2.setText("" + cpContent);
			}

			if(x.getSource() == fmi3){
				System.exit(0);
			}

		}catch(Exception a) {
			tArea.setText("Please input your YEAR of birth.");
		}
	}
}



