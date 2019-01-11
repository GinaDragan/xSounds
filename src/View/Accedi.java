package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

import Controller.ListenerAccedi;

@SuppressWarnings("serial")
public class Accedi extends JPanel {

    private JTextField usernameField;
    private JPasswordField passwordField;
     
    private ListenerAccedi listener;
        
    public Accedi(){
        super();
        
        listener = new ListenerAccedi(this, new Registrati());
        
        this.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 10, 10);
        this.add(panel);
        panel.setLayout(new GridLayout(0, 2, 0, 0));
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(39, 121, 71, 16);
        this.add(lblUsername);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(39, 149, 61, 16);
        this.add(lblPassword);
        
        usernameField = new JTextField();
        usernameField.setBounds(109, 116, 230, 26);
        this.add(usernameField);
        usernameField.setColumns(10);
        
        JButton btnAccedi = new JButton("Accedi");
        btnAccedi.setBounds(104, 182, 117, 29);
        this.add(btnAccedi);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(109, 144, 230, 26);
        this.add(passwordField);
        
        JLabel lblNonSeiAncora = new JLabel("Non sei ancora registrato? ");
        lblNonSeiAncora.setBounds(39, 223, 168, 16);
        this.add(lblNonSeiAncora);
        
        JButton btnRegistrati = new JButton("Registrati");
        btnRegistrati.setBounds(222, 218, 117, 29);
        this.add(btnRegistrati);

        JSeparator separator = new JSeparator();
        separator.setBounds(39, 73, 300, 12);
        this.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(39, 500, 500, 12);
        this.add(separator_1);
        
        JLabel lblNewLabel = new JLabel("Credits : XSounds.srl  Via Leonardo da Vinci, 1 20090 Trezzano S/N (Mi) – Italia Capitale Sociale Euro 74.303.795,00 Int. Vers. Partita IVA 13378520152 R.I. e Cod. Fisc.: 02517580920/2001 Milano Iscritta al Registro AEE al numero IT0802000000281");
        lblNewLabel.setBounds(40, 507, 700, 16);
        lblNewLabel.setFont(new Font(null, Font.PLAIN, 10));
        this.add(lblNewLabel);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(39, 286, 300, 12);
        this.add(separator_2);
        
        JLabel lblInserisciITuoi = new JLabel("Inserisci i dati di accesso");
        lblInserisciITuoi.setBounds(39, 45, 168, 16);
        this.add(lblInserisciITuoi);
        
        

        
        
        
        // La X a destra
        ImageIcon icon = PRGFrame.createImageIcon("img/x.png");
        JLabel thumb = new JLabel();
        thumb.setIcon(icon);
        thumb.setBounds(300, 0, 500, 500);
        this.add(thumb);
        
        
        
        
        
        JLabel lblContattaci = new JLabel("<html>Seguici.<br>Siamo anche su:");
        lblContattaci.setBounds(39, 329, 102, 29);
        this.add(lblContattaci);
    
        // Icona facebook
        ImageIcon iconfb = PRGFrame.createImageIcon("img/facebook.png");
        Image image = iconfb.getImage(); // transform it 
        Image newimg = image.getScaledInstance(90, 35,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        iconfb = new ImageIcon(newimg);  // transform it back
        JLabel fblbl = new JLabel();
        fblbl.setIcon(iconfb);
        fblbl.setBounds(153, 329, 102, 49);
        this.add(fblbl);
        
        JLabel lblNewLabel_3 = new JLabel("instagram");
        lblNewLabel_3.setBounds(156, 375, 61, 16);
        this.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Twitter");
        lblNewLabel_4.setBounds(156, 401, 61, 16);
        this.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Linkedin");
        lblNewLabel_5.setBounds(156, 429, 61, 16);
        this.add(lblNewLabel_5);
        
        JButton btnEsci = new JButton("Esci");
        btnEsci.setBounds(222, 182, 117, 29);
        this.add(btnEsci);
        
        /// ACTION LISTNERS ///
        btnAccedi.addActionListener(listener);
        btnRegistrati.addActionListener(listener);
        btnEsci.addActionListener(listener);
        //button.addActionListener(listener);
        
        
    }    
    public String getUserFromTextField() {
        return this.usernameField.getText();
    }
    
    @SuppressWarnings("deprecation")
    public String getPasswordFromTextField() {
        return passwordField.getText();
    }
    public void setUserTextField(String s) {
        this.usernameField.setText(s);
    }
    public void setPasswordTextField(String s) {
        this.passwordField.setText(s);
    }
}

    
