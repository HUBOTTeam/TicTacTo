import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
public class aiGui extends JFrame {
	String userChois;//store user choice here
	String computerPlayingVar;//store computer playing variable
	int computerBestChois = 0;//to store the best index the computer will play
	int winingLine = 0;//count the amount of wining line
	///////////////////////////////////////////////////////////////////////////////////////////////////
	JLabel choose = new JLabel("choose before start : ");
	JLabel bChoise = new JLabel("best choise : ");
	JLabel bChoises = new JLabel("number of wining line : ");
	JLabel Result = new JLabel("Result : ");
	JLabel nelsonfn = new JLabel("nelson predictoin");
	JLabel turn = new JLabel("turn//");
	///////////////////////////////////////////////////////////////////////////////////////////////////
	JTextField bc = new JTextField();//write only on side of bChoise
	JTextField bcs = new JTextField();//write only on side of number of wining line
	JTextField result = new JTextField();//write only to show the result
	JTextField nelsontxt = new JTextField();//write only to show nelson function prediction for winner
	JTextField turnTxt = new JTextField("X");//write only to show whos turn is next
	///////////////////////////////////////////////////////////////////////////////////////////////////
	JButton X = new JButton("X");//if the user want to choose X
	JButton O = new JButton("O");//if the user want to choose O
	/////////////////////////////here is the tictac board buttons ////////////////////////////////////
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4"); 
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	JButton allow = new JButton("Alow computer to play");//to allow the computer to play after your turn
	JButton reset = new JButton("reset");//to reset every thing
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	JPanel upperPanel = new JPanel();//choose label and the two radio buttons
	JPanel rightPanel = new JPanel(new GridLayout(4,2,4,4));//bchoise,bchoiseS,Result the three write only text fields
	JPanel lowerPanel = new JPanel();//allow computer to play and reset button
	JPanel centerPanel = new JPanel(new GridLayout(3,3,1,1));//put the tic tac board on it 
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	boolean [] butarray = {true,true,true,true,true,true,true,true,true} ;//to let the algorithm know if its filled or not
	JButton[] buttonsArray = {one,two,three,four,five,six,seven,eight,nine};//store buttons in array
	
	
	public aiGui(){ 
	/////////////////////////////////////////////////////////////////////////////////////////////////
        upperPanel.setBackground(Color.BLACK);
		lowerPanel.setBackground(Color.BLACK);
		rightPanel.setBackground(Color.BLACK);
		centerPanel.setBackground(Color.BLACK);
    ////////////////to prevent the user from doing any thing befor choose a character//////////////////
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		allow.setEnabled(false);
		reset.setEnabled(false);
	/////////////////////////////////////group buttons//////////////////////////////////////////////////////////////
		ButtonGroup g = new ButtonGroup();//to make the user choose one playing var only
		g.add(O);
		g.add(X);
	///////////////////////////////////////////////////////////////////////////////////////////////////
		bc.setEditable(false);
		bcs.setEditable(false);
		turnTxt.setEditable(false);//to make the text fields a write only text fields
		nelsontxt.setEditable(false);
		result.setEditable(false);
	///////////////////////////////setLayout///////////////////////////////////////////////////////////
		setLayout(new BorderLayout());//fram layout
	///////////////////////////////CENTRAL PANEL(playing board)////////////////////////////////////////
	one.setBackground(Color.BLACK);
	two.setBackground(Color.BLACK);
	three.setBackground(Color.BLACK);
	four.setBackground(Color.BLACK);
	five.setBackground(Color.BLACK);
	six.setBackground(Color.BLACK);
	seven.setBackground(Color.BLACK);
	eight.setBackground(Color.BLACK);
	nine.setBackground(Color.BLACK);
	////////////////////////////////
	one.setForeground(Color.WHITE);
	two.setForeground(Color.WHITE);
	three.setForeground(Color.WHITE);
	four.setForeground(Color.WHITE);
	five.setForeground(Color.WHITE);
	six.setForeground(Color.WHITE);
	seven.setForeground(Color.WHITE);
	eight.setForeground(Color.WHITE);
	nine.setForeground(Color.WHITE);
	////////////////////////////////
	one.setFont(new Font("Arial", Font.PLAIN, 40));
	two.setFont(new Font("Arial", Font.PLAIN, 40));
	three.setFont(new Font("Arial", Font.PLAIN, 40));
	four.setFont(new Font("Arial", Font.PLAIN, 40));
	five.setFont(new Font("Arial", Font.PLAIN, 40));
	six.setFont(new Font("Arial", Font.PLAIN, 40));
	seven.setFont(new Font("Arial", Font.PLAIN, 40));
	eight.setFont(new Font("Arial", Font.PLAIN, 40));
	nine.setFont(new Font("Arial", Font.PLAIN, 40));
	////////////////////////////////
	 centerPanel.setBorder(new EmptyBorder(2, 3, 2, 3));
      centerPanel.add(one);
      centerPanel.add(two);
      centerPanel.add(three);
      centerPanel.add(four);
      centerPanel.add(five);
      centerPanel.add(six);
      centerPanel.add(seven);
      centerPanel.add(eight);
      centerPanel.add(nine);
	/////////////////////////////////lower panel//////////////////////////////////////////////////////////////////////
	allow.setBackground(Color.BLACK);
	reset.setBackground(Color.BLACK);
	allow.setForeground(Color.WHITE);
	reset.setForeground(Color.WHITE);
	lowerPanel.add(allow);
	lowerPanel.add(reset);
	////////////////////////////////upper panel///////////////////////////////////////////////////////////////////////
	upperPanel.add(turnTxt);
	upperPanel.add(turn);
	upperPanel.add(choose);
	upperPanel.add(X);
	upperPanel.add(O);
	///////////////////////////////right panel////////////////////////////////////////////////////////////////////////
	bc.setFont(new Font("Arial", Font.PLAIN, 40));
	bcs.setFont(new Font("Arial", Font.PLAIN, 40));
	result.setFont(new Font("Arial", Font.PLAIN, 40));
	nelsontxt.setFont(new Font("Arial", Font.PLAIN, 40));
	bChoise.setFont(new Font("Arial", Font.PLAIN, 20));
	bChoises.setFont(new Font("Arial", Font.PLAIN, 20));
	Result.setFont(new Font("Arial", Font.PLAIN, 20));
	nelsonfn.setFont(new Font("Arial", Font.PLAIN, 20));
	bChoise.setForeground(Color.WHITE);
	bChoises.setForeground(Color.WHITE);
	Result.setForeground(Color.WHITE);
	nelsonfn.setForeground(Color.WHITE);
	rightPanel.add(bChoise);
	rightPanel.add(bc);
	rightPanel.add(bChoises);
	rightPanel.add(bcs);
	rightPanel.add(Result);
	rightPanel.add(result);
	rightPanel.add(nelsonfn);
	rightPanel.add(nelsontxt);
	/////////////////////////////add to frame/////////////////////////////////////////////////////////////////////////
	add(upperPanel,BorderLayout.NORTH);
	add(centerPanel,BorderLayout.CENTER);
	add(rightPanel,BorderLayout.EAST);
	add(lowerPanel,BorderLayout.SOUTH);
//////////////////////////////Action Events on radio buttons//////////////////////////////////////////////////////////////
	X.addActionListener(
			new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			userChois = "X";
			computerPlayingVar = "O";
			X.setEnabled(false);
			O.setEnabled(false);
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
			allow.setEnabled(true);
			reset.setEnabled(true);
			bestChois();
		}
		}		
		);

	O.addActionListener(
			new ActionListener(){
		public void actionPerformed(ActionEvent e) {
           userChois = "O";
           computerPlayingVar = "X";
           O.setEnabled(false);
            X.setEnabled(false);
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
			allow.setEnabled(true);
			reset.setEnabled(true);
			bestChois();
		}
		}		
		);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////Action Events on board buttons/////////////////////////////////////////////////////////
		one.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				one.setEnabled(false);
				one.setText(userChois);  
				butarray[0] = false;
				bestChois();
				turnTxt.setText(computerPlayingVar);
				userEndGame();
				
			}
			}		
			);
		
		two.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				two.setEnabled(false);
				two.setText(userChois);  
				butarray[1] = false;
				bestChois();
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
		
		three.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				three.setEnabled(false);
				three.setText(userChois);  
				butarray[2] = false;
				bestChois();
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
		
		four.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				four.setEnabled(false);
				butarray[3] = false;
				four.setText(userChois);
				bestChois();   
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
		
		five.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				five.setEnabled(false);
				five.setText(userChois);   
				butarray[4] = false;
				bestChois();
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
		
		six.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				six.setEnabled(false);
				six.setText(userChois); 
				butarray[5] = false;
				bestChois();
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
		
		seven.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				seven.setEnabled(false);
				seven.setText(userChois);  
				butarray[6] = false;
				bestChois();
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
		
		eight.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				eight.setEnabled(false);
				eight.setText(userChois);  
				butarray[7] = false;
				bestChois();
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
		
		nine.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				nine.setEnabled(false);
				nine.setText(userChois);    
				butarray[8] = false;
				bestChois();
				userEndGame();
				turnTxt.setText(computerPlayingVar);
			}
			}		
			);
