import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Checkbook implements ActionListener{
   static JFrame frm = new JFrame("Checkbook");
	static ActionListener AL;
   static CardLayout cards;
   static JPanel cardPanel;
   static JPanel card1;
   static JPanel card2;
   static JPanel card3;
   static JPanel card4;
   static JPanel card5;
   static JPanel card6;
   static JPanel card7;
   static JPanel card8;
	public static void main(String[] args) {
      ActionListener AL = new Checkbook() ;
      frm.setLayout(new BorderLayout());
      
      
       //card layout
      cards =new CardLayout();
      cardPanel = new JPanel(); 
      cardPanel.setLayout(cards); 
      card1 = new JPanel(new BorderLayout()); //creates main card
      card2 = new JPanel(new BorderLayout()); //new account card
      card3 = new JPanel(new BorderLayout()); //load
      card4 = new JPanel(new BorderLayout()); //add new
      card5 = new JPanel(new BorderLayout()); //search
      card6 = new JPanel(new BorderLayout()); //Sort
      card7 = new JPanel(new BorderLayout()); //view/delete
      card8 = new JPanel(new BorderLayout()); //backup
      cardPanel.add(card1, "Main");
      card1();
      cardPanel.add(card2, "account");
      card2();
      cardPanel.add(card3, "Load");
		card3();
      cardPanel.add(card4, "add new");
      card4();
      cardPanel.add(card5, "search");
      card5();
      cardPanel.add(card6, "Sort");
      card6();
      cardPanel.add(card7, "view");
      card7();
      cardPanel.add(card8, "backup");
      card8();
      frm.add(cardPanel, BorderLayout.CENTER);
      }
//>>>>>>>>>>>>>>>>>>>>Card 1<<<<<<<<<<<<<<<<<<<<      
		public static void card1()
      {
       ActionListener AL = new Checkbook() ;
      //header 
		JPanel Top = new JPanel(new BorderLayout (2,1));
		JLabel D = new JLabel("Use The Buttons Below To Manage Transactions");
      D.setFont(new Font("Arial", Font.BOLD, 20));
      D.setHorizontalAlignment(JLabel.CENTER);
      Top.add(D);
		card1.add(Top, BorderLayout.NORTH);
		//end header
      
      //text
      JPanel Mid = new JPanel(new FlowLayout());
		JLabel name1 = new JLabel("Account name");
		Mid.add(name1);
      JTextField Tf = new JTextField("big floppy ****");
      Mid.add(Tf);
		JLabel name2 = new JLabel("placeholder");
		Mid.add(name2);
		JTextField Tf2 = new JTextField("placeholder");
		Mid.add(Tf2);
      card1.add(Mid, BorderLayout.CENTER);
      //end text
		//start buttons
		JPanel Bottom = new JPanel(new GridLayout(2,1));
   		JPanel Bottom1 = (new JPanel(new GridLayout(1,3)));
      		JButton Create = new JButton("Create a New Account");
      		Bottom1.add(Create);
            Create.addActionListener(AL);
      		JButton Load = new JButton("Load Trans from a File");
      		Bottom1.add(Load);
            Load.addActionListener(AL);
      		JButton Trans = new JButton("Add New Transactions");
      		Bottom1.add(Trans);
            Trans.addActionListener(AL);
      		JButton Search = new JButton("Search Transactions");
      		Bottom1.add(Search);
            Search.addActionListener(AL);
      		Bottom.add(Bottom1);
   		JPanel Bottom2 = (new JPanel(new GridLayout(1,3)));
      		JButton Sort = new JButton("Sort Transactions");
      		Bottom2.add(Sort);
            Sort.addActionListener(AL);
      		JButton View = new JButton("View/Delete Transactions");
      		Bottom2.add(View);
            View.addActionListener(AL);
      		JButton Backup = new JButton("Backup Transactions");
      		Bottom2.add(Backup);
            Backup.addActionListener(AL);
      		JButton Exit = new JButton("Exit");
      		Bottom2.add(Exit);
            Exit.addActionListener(AL);
      Bottom.add(Bottom2);	
		card1.add(Bottom, BorderLayout.SOUTH);
      //end buttons
   }   
//>>>>>>>>>>>>>>>>>>>>>card2<<<<<<<<<<<<<<<<<<<<<
   public static void card2()
   {
      ActionListener AL = new Checkbook() ;
      JPanel T = (new JPanel(new BorderLayout()));
      JLabel H = new JLabel("Create a New Account");
      H.setFont(new Font("Arial", Font.PLAIN, 20));
      H.setHorizontalAlignment(JLabel.CENTER);
      T.add(H, BorderLayout. NORTH);
      JPanel M = new JPanel(new FlowLayout());
      JLabel aName = new JLabel("Account name");
      M.add(aName);
      JTextField acc = new JTextField("      ");
      M.add(acc);
      T.add(M, BorderLayout.SOUTH);
      card2.add(T, BorderLayout.NORTH);
      
      JLabel bal = new JLabel("Initial Balance");
      bal.setHorizontalAlignment(JLabel.CENTER);
      JPanel B = new JPanel(new BorderLayout());
      B.add(bal, BorderLayout.CENTER);
      card2.add(B, BorderLayout.CENTER);
      
      JPanel buttons = new JPanel(new FlowLayout());
      JButton create = new JButton("create");
      buttons.add(create);
      JButton cancel = new JButton("cancel");
      buttons.add(cancel);
      cancel.addActionListener(AL);
      card2.add(buttons, BorderLayout.SOUTH);
      
      frm.pack();
      frm.setLocationRelativeTo(null);
	   frm.setSize(750,250);
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
   }
//>>>>>>>>>>>>>>>>>>>card 3<<<<<<<<<<<<<<<<<<<<<<<<
     public static void card3()
     {
	  	ActionListener AL = new Checkbook() ;
      JLabel header = new JLabel("Load Transactions From a File");
      header.setFont(new Font("Arial", Font.PLAIN, 20));
      header.setHorizontalAlignment(JLabel.CENTER);
      card3.add(header,BorderLayout.NORTH);
      JPanel middle = new JPanel(new FlowLayout());
      JLabel account2 = new JLabel("Account Name");
      JTextField acc2 = new JTextField();
      acc2.setColumns(10); //set text field size
      middle.add(account2);
      middle.add(acc2);
      card3.add(middle);
      JPanel buttons = new JPanel(new FlowLayout());
      JButton Load = new JButton("load");
      buttons.add(Load);
		Load.addActionListener(AL);
      JButton cancel = new JButton("cancel");
      buttons.add(cancel);
		cancel.addActionListener(AL);
      card3.add(buttons, BorderLayout.SOUTH);
	   }
//>>>>>>>>>>>>>>>>>>card 4<<<<<<<<<<<<<<<<<<<<<<<<<<<< 
      public static void card4()
      {
        ActionListener AL = new Checkbook();
        JPanel panel = new JPanel();
        panel.setBounds(61, 11, 81, 140);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel flow1 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
           JLabel date = new JLabel("date");
           flow1.add(date);
           JTextField dateField = new JTextField();
           dateField.setColumns(30);
           flow1.add(dateField);
           panel.add(flow1);
        JPanel flow2 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
           JLabel  trans = new JLabel("Trans. Type");
           flow2.add(trans);
           JTextField  transField = new JTextField();
           transField.setColumns(30);
           flow2.add(transField);
           panel.add(flow2);
        JPanel flow3 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
           JLabel check = new JLabel("Check No.");
           flow3.add(check);
           JTextField  checkField = new JTextField();
           checkField.setColumns(30);
           flow3.add(checkField);
           panel.add(flow3);
        JPanel flow4 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
           JLabel des = new JLabel("Trans. Description");
           flow4.add(des);
           JTextField  desField= new JTextField();
           desField.setColumns(30);
           flow4.add(desField);
           panel.add(flow4);
        JPanel flow5 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
           JLabel sub = new JLabel("Payment/Debit(-)");
           flow5.add(sub);
           JTextField  subField= new JTextField();
           subField.setColumns(30);
           flow5.add(subField);
           panel.add(flow5);
        JPanel flow6 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
           JLabel add = new JLabel("Payment/Debit(-)");
           flow6.add(add);
           JTextField  addField = new JTextField();
           addField.setColumns(30);
           flow6.add(addField);
           panel.add(flow6);
        JPanel buttonPanel = new JPanel(new FlowLayout());
           JButton save = new JButton("Save New Transaction");
           buttonPanel.add(save);
           JButton cancel = new JButton("cancel");
           buttonPanel.add(cancel);
           cancel.addActionListener(AL);
           panel.add(buttonPanel);
        card4.add(panel);
      }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>card5<<<<<<<<<<<<<<<<<<<<<<<<<<<
      public static void card5()
      {
         ActionListener AL = new Checkbook();
         JLabel header = new JLabel("Search Transactions by Transaction Date/Type/Check No./Description");
         card5.add(header, BorderLayout.NORTH);
         header.setHorizontalAlignment(JLabel.CENTER);
         /*String[] columnNames = {"Date","Trans Type","Check No.","Trans Description","Payment/Debit(-)","Payment/Debit(+)","Balance"};
         Object[][] data = {{"", "", "","","","",""}};
         JTable table = new JTable(data , columnNames);
         card5.add(table, BorderLayout.CENTER);*/
         JButton cancel = new JButton("cancel");
           //buttonPanel.add(cancel);
           cancel.addActionListener(AL);
      }
      
      public static void card6()
      {
         ActionListener AL = new Checkbook();
         JLabel header = new JLabel("Sort Transactions");
         header.setFont(new Font("Arial", Font.PLAIN, 20));
         header.setHorizontalAlignment(JLabel.CENTER);
         JButton cancel = new JButton("cancel");
         cancel.addActionListener(AL);
         card6.add(cancel);
      }
      
      public static void card7()
      {
         JLabel header = new JLabel("Sort Transactions");
         header.setFont(new Font("Arial", Font.PLAIN, 20));
         header.setHorizontalAlignment(JLabel.CENTER);
         card7.add(header,BorderLayout.NORTH);

      }
      
      public static void card8()
      {
      
      }
   
   public void actionPerformed(ActionEvent e) 
   {
			String action = e.getActionCommand();

			switch(action)
			{
				case "Exit" : frm.dispose(); break;
				case "Create a New Account" : cards.show(cardPanel, "account"); break;
				case "cancel" : cards.show(cardPanel, "Main"); break;
				case "Load Trans from a File" : cards.show(cardPanel, "Load"); break;
            case "Add New Transactions" : cards.show(cardPanel, "add new"); break;
            case "Search Transactions" : cards.show(cardPanel, "search"); break;
            case "Sort Transactions" : cards.show(cardPanel, "Sort"); break;
            case "View/Delete Transactions" : cards.show(cardPanel, "view"); break;
            case "Backup Transactions" : cards.show(cardPanel, "backup");break;
            default :cards.show(cardPanel, "Main"); break;
			}
   }
}
