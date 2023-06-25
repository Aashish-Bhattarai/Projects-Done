//importing the swing, awt and util elements
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of class TransportGUI here.
 *
 * @author (Aashish Bhattarai)
 * @version (a version number or a date)
 */
public class TransportGUI implements ActionListener
{
    //creating Vehicle class arraylist
    ArrayList<Vehicle> gui = new ArrayList<Vehicle>();

    /* adding JFrame name,
      JLabel name, 
      JTextField name, and 
      JPanel name  */
    private JFrame frame;
    private JPanel p1,p2,p3,p4,p5,p6,p7;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,l01,l02,l03,l04,l05,L01,L02,L03,L04,L05,L06,L07,L001,L002,L003;
    private JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,F1,F2,F3,F4,F5,F6,F7,f01,f02,f03,F01,F02,F03,F04,F05,F06,F001,F002;
    private JRadioButton r1,r2,R1,R2,R3,R4;
    private JButton b1,b2,b3,b4,b5,B1,B2,B3,B4,B5,B6,b01,b02,B01,B02,B001,B002;
    private JComboBox<String> c1,c2,c3;

    // creating a constructor to add items in GUI 
    public TransportGUI(){
        frame = new JFrame("Transport GUI");

        //creating panels to be used in the frame
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();

        //creating the  JLabels and JTextFields for the 1st panel p1 for autorickshaw in the frame
        l1 = new JLabel("AutoRickshaw");
        l2 = new JLabel("Vehicle ID :");
        l3 = new JLabel("Vehicle Name :");
        l4 = new JLabel("Vehicle Weight :");
        l5 = new JLabel("Vehicle Color :");
        l6 = new JLabel("Vehicle Speed :");
        l7 = new JLabel("Engine Displacement :");
        l8 = new JLabel("Torque :");
        l9 = new JLabel("Ground Clearance :");
        l10 = new JLabel("Range :");
        l11 = new JLabel("Fuel tank capacity :");
        l12 = new JLabel("Price :");
        l13= new JLabel("Brand :");
        l14= new JLabel("Mileage :");
        l15= new JLabel("Is Booked :");

        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        f4 = new JTextField();
        f5 = new JTextField();
        f6 = new JTextField();
        f7 = new JTextField();
        f8 = new JTextField();
        f9 = new JTextField();
        f10 = new JTextField();
        f11 = new JTextField();
        f12 = new JTextField();
        f13 = new JTextField();

        //creating the JLabels and JTextFields for the book panel p4 in frame
        l01 = new JLabel("Book AutoRickshaw");
        l02 = new JLabel("Vehicle ID :");
        l03 = new JLabel("No. of Seats :");
        l04 = new JLabel("Charge Amount :");
        l05 = new JLabel("Booked Date :");

        f01 = new JTextField();
        f02 = new JTextField();
        f03 = new JTextField();

        //setting the font and size of JLabels for 1st panel p1 of autorickshaw 
        l1.setFont(new Font("Arial", Font.BOLD, 25));
        l2.setFont(new Font("Arial", Font.PLAIN, 15));
        l3.setFont(new Font("Arial", Font.PLAIN, 15));
        l4.setFont(new Font("Arial", Font.PLAIN, 15));
        l5.setFont(new Font("Arial", Font.PLAIN, 15));
        l6.setFont(new Font("Arial", Font.PLAIN, 15));
        l7.setFont(new Font("Arial", Font.PLAIN, 15));
        l8.setFont(new Font("Arial", Font.PLAIN, 15));
        l9.setFont(new Font("Arial", Font.PLAIN, 15));
        l10.setFont(new Font("Arial", Font.PLAIN, 15));
        l11.setFont(new Font("Arial", Font.PLAIN, 15));
        l12.setFont(new Font("Arial", Font.PLAIN, 15));
        l13.setFont(new Font("Arial", Font.PLAIN, 15));
        l14.setFont(new Font("Arial", Font.PLAIN, 15));
        l15.setFont(new Font("Arial", Font.PLAIN, 15));

        //setting the font and size of JLabels for book panel p4 of autorickshaw 
        l01.setFont(new Font("Arial", Font.BOLD, 20));
        l02.setFont(new Font("Arial", Font.PLAIN, 15));
        l03.setFont(new Font("Arial", Font.PLAIN, 15));
        l04.setFont(new Font("Arial", Font.PLAIN, 15));
        l05.setFont(new Font("Arial", Font.PLAIN, 15));

        //array for JComboBox used in 1st autorickshaw panel
        String[] M = {"MONTH","January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November","December"};
        String[] D = {"DAY","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] Y = {"YEAR","1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};

        //creating the JComboBox to be used in 1st panel p1 of autorickshaw
        c1 = new JComboBox<String>(M);
        c2 = new JComboBox<String>(D);
        c3 = new JComboBox<String>(Y);

        //creating the JButtons to be used in 1st panel p1 of autorickshaw
        b1 = new JButton("ADD");
        b2 = new JButton("Book-AutoRickshaw");
        b3 = new JButton("Display");
        b4 = new JButton("Clear");
        b5 = new JButton("Go to Electric-Scooter");

        //creating the JButtons to be used in book panel p4 of autorickshaw 
        b01 = new JButton("Go Back");
        b02 = new JButton("Book");

        //creating the radio buttons to be used in 1st panel p1 of autorickshaw 
        r1 = new JRadioButton("True");
        r2 = new JRadioButton("False");

        //selecting the r2 radiobutton 
        r2.setSelected(true);

        //adding action listener for JRadioButtons and JButtons for implementing certain actions while adding, booking or purchasing autorickshaw in gui 
        r1.addActionListener(this);
        r2.addActionListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        b01.addActionListener(this);
        b02.addActionListener(this);

        //setting the place of each elements including JLabels, JTextFields, JRadioButtons and JComboBoxs in the autorickshaw panel p1 and book panel p4 in gui
        l1.setBounds(680,60,200,40);
        l2.setBounds(100,150,150,40);
        l3.setBounds(100,200,150,40);
        l4.setBounds(100,250,150,40);
        l5.setBounds(100,300,150,40);
        l6.setBounds(100,350,150,40);
        l7.setBounds(100,400,160,40);
        l8.setBounds(100,450,150,40);
        l9.setBounds(100,500,150,40);
        l10.setBounds(100,550,150,40);
        l11.setBounds(950,150,150,40);
        l12.setBounds(100,600,150,40);
        l13.setBounds(950,200,150,40);
        l14.setBounds(950,250,150,40);
        l15.setBounds(950,300,150,40);

        l01.setBounds(160,50,200,40);
        l02.setBounds(30,150,100,40);
        l03.setBounds(30,200,100,40);
        l04.setBounds(30,250,150,40);
        l05.setBounds(30,300,100,40);

        c1.setBounds(200,300,75,40);
        c2.setBounds(280,300,50,40);
        c3.setBounds(335,300,70,40);

        r1.setBounds(1200,300,75,35);
        r2.setBounds(1280,300,75,35);

        f1.setBounds(350,150,200,40);
        f2.setBounds(350,200,200,40);
        f3.setBounds(350,250,200,40);
        f4.setBounds(350,300,200,40);
        f5.setBounds(350,350,200,40);
        f6.setBounds(350,400,200,40);
        f7.setBounds(350,450,200,40);
        f8.setBounds(350,500,200,40);
        f9.setBounds(350,550,200,40);
        f10.setBounds(350,600,200,40);
        f11.setBounds(1200,150,200,40);
        f12.setBounds(1200,200,200,40);
        f13.setBounds(1200,250,200,40);

        f01.setBounds(200,150,200,40);
        f02.setBounds(200,200,200,40);
        f03.setBounds(200,250,200,40);

        b1.setBounds(100,680,100,30);
        b2.setBounds(1250,400,150,35);
        b3.setBounds(630,650,125,35);
        b4.setBounds(775,650,125,35);
        b5.setBounds(1250,750,200,35);

        b01.setBounds(100,400,100,40);
        b02.setBounds(300,400,100,40);

        //setting the size and bounds of panels p1,p2,p3,p4
        
        p1.setSize(1920, 1080);
        p2.setSize(1920,1080);
        p3.setBounds(40,125,1455,600);
        p4.setBounds(550,120,500,500);

        //setting the colour and layout of p3 panel
        p3.setBackground(Color.PINK);
        p3.setLayout(null);

        //setting the colour,Visibility and layout of p4 panel
        p4.setVisible(false);
        p4.setBackground(Color.PINK);
        p4.setLayout(null);

        //adding every elements in their respective panels
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(l10);
        p1.add(l11);
        p1.add(l12);
        p1.add(l13);
        p1.add(l14);
        p1.add(l15);

        p1.add(f1);
        p1.add(f2);
        p1.add(f3);
        p1.add(f4);
        p1.add(f5);
        p1.add(f6);
        p1.add(f7);
        p1.add(f8); 
        p1.add(f9);
        p1.add(f10);
        p1.add(f11);
        p1.add(f12);
        p1.add(f13); 

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);