//////////////////////////////Action Events on buttons/////////////////////////////////////////////////////////
		allow.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			       if(chickWin()) {
			    		buttonsArray[computerBestChois].setText(computerPlayingVar);
						butarray[computerBestChois] = false;
						buttonsArray[computerBestChois].setEnabled(false);
			       }
				
			else if(chickWinOppirtinity()) {
					buttonsArray[computerBestChois].setText(computerPlayingVar);
					butarray[computerBestChois] = false;
					buttonsArray[computerBestChois].setEnabled(false);
				}
				else {
				bestChois();
				buttonsArray[computerBestChois].setText(computerPlayingVar);
				butarray[computerBestChois] = false;
				buttonsArray[computerBestChois].setEnabled(false);

				}
				turnTxt.setText(userChois);
				bestChois();
				compEndGame();
			}
			}		
			);
	
		reset.addActionListener(
				new ActionListener(){
			public void actionPerformed(ActionEvent e) {
	            for(int i = 0; i < butarray.length;i++)
	            	butarray[i]=true;
	            
	            O.setEnabled(true);
	            X.setEnabled(true);
				one.setEnabled(false);
				two.setEnabled(false);
				three.setEnabled(false);
				four.setEnabled(false);
				five.setEnabled(false);
				six.setEnabled(false);
				seven.setEnabled(false);
				eight.setEnabled(false);
				nine.setEnabled(false);
				allow.setEnabled(false);
				
				one.setText("1");
				two.setText("2");
				three.setText("3");
				four.setText("4");
				five.setText("5");
				six.setText("6");
				seven.setText("7");
				eight.setText("8");
				nine.setText("9");
				
				bc.setText("");
				bcs.setText("");
				result.setText("");
				nelsontxt.setText("");
				
	            
			}
			}		
			);	
	}//constructor
