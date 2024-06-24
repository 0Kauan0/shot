package window;

import javax.swing.*;
import java.awt.*;

public class Show {
    private JLabel soma1 = new JLabel("numero1");
    private JTextField numero1 = new JTextField();
    private JLabel soma2 = new JLabel("numero2");
    private JTextField numero2 = new JTextField();
    private JButton calcular = new JButton("calcular");

    public Show(){
        criarTela();
    }

    public void criarTela(){
        JFrame frame =new JFrame();

        frame.setTitle("Calculadora");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        numero1.setBounds(60,0,200,30);
        soma1.setBounds(5,4,60,20);

        numero2.setBounds(60,30,200,30);
        soma2.setBounds(5,32,60, 20);

        calcular.setBounds(50,50,150,30);





        frame.getContentPane().add(numero1);
        frame.getContentPane().add(soma1);
        frame.getContentPane().add(numero2);
        frame.getContentPane().add(soma2);
        frame.getContentPane().add(calcular);
        frame.setVisible(true);
    }
}
