package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_GUI_Form extends JFrame {

    private JPanel Panel_01;
    private JLabel Label_01;
    private JLabel Label_02;
    private JLabel Label_03;
    private JLabel Label_04;
    private JLabel Label_05;
    private JTextField Text_Field_01;
    private JTextField Text_Field_02;
    private JTextField Text_Field_03;
    private JTextField Text_Field_04;
    private JButton Button_01;
    private JButton Button_02;

    public Test_GUI_Form() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Test GUI Fom");
        this.setContentPane(Panel_01);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 240);
        this.setVisible(true);
        Button_01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nombre_Usuario = (Text_Field_01.getText()).trim();
                String Apellido_Usuario = (Text_Field_02.getText()).trim();
                String DNI_Usuario = (Text_Field_03.getText()).trim();
                String Telefono_Usuario = (Text_Field_04.getText()).trim();
                String Data = "";
                Data = Nombre_Usuario + "\n";
                Data += Apellido_Usuario + "\n";
                Data += DNI_Usuario + "\n";
                Data += Telefono_Usuario;
                JOptionPane.showMessageDialog(null, Data, "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Button_02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Test_GUI_Form();
    }
}