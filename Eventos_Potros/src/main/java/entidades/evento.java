package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Linda-Ruben-Max-David
 */
@Entity
@Table(name = "Evento")
public class evento {

    @Id //Identificacion del id
    @Column(name = "idEvento") //Identificacion de la columna
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Identifica que la variable es autoincrementable
    private int idEvento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "Fecha")
    private String Fecha;
    @Column(name = "Hora")
    private String Hora;
    @Column(name = "Lugar")
    private String Lugar;
    @Column(name = "Descripcion")
    private String Descripcion;
    @Column(name = "horas")
    private int horas;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

}
