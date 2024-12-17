package br.com.eleicao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class eleicao {
    public JPanel panel;
    private JRadioButton rb2;
    private JButton btnVotar;
    private JButton btnApurar;
    private JLabel lblcandidato1;
    private JLabel lblCandidato2;
    private JRadioButton rb1;
    private JLabel lblC1;
    private JLabel lblC2;
    private JLabel lblTotal;
    private JLabel lbl2C1;
    private JLabel lbl2C2;

    int candidato1 = 0;
    int candidato2 = 0;


    public eleicao() {
        btnVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(rb1.isSelected()){
                    candidato1++;
                }

                 if(rb2.isSelected()){
                     candidato2++;
                 }


            }
        });
        btnApurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float total = candidato1 + candidato2;
                float c1 = (candidato1/total) * 100;
                float c2 = (candidato2/total) * 100;

                DecimalFormat p = new DecimalFormat("0.00");
                lblC1.setText(" Total de votos: " + candidato1 );
                lbl2C1.setText("Percentual de Votos: "+ p.format(c1) + "%");
                lblC2.setText("Total de Votos: " + candidato2);
                lbl2C2.setText("Percentual de Votos: "+ p.format(c2) + "%");
                DecimalFormat f = new DecimalFormat("0");
                lblTotal.setText("Votos: " + f.format(total));
            }
        });
    }

    private void createUIComponents() {

        lblcandidato1 = new JLabel(new ImageIcon("donald.png"));
        lblCandidato2 = new JLabel(new ImageIcon("mickey.png"));

    }
}
