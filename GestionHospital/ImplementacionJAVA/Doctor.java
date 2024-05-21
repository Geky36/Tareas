package ImplementacionJAVA;

import java.util.Date;

public class Doctor extends Persona implements GestionCitas {
    private final int idDoctor = 1150562658;

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

    public void atenderPaciente(){

    }

    public void recibirEnfermero(){

    }

    //Relaciones
    private Especialidad especialidad;
    private Paciente[] pacienteList;
    private Enfermero[] enfermeroList;

}
