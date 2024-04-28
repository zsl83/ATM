
/*
 References
swing Doc
فایل کارگاه 2
https://www.javatpoint.com/java-swing
 https://youtu.be/Kmgo00avvEw?si=9iVCwkqxjYi_NHap
https://www.javatpoint.com/java-jbutton
https://www.javatpoint.com/java-jlabel
https://www.javatpoint.com/java-jtextfield
https://www.javatpoint.com/java-gridbaglayout
https://www.sarthaks.com/3500018/how-to-change-the-color-of-a-label-in-java-awt
https://coderanch.com/t/392326/java/TEXTFIELDS-INT
https://www.sarthaks.com/3503147/how-do-i-set-the-font-size-of-a-jlabel-in-java
https://stackoverflow.com/questions/14169240/getting-integer-values-from-textfield
https://mahmouddehghanpour.com/%D9%86%D9%85%D8%A7%DB%8C%D8%B4-%D8%AA%D8%B5%D9%88%DB%8C%D8%B1-%D8%A8%D8%A7-%D8%A7%D8%B3%D8%AA%D9%81%D8%A7%D8%AF%D9%87-%D8%A7%D8%B2-%DA%A9%D9%84%D8%A7%D8%B3-jlabel-%D8%AF%D8%B1-%D8%AC%D8%A7%D9%88%D8%A7/
https://javapro.ir/%D8%AC%D9%84%D8%B3%D9%87-%D8%A8%DB%8C%D8%B3%D8%AA-%D9%88-%D8%B4%D8%B4%D9%85-%D9%86%D9%85%D8%A7%DB%8C%D8%B4-%D8%AA%D8%B5%D9%88%DB%8C%D8%B1-%D8%AF%D8%B1-Swing-
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("ATM");

        // font
        Font font = new Font("Calibri", Font.BOLD, 50);
        Font font1 = new Font("Calibri", Font.BOLD, 35);

       // logo Icon
        ImageIcon image = new ImageIcon("ATM2.png");
        frame.setIconImage(image.getImage());

        // Language selection page
        JPanel firstPage = new JPanel();
        firstPage.setBackground(new Color(70,50,90));
        firstPage.setBounds(0, 0,1200,800);
        firstPage.setLayout(null);

        //Enter password page
        JPanel secondPage = new JPanel();
        secondPage.setBackground(new Color(70,50,90));
        secondPage.setBounds(0, 0,1200,800);
        secondPage.setLayout(null);

        // Main Page
        JPanel thirdPage = new JPanel();
        thirdPage.setBackground(new Color(70,50,90));
        thirdPage.setBounds(0, 0,1200,800);
        thirdPage.setLayout(null);

        // get cash page
        JPanel fourthPage = new JPanel();
        fourthPage.setBackground(new Color(70,50,90));
        fourthPage.setBounds(0, 0,1200,800);
        fourthPage.setLayout(null);

        // Operation success page
        JPanel fifthPage = new JPanel();
        fifthPage.setBackground(new Color(70,50,90));
        fifthPage.setBounds(0, 0,1200,800);
        fifthPage.setLayout(null);

        // card by card page
        JPanel sixPage = new JPanel();
        sixPage.setBackground(new Color(70,50,90));
        sixPage.setBounds(0, 0,1200,800);
        sixPage.setLayout(null);

        // change password page
        JPanel seventhPage = new JPanel();
        seventhPage.setBackground(new Color(70,50,90));
        seventhPage.setBounds(0, 0,1200,800);
        seventhPage.setLayout(null);

        // inventory page
        JPanel eigthPage = new JPanel();
        eigthPage.setBackground(new Color(70,50,90));
        eigthPage.setBounds(0, 0,1200,800);
        eigthPage.setLayout(null);

        // Design first page

        // Design Farsi button
        JButton language1 =new JButton(" فارسی " );
        language1.setFont(font);
        language1.setFocusable(false);
        language1.setBounds(959 , 350 , 250 ,80);
        language1.setBackground(new Color(90,90,130));
        language1.setForeground(Color.WHITE);
        firstPage.add(language1);

        // Design English button
        JButton language2 =new JButton("English " );
        language2.setBounds(0,350,250,80);
        language2.setBackground(new Color(90,90,130));
        language2.setForeground(Color.WHITE);
        language2.setFont(font);
        language2.setFocusable(false);
        firstPage.add(language2);

        // label for select farsi
        JLabel ChooseLanguage1 =new JLabel("زبان خود را انتخاب کنید");
        ChooseLanguage1.setForeground(Color.WHITE);
        ChooseLanguage1.setFont(font1);
        ChooseLanguage1.setFont(font1);
        ChooseLanguage1.setBounds(650 ,350,400,100);
        firstPage.add(ChooseLanguage1);

        // label for select english
        JLabel ChooseLanguage2 =new JLabel("Choose Language");
        ChooseLanguage2.setForeground(Color.WHITE);
        ChooseLanguage2.setFont(font1);
        ChooseLanguage2.setBounds(270 ,350,400,100);
        firstPage.add(ChooseLanguage2);


        // click on english button
        language2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondPage.setBounds(firstPage.getBounds());
                frame.remove(firstPage);
                frame.add(secondPage);
                frame.revalidate();
                frame.repaint();
            }
        });


      // click on farsi button
       language1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               secondPage.setBounds(firstPage.getBounds());
               frame.remove(firstPage);
               frame.add(secondPage);
               frame.revalidate();
               frame.repaint();
           }
       });

       // Design secondPage

        // Design textfield of password
       JTextField textField = new JTextField();
       textField.setFont(font);
       textField.setBounds(400,280,350,75);
       secondPage.add(textField);
        secondPage.add(textField);

        // Design label of enter password
        JLabel password = new JLabel("رمز خود را وارد کنید");
        password.setFont(font);
        password.setForeground(Color.WHITE);
        password.setBounds(400,130 ,400 ,60);
        secondPage.add(password);

        // Design record button
       JButton Record = new JButton("ثبت");
        Record.setForeground(Color.WHITE);
        Record.setBackground(new Color(90,90,130));
        Record.setFont(font);
        Record.setBounds(430,600 ,300 ,80);
        Record.setFocusable(false);
        secondPage.add(Record);

        // Design back button
        JButton back =new JButton("برگشت");
        back.setForeground(Color.WHITE);
        back.setBounds(50 ,600 , 250,80);
        back.setFont(font);
        back.setFocusable(false);
        back.setBackground(new Color(130,95,130));
        secondPage.add(back);


        // click on back button
       back.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               firstPage.setBounds(secondPage.getBounds());
               frame.remove(secondPage);
               frame.add(firstPage);
               frame.revalidate();
               frame.repaint();
           }
       });

       // click on record button
       Record.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               thirdPage.setBounds(secondPage.getBounds());
               frame.remove(secondPage);
               frame.add(thirdPage);
               frame.revalidate();
               frame.repaint();
           }
       });

       // Design third page (main page)

        // Design get cash button
       JButton getCash  = new JButton("برداشت وجه ");
        getCash.setFont(font);
        getCash.setBackground(new Color(90 ,90,130));
        getCash.setFocusable(false);
        getCash.setForeground(Color.WHITE);
        getCash.setBounds(0,150,300,80);
        thirdPage.add(getCash);

        // Design card by card button
        JButton cardByCard  = new JButton("کارت به کارت  ");
        cardByCard.setFont(font);
        cardByCard.setBackground(new Color(90 ,90,130));
        cardByCard.setFocusable(false);
        cardByCard.setForeground(Color.WHITE);
        cardByCard.setBounds(0,400 , 300 ,80);
        thirdPage.add(cardByCard);

        // Design inventory button
        JButton  inventory = new JButton("اعلام موجودی  ");
        inventory.setFont(font);
        inventory.setBackground(new Color(90 ,90,130));
        inventory.setFocusable(false);
        inventory.setForeground(Color.WHITE);
        inventory.setBounds(870, 400, 320 ,80);
        thirdPage.add(inventory);

        //Design change password button
        JButton changePassword  = new JButton(" تغییر رمز ");
        changePassword.setFont(font);
        changePassword.setBackground((new Color(90 ,90,130)));
        changePassword.setFocusable(false);
        changePassword.setForeground(Color.WHITE);
        changePassword.setBounds (870 , 150 , 320 ,80);
        thirdPage.add(changePassword);

        // Design back button
        JButton back2 = new JButton("برگشت");
        back2.setForeground(Color.WHITE);
        back2.setBounds(40 ,640 , 250,80);
        back2.setFont(font);
        back2.setFocusable(false);
        back2.setBackground(new Color(130,95,130));
        thirdPage.add(back2);

        // click on back button
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstPage.setBounds(thirdPage.getBounds());
                frame.remove(thirdPage);
                frame.add(firstPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on get cash button
        getCash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourthPage.setBounds(thirdPage.getBounds());
                frame.remove(thirdPage);
                frame.add(fourthPage);
                frame.revalidate();
                frame.repaint();
            }
        });


        // Design fourth page

        // Design amount1 button
        JButton amount1 = new JButton("500000");
        amount1.setFont(font);
        amount1.setBounds(0,150,300,80);
        amount1.setBackground(new Color(90 ,90,130));
        amount1.setForeground(Color.WHITE);
        amount1.setFocusable(false);
        fourthPage.add(amount1);

        // Design amount2 button
        JButton amount2 = new JButton("1000000");
        amount2.setFont(font);
        amount2.setBounds(870 , 150 , 320 ,80);
        amount2.setBackground(new Color(90 ,90,130));
        amount2.setForeground(Color.WHITE);
        amount2.setFocusable(false);
        fourthPage.add(amount2);

        // Design amount3 button
        JButton amount3 = new JButton("1500000");
        amount3.setFont(font);
        amount3.setBounds(0,400 , 300 ,80);
        amount3.setBackground(new Color(90 ,90,130));
        amount3.setForeground(Color.WHITE);
        amount3.setFocusable(false);
        fourthPage.add(amount3);

        // Design amount4 button
        JButton amount4 = new JButton("2000000");
        amount4.setFont(font);
        amount4.setBounds(870, 400, 320 ,80);
        amount4.setBackground(new Color(90 ,90,130));
        amount4.setForeground(Color.WHITE);
        amount4.setFocusable(false);
        fourthPage.add(amount4);

        // Design back button
        JButton back3 = new JButton("برگشت");
        back3.setForeground(Color.WHITE);
        back3.setBounds(40 ,640 , 250,80);
        back3.setFont(font);
        back3.setFocusable(false);
        back3.setBackground(new Color(130,95,130));
        fourthPage.add(back3);


        // click on back button
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdPage.setBounds(fourthPage.getBounds());
                frame.remove(fourthPage);
                frame.add(thirdPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on amount1 button
        amount1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fifthPage.setBounds(fourthPage.getBounds());
                frame.remove(fourthPage);
                frame.add(fifthPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on amount2 button
        amount2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fifthPage.setBounds(fourthPage.getBounds());
                frame.remove(fourthPage);
                frame.add(fifthPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on amount3 button
        amount3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fifthPage.setBounds(fourthPage.getBounds());
                frame.remove(fourthPage);
                frame.add(fifthPage);
                frame.revalidate();
                frame.repaint();
            }
        });

       // click on amount4 button
        amount4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fifthPage.setBounds(fourthPage.getBounds());
                frame.remove(fourthPage);
                frame.add(fifthPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // Design fifth page

        // Design label for success of the operation
        JLabel end = new JLabel("عملیات با موفقیت انجام شد.");
        end.setBounds(350 ,300 ,600 ,80);
        end.setFont(font);
        end.setForeground(Color.WHITE);
        fifthPage.add(end);

        // Design back button
        JButton back4 = new JButton("برگشت");
        back4.setForeground(Color.WHITE);
        back4.setBounds(40 ,640 , 250,80);
        back4.setFont(font);
        back4.setFocusable(false);
        back4.setBackground(new Color(130,95,130));
        fifthPage.add(back4);

        back4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdPage.setBounds(fifthPage.getBounds());
                frame.remove(fifthPage);
                frame.add(thirdPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on card by card button
        cardByCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sixPage.setBounds(thirdPage.getBounds());
                frame.remove(thirdPage);
                frame.add(sixPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // Design six page

        // Design label of amount sent
        JLabel amountSent = new JLabel("مبلغ موردنظر را وارد کنید ");
        amountSent.setBounds(425 , 90 ,500 ,80);
        amountSent.setFont(font1);
        amountSent.setForeground(Color.WHITE);
        sixPage.add(amountSent);

        // Design label of card number
        JLabel cardNumber = new JLabel(" شماره کارت مقصد را وارد کنید");
        cardNumber.setBounds(405 , 320 ,600 ,80);
        cardNumber.setFont(font1);
        cardNumber.setForeground(Color.WHITE);
        sixPage.add(cardNumber);

        // Design record button
        JButton Record2 = new JButton("ثبت ");
        Record2.setFocusable(false);
        Record2.setForeground(Color.WHITE);
        Record2.setBackground(new Color(90,90,130));
        Record2.setFont(font);
        Record2.setBounds(430,600 ,300 ,80);
        sixPage.add(Record2);

        // Design textfield2
        JTextField textField2 = new JTextField();
        textField2.setBounds(430 ,190 ,300 ,60);
        textField2.setFont(font);
        sixPage.add(textField2);

        // Design textfield3
        JTextField textField3 = new JTextField();
        textField3.setBounds(430 ,420 ,300 ,60);
        textField3.setFont(font);
        sixPage.add(textField3);

        // Design back button
        JButton back5 =new JButton("برگشت");
        back5.setForeground(Color.WHITE);
        back5.setBounds(50 ,600 , 250,80);
        back5.setFont(font);
        back5.setFocusable(false);
        back5.setBackground(new Color(130,95,130));
        sixPage.add(back5);

        // click on back button
        back5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sixPage.setBounds(thirdPage.getBounds());
                frame.remove(sixPage);
                frame.add(thirdPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on record button
        Record2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sixPage.setBounds(fifthPage.getBounds());
                frame.remove(sixPage);
                frame.add(fifthPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on change password
        changePassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seventhPage.setBounds(thirdPage.getBounds());
                frame.remove(thirdPage);
                frame.add(seventhPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // Design seven page

        // Design textfield for new password
        JTextField textField4 = new JTextField();
        textField4.setFont(font);
        textField4.setBounds(400,280,350,75);
        seventhPage.add(textField4);

        // Design label for enter new password
        JLabel newPassword = new JLabel("رمز جدید را وارد کنید");
        newPassword.setFont(font);
        newPassword.setForeground(Color.WHITE);
        newPassword.setBounds(400,130 ,400 ,60);
        seventhPage.add(newPassword);

        // Design record button
        JButton Record3 = new JButton("ثبت");
        Record3.setForeground(Color.WHITE);
        Record3.setBackground(new Color(90,90,130));
        Record3.setFont(font);
        Record3.setBounds(430,600 ,300 ,80);
        seventhPage.add(Record3);

        // Design back button
        JButton back6 =new JButton("برگشت");
        back6.setForeground(Color.WHITE);
        back6.setBounds(50 ,600 , 250,80);
        back6.setFont(font);
        back6.setFocusable(false);
        back6.setBackground(new Color(130,95,130));
        Record3.setFocusable(false);
        seventhPage.add(back6);

        // click on back button
        back6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdPage.setBounds(seventhPage.getBounds());
                frame.remove(seventhPage);
                frame.add(thirdPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // click on record button
        Record3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fifthPage.setBounds(seventhPage.getBounds());
                frame.remove(seventhPage);
                frame.add(fifthPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        //click on inventory button
        inventory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eigthPage.setBounds(thirdPage.getBounds());
                frame.remove(thirdPage);
                frame.add(eigthPage);
                frame.revalidate();
                frame.repaint();
            }
        });

        // Design eight page

        //Design label for inventory
        JLabel inventory1 = new JLabel("موجودی حساب شما : 56350000 ریال ");
        inventory1.setForeground(Color.WHITE);
        inventory1.setFont(font);
        inventory1.setBounds(250 , 300 ,800 ,80);
        eigthPage.add(inventory1);

        // Design back button
        JButton back7 =new JButton("برگشت");
        back7.setForeground(Color.WHITE);
        back7.setBounds(50 ,600 , 250,80);
        back7.setFont(font);
        back7.setFocusable(false);
        back7.setBackground(new Color(130,95,130));
        eigthPage.add(back7);

        // click on back button
        back7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdPage.setBounds(eigthPage.getBounds());
                frame.remove(eigthPage);
                frame.add(thirdPage);
                frame.revalidate();
                frame.repaint();
            }
        });


       // Design and settings of frame
        frame.add(firstPage);
        frame.setSize(1200, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


    }

}