        p1.add(r1);
        p1.add(r2);

        p4.add(l01);
        p4.add(l02);
        p4.add(l03);
        p4.add(l04);
        p4.add(l05);

        p4.add(f01);
        p4.add(f02);
        p4.add(f03);

        p4.add(c1);
        p4.add(c2);
        p4.add(c3);

        p4.add(b01);
        p4.add(b02);

        //adding panel3 in panel1
        p1.add(p3);

        //aading the panels in the frame
        frame.add(p1);
        frame.add(p4); 
        
        //creating the  JLabels and JTextFields for the panel p2 for electric scooter in the frame
        L1 = new JLabel("ElectricScooter");
        L2 = new JLabel("Vehicle ID :");
        L3 = new JLabel("Vehicle Name :");
        L4 = new JLabel("Vehicle Weight :");
        L5 = new JLabel("Vehicle Color :");
        L6 = new JLabel("Vehicle Speed :");
        L7 = new JLabel("Ground Clearance :");
        L8 = new JLabel("Battery Capacity :");
        L9 = new JLabel("Has Purchased :");
        L10 = new JLabel("Has Sold :");
        
        F1 = new JTextField();
        F2 = new JTextField();
        F3 = new JTextField();
        F4 = new JTextField();
        F5 = new JTextField();
        F6 = new JTextField();
        F7 = new JTextField();
        
