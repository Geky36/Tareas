package ImplementacionJAVA;

import java.util.Date;

public class Paciente extends Persona implements GestionCitas{
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

    public void recibirDoctor (){

    }

    public void recibirEnfermero (){

    }

    //Relaciones
    private Doctor[] doctorList;
    private Enfermero[] enfermeroList;
    private ExpedienteMedico expedienteMedico;
}