//////////////////////////////////////check methods//////////////////////////////////////////////////////////
public void bestChois() {
		
		Stack<Integer> stack = new Stack<Integer>();//store the last best location on board
		Stack<Integer> stack1 = new Stack<Integer>();//store the maximum wining line
		stack.push(0);
		int max = stack1.push(0);
		winingLine=0;
		for(int i = 0; i < butarray.length;i++) {
			if( (butarray[i])) {
				switch(i) {
				case 0:
					if( (butarray[i+1]) &&  (butarray[i+2]))
						winingLine++;
					if( (butarray[i+3]) &&  (butarray[i+6]))
						winingLine++;
					if( (butarray[i+4]) &&  (butarray[i+8]))
						winingLine++;
					break;
				case 1:
					if( (butarray[i+1]) &&  (butarray[i-1]))
						winingLine++;
					if( (butarray[i+3]) &&  (butarray[i+6]))
						winingLine++;
					break;
				case 2:
					if( (butarray[i-1]) &&  (butarray[i-2]))
						winingLine++;
					if( (butarray[i+3]) &&  (butarray[i+6]))
						winingLine++;
					if( (butarray[i+2]) &&  (butarray[i+4]))
						winingLine++;
					break;
				case 3:
					if( (butarray[i+3]) &&  (butarray[i-3]))
						winingLine++;
					if( (butarray[i+2]) &&  (butarray[i+1]))
						winingLine++;
					break;
				case 4:
					if( (butarray[i-2]) &&  (butarray[i+2]))
						winingLine++;
					if( (butarray[i+4]) &&  (butarray[i-4]))
						winingLine++;
					if( (butarray[i+3]) &&  (butarray[i-3]))
						winingLine++;
					if( (butarray[i-1]) &&  (butarray[i+1]))
						winingLine++;
					break;
				case 5:
					if( (butarray[i-1]) &&  (butarray[i-2]))
						winingLine++;
					if( (butarray[i+3]) &&  (butarray[i-3]))
						winingLine++;
					break;
				case 6:
					if( (butarray[i+1]) &&  (butarray[i+2]))
						winingLine++;
					if( (butarray[i-3]) &&  (butarray[i-6]))
						winingLine++;
					if( (butarray[i-2]) &&  (butarray[i-4]))
						winingLine++;
					break;
				case 7:
					if( (butarray[i+1]) &&  (butarray[i-1]))
						winingLine++;
					if( (butarray[i-3]) &&  (butarray[i-6]))
						winingLine++;
					break;
				case 8:
					if( (butarray[i-1] ) &&  (butarray[i-2]))
						winingLine++;
					if( (butarray[i-3]) &&  (butarray[i-6]))
						winingLine++;
					if( (butarray[i-4]) &&  (butarray[i-8]))
						winingLine++;
					break;
			
			
			}//switch
				/////////////////////////////////////////////////////
				if(winingLine > max)//this if ensure that the stack will store the max winlines 
				if(winingLine >= stack1.pop()) {//this if statment is to replace the value of max lines in stack 1 with a higher value and push the index place of this value into stack
					max = winingLine;//to re new my evaluation var and make sure the highest value will be stored
				stack1.push(winingLine);
				stack.push(i);
				System.out.println("wining line > max and copmuter best choice is " + i);
				}
				else if (winingLine <= max) {//if no win opportinity and no wining line this if will take care of it
				int count = 0;
					while(butarray[count] == false) {
						count++;
					}
					stack.push(count);
					stack1.push(max);
					System.out.println("wining line > max and copmuter best choice is " + count);
					break;

				}
				///////////////////////////////////////////////////////
			}//ifstatment
			winingLine=0;
	        }//loop
                 
         computerBestChois =stack.pop();
         bc.setText(String.valueOf((computerBestChois)+1));
 		bcs.setText(String.valueOf(stack1.pop()));
//         buttonsArray[computerBestChois].setEnabled(false);
//         butarray[computerBestChois] = false;
	        }//method
            
