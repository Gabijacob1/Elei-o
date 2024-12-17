package br.com.eleicao;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        JFrame f = new  JFrame("Eleição");
        f.setContentPane(new eleicao().panel);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}