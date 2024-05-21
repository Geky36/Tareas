package ImplementacionJAVA;

import java.util.Date;

public class Enfermero extends Persona implements GestionCitas {
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

    public void asistirPaciente(){

    }

    public void asistirDoctor(){

    }

    //Relaciones
    private Doctor[] doctorList;
    private Paciente[] pacienteList;
}
