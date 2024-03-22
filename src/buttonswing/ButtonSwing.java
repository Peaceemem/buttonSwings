/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buttonswing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author PEACE
 */
public class ButtonSwing implements ActionListener{

    JLabel myLabel;
    public ButtonSwing(){

        //CREATE A JFRAME
        JFrame jFrame = new JFrame("Button");

        //specify flowlayout for the layout manager
        jFrame.setLayout(new FlowLayout());

        //Give the size to our frame
        jFrame.setSize(100, 60);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));


        //Make a button
        JButton UpButton = new JButton("Up");
        JButton DownButton = new JButton("Down");

        myLabel = new JLabel("Press Button");

        //Add action listeners
        UpButton.addActionListener(this);
        //UpButton.setBackground(Color.gray);
        DownButton.addActionListener(this);
        //DownButton.setBackground(Color.gray);

//        UpButton.addActionListener(new ActionListener() {
//            //it has override because is an abstract method
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello Up Clicked");
//            }
//        });
//
//        DownButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("this is really happening");
//            }
//        });


        jFrame.add(UpButton);
        jFrame.add(DownButton);
        jFrame.add(myLabel);

        //jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        //jFrame.getContentPane().setBackground(Color.magenta);

        jFrame.setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Up")){
            myLabel.setText("You Pressed Up");
            //System.out.println("this is working");
        }else {
            myLabel.setText("You Pressed Down");
           // System.out.println("it is still Working");
        }
//        if(e.getActionCommand().equals("Down")){
//            System.out.println("m doing very well");
//        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonSwing();
            }
        });  
}
}

