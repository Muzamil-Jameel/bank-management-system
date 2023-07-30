package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    SignupOne() {
        //frame
        setLayout(null);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
       
        //for random application no.
        Random ran = new Random();
         random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        //title
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        //subtitle
         JLabel personalDetails = new JLabel("PAGE 1: Personal Details ");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140 , 100, 30);
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
         JLabel fname = new JLabel("Fathers Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190, 200, 30);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
         JLabel dob = new JLabel("Date Of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240 , 200, 30);
        add(dob);
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
         JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290 , 200, 30);
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.white);
        add(male);
        
         female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340 , 200, 30);
        add(email);
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Maritial Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390 , 200, 30);
        add(marital);
        
         married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
         other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup martialgroup = new ButtonGroup();
        martialgroup.add(married);
        martialgroup.add(unmarried);
        martialgroup.add(other);
        
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440 , 200, 30);
        add(address);
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490 , 200, 30);
        add(city);
        
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540 , 200, 30);
        add(state);
        
         stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590 , 200, 30);
        add(pincode);
        
         pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        
         next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);

    }
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; //long (typecasting)
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();//typecasted to JTextField
        String gender = null;
        if(male.isSelected()){
        gender = "Male";
        }else if (female.isSelected()){
        gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
        marital = "Married";
        }else if(unmarried.isSelected()){
        marital = "Unmarried";
        } else if(other.isSelected()){
        marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        
        try{
        if(name.equals("")){
           JOptionPane.showMessageDialog(null,"Name is Required");
        }
        if(fname.equals("")){
           JOptionPane.showMessageDialog(null," Father Name is Required");
        }
        if(email.equals("")){
           JOptionPane.showMessageDialog(null,"Email is Required");
        }
        if(address.equals("")){
           JOptionPane.showMessageDialog(null,"Address is Required");
        }
        if(city.equals("")){
           JOptionPane.showMessageDialog(null,"City is Required");
        }
        if(state.equals("")){
           JOptionPane.showMessageDialog(null,"State is Required");
        }
        if(pin.equals("")){
           JOptionPane.showMessageDialog(null,"Pincode is Required");
        }
        else {
            Conn c = new Conn();
            String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
        c.s.executeUpdate(query);
        
        setVisible(false);
        new SignupTwo(formno).setVisible(true);
        }
        }
        catch (Exception e){
        System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupOne();
    }
}