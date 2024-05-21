package ImplementacionJAVA;

import java.util.Date;

public class CitaMedica implements GestionCitas {
    private Date fecha;
    private Date hora;
    private String motivocita;
    private static int cantidadCita;

    @Override
    public Date programarCitas() {
        return null;
    }

    @Override
    public Boolean cancelarCitas() {
        return null;
    }

    @Override
    public void realizarCitas() {

    }

    //Realaciones
    private Estado estadocita;
}