        //creating the JLabels and JTextFields for the purchase p6 panel in frame
        L01 = new JLabel("Purchase");
        L02 = new JLabel("Vehicle ID :");
        L03 = new JLabel("Brand :");
        L04 = new JLabel("Price :");
        L05 = new JLabel("Charging Time :");
        L06 = new JLabel("Mileage :");
        L07 = new JLabel("Range :");
        
        F01 = new JTextField();
        F02 = new JTextField();
        F03 = new JTextField();
        F04 = new JTextField();
        F05 = new JTextField();
        F06 = new JTextField();
        
        //creating the JLabels and JTextFields for the sell panel p7 
        L001 = new JLabel("Sell");
        L002 = new JLabel("Vehicle ID :");
        L003 = new JLabel("Price :");
        
        F001 = new JTextField();
        F002 = new JTextField();
        
        //setting the font and size of JLabels for 2nd panel p2 of autorickshaw 
        L1.setFont(new Font("Arial", Font.BOLD, 25));
        L2.setFont(new Font("Arial", Font.PLAIN, 15));
        L3.setFont(new Font("Arial", Font.PLAIN, 15));
        L4.setFont(new Font("Arial", Font.PLAIN, 15));
        L5.setFont(new Font("Arial", Font.PLAIN, 15));
        L6.setFont(new Font("Arial", Font.PLAIN, 15));
        L7.setFont(new Font("Arial", Font.PLAIN, 15));
        L8.setFont(new Font("Arial", Font.PLAIN, 15));
        L9.setFont(new Font("Arial", Font.PLAIN, 15));
        L10.setFont(new Font("Arial", Font.PLAIN, 15));
        
        
        //setting the font and size of JLabels for purchase panel p6 of electric scooter
        L01.setFont(new Font("Arial", Font.BOLD, 20));
        L02.setFont(new Font("Arial", Font.PLAIN, 15));
        L03.setFont(new Font("Arial", Font.PLAIN, 15));
        L04.setFont(new Font("Arial", Font.PLAIN, 15));
        L05.setFont(new Font("Arial", Font.PLAIN, 15));
        L06.setFont(new Font("Arial", Font.PLAIN, 15));
        L07.setFont(new Font("Arial", Font.PLAIN, 15));

