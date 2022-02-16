package controlador;

import modelo.Modelo;
import vista.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private Ventana ventana;
    private Modelo modelo;

    public Controlador(Ventana ventana, Modelo modelo){
        this.ventana = ventana;
        this.modelo = modelo;
        this.ventana.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(this.ventana.getBtnEnviarServ())){
            System.out.println("Boton Servidor"); //Prueba

        }
        if(e.getSource().equals(this.ventana.getBtnEnviarCli())){
            System.out.println("Boton Cliente"); //Prueba
        }


    }
}