///////////////////check win method/////////////////////////////////////////////////////////
public boolean chickWin() {//check if there is one move to win and makes it

		int counter = 0;//the of it to count how many true buttons once in row ,once on column , once in diagonal path,if it is = 1 jast break every thing and return a value
		 ////row 1
		for(int i = 0;i < 3;i++) {
			if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
			counter++;
			System.out.println("chick win is used row1");
		}//if1
			else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
				computerBestChois = i;
				System.out.println("chick win is used row1 and computer best chois is" + computerBestChois);

			}
			else if(buttonsArray[i].getText() == userChois) {
				counter = 0;
				break;	
			}
		}//loop1
		if(counter == 2) {//checker
			System.out.println("row1 counter = 2");
			return true;
		}
		else
			counter = 0;

		
		////row2
		for(int i = 3;i < 6;i++) {
			if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
				counter++;
				System.out.println("chick win is used row2");

		}//if2
			else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
				computerBestChois = i;
				System.out.println("chick win is used row2 and computer best chois is" + computerBestChois);

			}
			else if(buttonsArray[i].getText() == userChois) {
				counter = 0;
				break;	
			}
		}//loop2
		if(counter == 2) {//checker
			System.out.println("row2 counter = 2");

			return true;
		}
		else
			counter = 0;

		
		////row3
		for(int i = 6;i < 9;i++) {
			if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
				counter++;
				System.out.println("chick win is used row3");

		}//if3			
			else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
				computerBestChois = i;
				System.out.println("chick win is used row3 and computer best chois is" + computerBestChois);

			}
			else if(buttonsArray[i].getText() == userChois) {
				counter = 0;
				break;	
			}
		}//loop3
		if(counter == 2) {//checker
			System.out.println("row3 counter = 2");
			return true;
		}
		else
			counter = 0;
		///////////////////////////////////column/////////////////////////////////////////////////////
		 ////col 1
			for(int i = 0;i < 7;i+=3) {
				if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
					counter++;
					System.out.println("chick win is used col1");

			}//if1
				else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
					computerBestChois = i;
					System.out.println("chick win is used col1 and computer best chois is" + computerBestChois);

				}
				else if(buttonsArray[i].getText() == userChois) {
					counter = 0;
					break;	
				}
			}//loop1
			if(counter == 2) {//checker
				System.out.println("col1 counter = 2");

				return true;
			}
			else
				counter = 0;

			
			////col 2
			for(int i = 1;i < 8;i+=3) {
				if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
					counter++;
					System.out.println("chick win is used col2");

			}//if2
				else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
					computerBestChois = i;
					System.out.println("chick win is used col2 and computer best chois is" + computerBestChois);

				}
				else if(buttonsArray[i].getText() == userChois) {
					counter = 0;
					break;	
				}
			}//loop2
			if(counter == 2) {//checker
				System.out.println("col2 counter = 2");
				return true;
			}
			else
				counter = 0;

			
			////col3
			for(int i = 2;i < 9;i++) {
				if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
					counter++;
					System.out.println("chick win is used col3");

			}//if3			
				else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
					computerBestChois = i;
					System.out.println("chick win is used col3 and computer best chois is" + computerBestChois);

				}
				else if(buttonsArray[i].getText() == userChois) {
					counter = 0;
					break;	
				}
			}//loop3
			if(counter == 2) {//checker
				System.out.println("col3 counter = 2");

				return true;
			}
			else
				counter = 0;
			//////////////////////////diagonal////////////////////////////////////////////////////
			 ////dia 1
				for(int i = 0;i < 9;i+=4) {
					if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
						counter++;
						System.out.println("chick win is used diagonal1");

				}//if1
					else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
						computerBestChois = i;
						System.out.println("chick win is used diagonal1 and computer best chois is" + computerBestChois);

					}
					else if(buttonsArray[i].getText() == userChois) {
						counter = 0;
						break;	
					}
				}//loop1
				if(counter == 2) {//checker
					System.out.println("dia 1 counter = 2");

					return true;
				}
				else
					counter = 0;

				
				////row2
				for(int i = 2;i < 7;i+=2) {
					if((butarray[i] == false) && (buttonsArray[i].getText() == computerPlayingVar )) {
						counter++;
						System.out.println("chick win is used diagonal3");

				}//if2
					else if(butarray[i] && buttonsArray[i].getText() != userChois && buttonsArray[i].getText() != computerPlayingVar ) {
						computerBestChois = i;
						System.out.println("chick win is used diagonal 3 and computer best chois is" + computerBestChois);

					}
					else if(buttonsArray[i].getText() == userChois) {
						counter = 0;
						break;	
					}
				}//loop2
				if(counter == 2) {//checker
					System.out.println("dia3 counter = 2");

					return true;
				}
				else
					counter = 0;
				
				return false;

	
	}