        //setting the font and size of JLabel in p7 panel
        L001.setFont(new Font("Arial", Font.BOLD, 20));

        
        //creating radio buttons to be used in the electricscooter panel p2
        R1 = new JRadioButton("True");
        R2 = new JRadioButton("False");
        R3 = new JRadioButton("True");
        R4 = new JRadioButton("False");
        
        //selecting the radiobuttons R2 and R4 in the panel p2
        R2.setSelected(true);
        R4.setSelected(true);
        
        //creating the JButtons to be used in the panel p2
        B1 = new JButton("Purchase");
        B2 = new JButton("Sell");
        B3 = new JButton("Display");
        B4 = new JButton("Clear");
        B5 = new JButton("Go to AutoRickshaw");
        B6 = new JButton("ADD");
        
        //creating the JButtons to be used in the purchase panel p6
        B01 = new JButton("Go Back");
        B02 = new JButton("Purchase-Scooter");
        
        //creating the JButtons to be used in the sell panel p7
        B001 = new JButton("Back");
        B002 = new JButton("Sell");
        
        //adding action listener for JRadioButtons and JButtons for implementing certain actions while adding, purchasing or selling electricscooter in gui  
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);
        B6.addActionListener(this);
        
        B01.addActionListener(this);
        B02.addActionListener(this);

        B001.addActionListener(this);
        B002.addActionListener(this);

        R1.addActionListener(this);
        R2.addActionListener(this);
        R3.addActionListener(this);
        R4.addActionListener(this);

        //setting the place of each elements including JLabels, JTextFields, JRadioButtons and JComboBoxs in the electricscooter panel p2 , purchase panel p6 and sell panel p7 in gui
        L1.setBounds(685,60,200,40);
        L2.setBounds(100,150,100,40);
        L3.setBounds(100,200,150,40);
        L4.setBounds(100,250,150,40);
        L5.setBounds(100,300,100,40);
        L6.setBounds(100,350,120,40);
        L7.setBounds(100,400,160,40);
        L8.setBounds(100,450,150,40);
        L9.setBounds(1050,150,120,40);
        L10.setBounds(1050,200,150,40);

        L01.setBounds(210,50,150,40);
        L02.setBounds(50,150,150,40);
        L03.setBounds(50,200,150,40);
        L04.setBounds(50,250,150,40);
        L05.setBounds(50,300,150,40);
        L06.setBounds(50,350,150,40);
        L07.setBounds(50,400,150,40);

        L001.setBounds(135,20,100,40);
        L002.setBounds(50,70,100,40);
        L003.setBounds(50,120,100,40);

        F1.setBounds(350,150,200,40);
        F2.setBounds(350,200,200,40);
        F3.setBounds(350,250,200,40);
        F4.setBounds(350,300,200,40);
        F5.setBounds(350,350,200,40);
        F6.setBounds(350,400,200,40);
        F7.setBounds(350,450,200,40);

        F01.setBounds(210,150,200,40);
        F02.setBounds(210,200,200,40);
        F03.setBounds(210,250,200,40);
        F04.setBounds(210,300,200,40);
        F05.setBounds(210,350,200,40);
        F06.setBounds(210,400,200,40);
        
        F001.setBounds(150,70,130,30);
        F002.setBounds(150,120,130,30);
        

        B1.setBounds(1075,300,150,35);
        B2.setBounds(1250,300,150,35);
        B3.setBounds(630,650,125,35);
        B4.setBounds(775,650,125,35);
        B5.setBounds(1250,750,200,35);
        B6.setBounds(100,550,100,30);
        
        B01.setBounds(50,500,100,40);
        B02.setBounds(300,500,150,40);

        B001.setBounds(50,200,75,30);
        B002.setBounds(180,200,75,30);
        

        R1.setBounds(1200,150,75,40);
        R2.setBounds(1300,150,75,40);
        R3.setBounds(1200,200,75,40);
        R4.setBounds(1300,200,75,40);

        //setting the bounds, background color and layout of p5 panel in frame of gui
        p5.setBounds(40,125,1455,600);
        p5.setBackground(Color.PINK);
        p5.setLayout(null);
        
        //setting the bounds, visibility, background color and layout of p6 panel in frame of gui  
        p6.setBounds(525,50,500,600);
        p6.setVisible(false);
        p6.setBackground(Color.PINK);
        p6.setLayout(null);
        
        //setting the bounds, visibility, background color and layout of p7 panel in frame of gui 
        p7.setBounds(1050,250,300,250);
        p7.setVisible(false);
        p7.setBackground(Color.LIGHT_GRAY);
        p7.setLayout(null);

        //adding every elements in their respective panels
        p2.add(L1);
        p2.add(L2);
        p2.add(L3);
        p2.add(L4);
        p2.add(L5);
        p2.add(L6);
        p2.add(L7);
        p2.add(L8);
        p2.add(L9);
        p2.add(L10);

        p2.add(F1);
        p2.add(F2);
        p2.add(F3);
        p2.add(F4);
        p2.add(F5);
        p2.add(F6);
        p2.add(F7);

        p2.add(B1);
        p2.add(B2);
        p2.add(B3);
        p2.add(B4);
        p2.add(B5);
        p2.add(B6);

        p2.add(R1);
        p2.add(R2);
        p2.add(R3);
        p2.add(R4);

        p2.add(p5);

        p6.add(L01);
        p6.add(L02);
        p6.add(L03);
        p6.add(L04);
        p6.add(L05);
        p6.add(L06);
        p6.add(L07);

        p6.add(F01);
        p6.add(F02);
        p6.add(F03);
        p6.add(F04);
        p6.add(F05);
        p6.add(F06);

        p7.add(L001);
        p7.add(L002);
        p7.add(L003);

        p7.add(F001);
        p7.add(F002);

        p7.add(B001);
        p7.add(B002);

        p5.add(p7);

        p6.add(B01);
        p6.add(B02);
        
        //adding the panels to the frame
        frame.add(p2);
        frame.add(p6);
        
        //setting the layout and visibility of main panels p1 and p2
        p1.setLayout(null);
        p1.setVisible(true);

        p2.setLayout(null);
        p2.setVisible(false);
        
        //setting the size,layout and visibility of the frame
        frame.setSize(1800,1060);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    
    public void actionPerformed( ActionEvent e){ 
        //setting the visibility of panels, buttons and radiobuttons while clicking different buttons in frame
        if (e.getSource() == b5){
            p1.setVisible(false);
            p2.setVisible(true);
        }

        else if(e.getSource() == B5){
            p2.setVisible(false);
            p1.setVisible(true);
        }

        else if (e.getSource() == r1){
            r1.setSelected(true);
            r2.setSelected(false);
        }
        else if(e.getSource() == r2){
            r2.setSelected(true);
            r1.setSelected(false);
        }

        else if (e.getSource()== R1){
            R1.setSelected(true);
            R2.setSelected(false);
        }
        else if(e.getSource()== R2){
            R2.setSelected(true);
            R1.setSelected(false);
        }

        else if (e.getSource()== R3){
            R3.setSelected(true);
            R4.setSelected(false);
        }
        else if(e.getSource()== R4){
            R4.setSelected(true);
            R3.setSelected(false);
        }
        //setting the JTextFields to empty in panel p1 and p2 while clicking clear JButton in respective panels and implementing certain actions in radio button 
        else if (e.getSource() == b4){
            f1.setText("");
            f2.setText("");
            f3.setText("");
            f4.setText("");
            f5.setText("");
            f6.setText("");
            f7.setText("");
            f8.setText("");
            f9.setText("");
            f10.setText("");
            f11.setText("");
            f12.setText("");
            f13.setText("");
            c1.setSelectedIndex(0);
            c2.setSelectedIndex(0);
            c3.setSelectedIndex(0);
            r2.setSelected(true);
            r1.setSelected(false);
        }
        else if (e.getSource() == B4){
            F1.setText("");
            F2.setText("");
            F3.setText("");
            F4.setText("");
            F5.setText("");
            F6.setText("");
            F7.setText("");
            R2.setSelected(true);
            R1.setSelected(false);
            R4.setSelected(true);
            R3.setSelected(false);
        }
        //enabling the certain panels while clicking certain JButtons
        else if (e.getSource() == b2){
            p4.setVisible(true);
            p1.setVisible(false);
        }

        else if (e.getSource() == b01){
            p1.setVisible(true);
            p4.setVisible(false); 
        }
        
        //actionlistener for adding the values in autorickshaw panel p1
        else if (e.getSource() == b1){
            if(f1.getText().equals("") || f2.getText().equals("") || f3.getText().equals("") || f4.getText().equals("") || f5.getText().equals("") || f6.getText().equals("") || f7.getText().equals("") || f8.getText().equals("") ||
               f9.getText().equals("") || f10.getText().equals("") || f11.getText().equals("") || f12.getText().equals("") || f13.getText().equals(""))
               {
                   JOptionPane.showMessageDialog(null   ,"Empty Text Field, Please Enter all the values");
               }
            else{
            try{
                int Vehicle_ID = Integer.parseInt(f1.getText());
                String Vehicle_Name = f2.getText();
                String Vehicle_Weight = f3.getText();
                String Vehicle_Color = f4.getText();
                String Vehicle_Speed = f5.getText();
                int Engine_Displacement = Integer.parseInt(f6.getText());
                String Torque = f7.getText();
                int Fuel_Tank_Capacity = Integer.parseInt(f11.getText());
                String Ground_Clearance = f8.getText();

                AutoRickshaw autorick = new AutoRickshaw(Vehicle_ID, Vehicle_Name, Vehicle_Weight, Vehicle_Color, Vehicle_Speed, Engine_Displacement, Torque, Fuel_Tank_Capacity, Ground_Clearance);

                gui.add(autorick);
                JOptionPane.showMessageDialog(null,"Successfully Added The Details");
            }
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(null,"Invalid...Please Try Again");
            }
            }
            //actionlistener for booking the autorickshaw 
            }
            
            else if (e.getSource() == b02){
            
            try{
                String month = c1.getSelectedItem().toString();
                String day = c2.getSelectedItem().toString();
                String year = c3.getSelectedItem().toString();
                String Booked_Date = month+ "-" + day + "-" + year;

                int Vehicle_ID = Integer.parseInt(f01.getText());
                int No_of_Seats = Integer.parseInt(f02.getText());
                int Charge_Amount = Integer.parseInt(f03.getText());
                
                JOptionPane.showMessageDialog(p4,"Successfully entered The Details");
                for(Vehicle obj : gui){
                    if (obj instanceof AutoRickshaw)
                    {
                        AutoRickshaw obj_auto = (AutoRickshaw) obj;

                        if (obj_auto.getVehicle_ID() == Vehicle_ID)
                        {   
                            JOptionPane.showMessageDialog(p4,"The Autorickshaw is Booked");
                            JOptionPane.showMessageDialog(p4, "You have booked on "+ Booked_Date);
                            JOptionPane.showMessageDialog(p4, "The no. of seats of vehicle is "+ No_of_Seats);
                            JOptionPane.showMessageDialog(p4, "The charge amount is "+ Charge_Amount);
                            r1.setSelected(true);
                            r2.setSelected(false);
                            if (obj_auto.getIsBooked() == true)
                            {
                                JOptionPane.showMessageDialog(p4,"The Vehicle with " + Vehicle_ID + " is already Booked");
                            }
                            else{
                                obj_auto.book(Booked_Date, Charge_Amount, No_of_Seats);
                                 
                            }
                           
                    }  
                    else{
                        JOptionPane.showMessageDialog(p4,"Please, Enter the valid Input");
                        }  
                }
              }
            }catch(NumberFormatException n) 
            {
                JOptionPane.showMessageDialog(p4,"Invalid Input, Please try Again");
            }
        }
       
        //making certain panels visible while clicking certain buttons
        else if(e.getSource() == B1){
            p6.setVisible(true);
            p2.setVisible(false);
        }

        else if(e.getSource() == B01){
            p6.setVisible(false);
            p2.setVisible(true);
        }

        else if(e.getSource()==B2){
            p7.setVisible(true);
        }

        else if(e.getSource() == B001){
            p7.setVisible(false);
        }
        
        //adding the values of textfields in electricscooter panel p2
        else if(e.getSource() == B6){
            if ( F1.getText().equals("") || F2.getText().equals("") || F3.getText().equals("") || F4.getText().equals("") || F5.getText().equals("") || F6.getText().equals("") || F7.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Empty Text Field, Please Enter all the values");
            }
            else{
            try{
                int Vehicle_ID = Integer.parseInt(F1.getText());
                String Vehicle_Name = (F2.getText());
                String Vehicle_Color = (F4.getText());
                String Vehicle_Speed = (F5.getText());
                String Vehicle_Weight = (F3.getText());

                int Battery_Capacity = Integer.parseInt(F7.getText());

                ElectricScooter electric = new ElectricScooter(Vehicle_ID, Vehicle_Name, Vehicle_Weight, Vehicle_Color, Vehicle_Speed, Battery_Capacity);
                gui.add(electric);

                JOptionPane.showMessageDialog(null, "Successfully Added The Values");
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Invalid..Please Try Again");
            }
        }
        
        //actionlistener for purchasing the electricscooter
        } else if (e.getSource() == B02){
            try{
                int Vehicle_ID = Integer.parseInt(F01.getText());
                String Brand = F02.getText();
                int Price = Integer.parseInt(F03.getText());
                String Charging_Time = F04.getText();
                String Mileage = F05.getText();
                int Range = Integer.parseInt(F06.getText());

                JOptionPane.showMessageDialog(p6,"Successfully Entered the Details");
                for(Vehicle obj1 : gui){
                    if (obj1 instanceof ElectricScooter){
                        ElectricScooter scooter = (ElectricScooter) obj1;
                        if (scooter.getVehicle_ID() == Vehicle_ID){
                            JOptionPane.showMessageDialog(p6,"The Scooter is Purchased");
                            JOptionPane.showMessageDialog(p6,"The Brand of Scooter is "+""+ Brand);
                            JOptionPane.showMessageDialog(p6,"The price of Scooter is "+""+ Price);
                            JOptionPane.showMessageDialog(p6,"The Mileage of Scooter is "+""+ Mileage);
                            JOptionPane.showMessageDialog(p6,"The Charging Time of Scooter is "+""+ Charging_Time);
                            JOptionPane.showMessageDialog(p6,"The Range of Scooter is "+""+ Range);
                            R2.setSelected(false);
                            R1.setSelected(true);

                            if (scooter.getHasPurchased() == true){
                                JOptionPane.showMessageDialog(p6,"The Electric Scooter is already Purchased");
                            } 
                            else {
                                scooter.purchase(Brand, Price, Charging_Time, Mileage, Range);
                            }
                        } else{
                            JOptionPane.showMessageDialog(p6, "Please, Enter the valid Input");
                        }
                    }
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(p6,"Invalid Input, Please try Again");
            }
        }
            //actionlistener for selling the electricscooter
         else if(e.getSource() == B002){ 
            try{

                int Vehicle_ID = Integer.parseInt(F001.getText());
                int Price = Integer.parseInt(F002.getText());
                JOptionPane.showMessageDialog(p7,"Successfully Entered The Details");
                for (Vehicle obj2 : gui){
                    if (obj2 instanceof ElectricScooter){
                        ElectricScooter scooter2 = (ElectricScooter) obj2;
                        if (scooter2.getVehicle_ID() == Vehicle_ID){
                            JOptionPane.showMessageDialog(p7,"The Scooter is sold");
                            JOptionPane.showMessageDialog(p7,"The price of Scooter is "+""+Price);
                            R4.setSelected(false);
                            R3.setSelected(true);
                            if(scooter2.getHasSold() == true){
                                JOptionPane.showMessageDialog(p7,"The scooter with "+ Vehicle_ID +" is already Sold.");
                            } else{
                                scooter2.sell(Price);
                            }
                        }else{
                            JOptionPane.showMessageDialog(p7,"Please, Enter the valid vehicle id.");
                        }
                    }
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(p7,"Invalid Input, Please try Again");
            }
        
            //actionlistener for implementing display method of autorickshaw
        } else if(e.getSource() == b3){
            for (Vehicle d1 : gui){
                if (d1 instanceof AutoRickshaw){
                    AutoRickshaw r1 = (AutoRickshaw) d1;
                    r1.display();
                }
            }
            
            //actionlistener for implementing display method of electicscooter
        }else if(e.getSource() == B3){
            for (Vehicle d2 : gui){
                if(d2 instanceof ElectricScooter){
                    ElectricScooter r2 = (ElectricScooter) d2;
                    r2.display();
                }
            }
        }
    }
    
    //creating a main method to make obj of the class
    public static void main(String[] args){
        TransportGUI obj = new TransportGUI();  
    }

}