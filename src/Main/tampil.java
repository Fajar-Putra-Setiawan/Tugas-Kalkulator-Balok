package Main;

import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import hitung.Balok;

public class tampil extends JFrame implements ActionListener{
    JLabel lJudul = new JLabel("Kalkulator Balok");
    JLabel lPanjang = new JLabel("Panjang");
    JTextField fPanjang = new JTextField(8);

    JLabel lLebar = new JLabel("Lebar");
    JTextField fLebar = new JTextField(8);

    JLabel lTinggi = new JLabel("Tinggi");
    JTextField fTinggi = new JTextField(8);

    JLabel lHasil = new JLabel("Result :");

    JLabel lLuasP = new JLabel();

    JLabel lKelilingP = new JLabel();

    JLabel lVolumeB = new JLabel();

    JLabel lLuasPer = new JLabel();

    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");

    tampil(){
        setTitle("Tugas Kalkulator Balok");
        setSize(500,600);
        setLayout(null);

        add(lJudul);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lHasil);
        add(bHitung);
        add(bReset);

        lJudul.setBounds(200,0,300,30);
        lPanjang.setBounds(50,30,300,30);
        fPanjang.setBounds(130, 30, 300, 30);
        lLebar.setBounds(50,70,300,30);
        fLebar.setBounds(130, 70, 300, 30);
        lTinggi.setBounds(50,110,300,30);
        fTinggi.setBounds(130, 110, 300, 30);
        lHasil.setBounds(50, 150, 150, 30);
        bHitung.setBounds(85, 350, 120, 50);
        bReset.setBounds(240, 350, 120, 50);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == bHitung) {

            try{
                double panjang = Double.parseDouble(fPanjang.getText());
                double lebar = Double.parseDouble(fLebar.getText());
                double tinggi = Double.parseDouble(fTinggi.getText());


                Balok balok = new Balok(tinggi, panjang, lebar);


                lLuasP.setText      ("Luas Persegi                   : " + Double.toString(balok.luas()));
                add(lLuasP);
                lLuasP.setBounds(50, 180, 300, 30);

                lKelilingP.setText  ("Keliling Persegi               : " + Double.toString(balok.keliling()));
                add(lKelilingP);
                lKelilingP.setBounds(50, 220, 300, 30);

                lVolumeB.setText    ("Volume Balok                   : " + Double.toString(balok.volume()));
                add(lVolumeB);
                lVolumeB.setBounds(50, 260, 300, 30);

                lLuasPer.setText    ("Luas Permukaan Balok  : " + Double.toString(balok.luasPermukaan()));
                add(lLuasPer);
                lLuasPer.setBounds(50, 300, 300, 30);

            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }

        }

        if (ae.getSource() == bReset) {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            lLuasP.setText(null);
            lKelilingP.setText(null);
            lVolumeB.setText(null);
            lLuasPer.setText(null);
        }
    }



}

