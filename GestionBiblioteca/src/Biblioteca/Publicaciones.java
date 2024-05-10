package Biblioteca;

import java.util.Date;

public abstract class Publicaciones {
    //Atributos
    private String titulo;
    private Date fechaPublicacion;
    private String editorial;
    private String contenido;
    private String autor;

    //Relaciones
    private Documentos[] documentoLIST;
    private Estado[] estadoLIST;
}
