
package com.mycompany.digital_clock;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Window extends JFrame{
    private JLabel heading;
    private JLabel clockLabel,clockLabel2;
    private Font font = new Font("Times new Roman",Font.BOLD,70); 
    Window ()
    {
        super.setTitle(" Digital Clock");
        super.setSize(1000,700);
        super.setLocation(300,50);
        this.createGui();
        this.startClock();
        super.setVisible(true);
    }
    
    public void createGui()
    {
        heading = new JLabel("             Digital Clock");
        clockLabel = new JLabel("Clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }
    public void startClock()
    {
            Timer time;
        time = new Timer(1000,new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String dateTime = new Date().toLocaleString();
                clockLabel.setText(dateTime);
                Date d= new Date();
                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : :ss :aa ");
                dateTime = sfd.format(d);
                clockLabel.setText("          " + dateTime); 
//                
//                String dateTime2 = new Date().toLocaleString();
//                clockLabel2.setText(dateTime2);
//                Date d2 = new Date();
//                SimpleDateFormat sfd2 = new SimpleDateFormat("ee , mm ");
//                dateTime2 = sfd2.format(d2);
//                clockLabel.setText(dateTime2);
            }  
        }
        );
            time.start();
}
    }
    

 