/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaNumero.modelo;

/**
 *
 * @author franc
 */
public enum Estado {
    INICIO(""),
    IGUAL("Felicitaciones adivinaste mi numero! Ahora puedes jugar devuelta."),
    MAYOR("Mi numero es mayor"),
    MENOR("Mi numero es menor"),
    SIN_TURNOS("Lo siento, te quedaste sin turnos!");
    
    private String mensaje;

    private Estado(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

