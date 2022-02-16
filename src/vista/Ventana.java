package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private Controlador controlador;

    //Labels
    private JLabel labelServidor = new JLabel("Servidor:");
    private JLabel labelCliente = new JLabel("Cliente:");


    //Botones

    private JButton btnEnviarServ = new JButton("Enviar");
    private JButton btnEnviarCli = new JButton("Enviar");

    //JTextArea

    private JTextArea chatServidor = new JTextArea();
    private JScrollPane JSPServ = new JScrollPane(chatServidor);

    private JTextArea chatCliente = new JTextArea();
    private JScrollPane JSPCli = new JScrollPane(chatCliente);

    //JTextField para escribir mensajes

    private JTextField JTFServ = new JTextField();
    private JTextField JTFCli = new JTextField();

    //Constructor

    public Ventana(){

        this.setSize(1200,700);
        this.getContentPane().setBackground(new Color(140,146,172));
        this.setVisible(true);
        this.setLayout(null);
        this.initComponents();
        this.setTitle("UDP");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents() {

        //Labels
        this.add(labelServidor);
        this.labelServidor.setBounds(100,60,70,30);
        this.add(labelCliente);
        this.labelCliente.setBounds(700,60,70,30);

        //Chats
        this.add(JSPServ);
        this.chatServidor.setEditable(false);
        this.JSPServ.setBounds(100,100,300,400);

        this.add(JSPCli);
        this.chatCliente.setEditable(false);
        this.JSPCli.setBounds(700,100,300,400);

        //JTextFields

        this.add(JTFServ);
        this.JTFServ.setBounds(100,520,300,30);
        this.add(JTFCli);
        this.JTFCli.setBounds(700,520,300,30);

        this.add(btnEnviarServ);
        this.btnEnviarServ.setBounds(200,550,100,30);
        this.add(btnEnviarCli);
        this.btnEnviarCli.setBounds(800,550,100,30);
    }

    public void setControlador(Controlador controlador){
        this.controlador = controlador;
        this.btnEnviarServ.addActionListener(this.controlador);
        this.btnEnviarCli.addActionListener(this.controlador);
    }

    //Getters y Setters

    public String getTextoServidor(){
        return this.JTFServ.getText();
    }

    public String getTextoCLiente(){
        return this.JTFCli.getText();
    }

    public void setTextoServidor(String s){
        this.chatServidor.setText(this.chatServidor.getText() + "\n" + s);
    }

    public void setTextoCliente(String s){
        this.chatCliente.setText(this.chatCliente.getText() + "\n" + s);
    }

    public JButton getBtnEnviarServ() {
        return btnEnviarServ;
    }

    public JButton getBtnEnviarCli() {
        return btnEnviarCli;
    }
}