///////////////check win apportinity/////////////////////////////////////////////////////////

public boolean chickWinOppirtinity() {//check the other player win apportinity and block it if it is possible to be blocked
	int counter = 0;//the of it to count how many true buttons once in row ,once on column , once in diagonal path,if it is = 1 jast break every thing and return a value
	 ////row 1
	for(int i = 0;i < 3;i++) {
		if((butarray[i] == false) && (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is used row1");
	}//if1
		else if((butarray[i] && (buttonsArray[i].getText() != userChois) && (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used row1 and computer best chois is" + computerBestChois);
		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetinty is used row1 and computer best chois is" + computerBestChois);
			
		}
	}//loop1
	if(counter == 2) {//checker
		System.out.println("counter = 2 row 1");
		return true;
	}
	else
		counter = 0;

	
	////row2
	for(int i = 3;i < 6;i++) {
		if((butarray[i] == false) && (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is useed row2");
	}//if2
		else if((butarray[i] && (buttonsArray[i].getText() != userChois) && (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used row2 and computer best chois is" + computerBestChois);
		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetinty break is used row2 and computer best chois is" + computerBestChois);
		}
	}//loop2
	if(counter == 2) {//checker
		System.out.println("row2 counter = 2");
		return true;
	}
	else
		counter = 0;

	
	////row3
	for(int i = 6;i < 9;i++) {
		if((butarray[i] == false) && (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is useed row3");
	}//if3			
		else if((butarray[i] && (buttonsArray[i].getText() != userChois) && (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used row3 and computer best chois is" + computerBestChois);

		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetinty break is used row3 and computer best chois is" + computerBestChois);
		}

	}//loop3
	if(counter == 2) {//checker
		System.out.println("row3 counter = 2");
		return true;
	}
	else
		counter = 0;

	//////////////////////columns////////////////////////////
	////column 1
	for(int i = 0;i < 7;i+=3){
		if((butarray[i] == false) && (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is useed col1");
		}//if1
		else if((butarray[i] && (buttonsArray[i].getText() != userChois) && (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used col1 and computer best chois is" + computerBestChois);

		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetintybreak is used col1 and computer best chois is" + computerBestChois);
		}
	}//loop1
	if(counter == 2) {//checker
		System.out.println("col1 counter = 2");
		return true;
	}
	else
	  counter = 0;

	////column 2
	for(int i = 1;i < 8;i+=3) {
		if((butarray[i] == false )&& (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is useed col2");
	}//if2
		else if((butarray[i] && (buttonsArray[i].getText() != userChois )&& (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used col2 and computer best chois is" + computerBestChois);

		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetinty break is used col2 and computer best chois is" + computerBestChois);
		}
	}//loop2
	if(counter == 2) {//checker
		System.out.println("col2 counter = 2");
		return true;
	}
	else
		counter = 0;

	////column 3
	for(int i = 2;i < 9;i+=3) {
		if((butarray[i] == false) && (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is useed col3");
	}//if3
		else if((butarray[i] && (buttonsArray[i].getText() != userChois)&& (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used col3 and computer best chois is" + computerBestChois);

		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetinty break is used col3 and computer best chois is" + computerBestChois);
		}
	}//loop3
	if(counter == 2) {//checker
		System.out.println("col3 counter = 2");
		return true;
	}
	else
		counter = 0;

	///////////////////////////diagonal////////////////////////////////
	////from up left diagonal/////////////////////////////////////////
	for(int i = 0;i < 9;i+=4) {
		if((butarray[i] == false) && (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is useed diagonal from 1");
	}//if1
		else if((butarray[i] && (buttonsArray[i].getText() != userChois )&& (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used diagonal form 1 and computer best chois is" + computerBestChois);

		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetinty break is used dai and computer best chois is" + computerBestChois);
		}
	}//loop1
	if(counter == 2) {//checker
		System.out.println("diagonal1 counter = 2");
		return true;
	}
	else
		counter = 0;

	////from up right diagonal/////////////////////////////////////////
	for(int i = 2;i < 7;i+=2) {
		if(butarray[i] == false && (buttonsArray[i].getText() == userChois )) {
			counter++;
			System.out.println("chicoppetinty is useed diagonal from 3");
	}//if2
		else if((butarray[i] && (buttonsArray[i].getText() != userChois )&& (buttonsArray[i].getText() != computerPlayingVar))) {
			computerBestChois = i;
			System.out.println("chicoppetinty is used diagonal 3 and computer best chois is" + computerBestChois);

		}
		else if((butarray[i]==false && (buttonsArray[i].getText() == computerPlayingVar))) {
			counter = 0;
			System.out.println("chicoppetinty break is used dia2 and computer best chois is" + computerBestChois);
		}
	}//loop2
	if(counter == 2 ) {//checker
		System.out.println("diagonal3 counter = 2");
		return true;
	}
	else
		counter = 0;

		return false;
}//end of opportinity checker method

void userEndGame() {//when someone when it will ternimate the game
	
	int counter = 0;//counter to check if any dont match the conditions if it 3 it mean some one has win 
	//row1
	for(int i = 0; i < 3;i++) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(userChois + "IS THE WINNER");
	}
	else
		counter = 0;
	//row 2
	for(int i = 3; i < 6;i++) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(userChois + "IS THE WINNER");
	}
	else
		counter = 0;
		//row 3
	for(int i = 6; i < 9;i++) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(userChois + "IS THE WINNER");
	}
	else
		counter = 0;
	///////////////////columns//////////////////////////////////////
		//col1
	for(int i = 0; i < 7;i+=3) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(userChois + "IS THE WINNER");
	}
	else
		counter = 0;
		//col2
	for(int i = 1; i < 8;i+=3) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(userChois + "IS THE WINNER");
	}
	else
		counter = 0;
		
		//col3
	for(int i = 2; i < 9;i+=3) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(userChois + "IS THE WINNER");
	}
	else
		counter = 0;
		//////////////////diagonal//////////////////////////////////
		//dia top left
	for(int i = 0; i < 9;i+=4) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(userChois + "IS THE WINNER");
	}
	else
		counter = 0;
		//dia top right
	for(int i = 2; i < 7;i+=2) {
		if(buttonsArray[i].getText() == userChois) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText("("+userChois+")" + " IS THE WINNER");
	}
	else
		counter = 0;
}//end of userEndGame
 void compEndGame() {//when computer when it will ternimate the game

	int counter = 0;//counter to check if any dont match the conditions if it 3 it mean some one has win 
	//row1
	for(int i = 0; i < 3;i++) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(computerPlayingVar + "IS THE WINNER");
	}
	else
		counter = 0;
	//row 2
	for(int i = 3; i < 6;i++) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(computerPlayingVar + "IS THE WINNER");
	}
	else
		counter = 0;
		//row 3
	for(int i = 6; i < 9;i++) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(computerPlayingVar + "IS THE WINNER");
	}
	else
		counter = 0;
	///////////////////columns//////////////////////////////////////
		//col1
	for(int i = 0; i < 7;i+=3) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(computerPlayingVar + "IS THE WINNER");
	}
	else
		counter = 0;
		//col2
	for(int i = 1; i < 8;i+=3) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(computerPlayingVar + "IS THE WINNER");
	}
	else
		counter = 0;
		
		//col3
	for(int i = 2; i < 9;i+=3) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(computerPlayingVar + "IS THE WINNER");
	}
	else
		counter = 0;
		//////////////////diagonal//////////////////////////////////
		//dia top left
	for(int i = 0; i < 9;i+=4) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText(computerPlayingVar + "IS THE WINNER");
	}
	else
		counter = 0;
		//dia top right
	for(int i = 2; i < 7;i+=2) {
		if(buttonsArray[i].getText() == computerPlayingVar) {
			counter ++;
		}
		else
			break;
	}
	if(counter == 3) {
		  O.setEnabled(false);
          X.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			allow.setEnabled(false);
			bc.setText("");
			bcs.setText("");
			nelsontxt.setText("");
			result.setText("("+computerPlayingVar+")" + " IS THE WINNER");
	}
	else
		counter = 0;
}//end of compEndGame
 


}
