package modelo;

import vista.Ventana;

public class Modelo {

    private Ventana ventana;
    private Servidor servidor;
    private Cliente cliente;

    public Modelo(Ventana ventana){
        this.ventana = ventana;
        this.servidor = new Servidor();
        this.cliente = new Cliente();
    }

}
