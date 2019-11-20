package loginapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginFrame extends JFrame implements ActionListener{
Container container = getContentPane();
JLabel userLabel = new JLabel("username");
JLabel passwordLabel = new JLabel("password");
JTextField userTextField = new JTextField();
JTextField passwordField = new JPasswordField();
JButton resetButton = new JButton("reset");
JButton loginButton = new JButton("login");
JCheckBox showPassword = new JCheckBox("Show password");

    LoginFrame(){
   setLayoutManager();
   setLocationAndSize();
   addComponentsToContainer();
   addActionEvent();
}
public void setLayoutManager()
{
    container.setLayout(null);
}
public void setLocationAndSize()
{
    userLabel.setBounds(50,150,100,30);
    passwordLabel.setBounds(50,220,100,30);
    userTextField.setBounds(150,150,150,30);
    passwordField.setBounds(150,220,150,30);
    showPassword.setBounds(150,250,150,30);
    loginButton.setBounds(50,300,100,30);
    resetButton.setBounds(200,300,100,30);
   
   
}
public void addActionEvent()
{
    loginButton.addActionListener(this);
    resetButton.addActionListener(this);
    showPassword.addActionListener(this);
}
public void addComponentsToContainer(){
    container.add(userLabel);
    container.add(passwordLabel);
    container.add(userTextField);
    container.add(passwordField);
    container.add(showPassword);
    container.add(loginButton);
    container.add(resetButton);
}
@Override
public void actionPerformed(ActionEvent e){
    if (e.getSource() == loginButton){
        String userText;
        String pwdText;
        userText = userTextField.getText();
        pwdText = passwordField.getText();
        if(userText.equalsIgnoreCase("lyma") && pwdText.equalsIgnoreCase("123")){
        JOptionPane.showMessageDialog(this, "Login Successful");
        }
        else
        {        
            JOptionPane.showMessageDialog(this, "Invalid username or password");

           
        }
    }
    if (e.getSource() == resetButton)
    {
        userTextField.setText("");
        passwordField.setText("");
    }
}
}
