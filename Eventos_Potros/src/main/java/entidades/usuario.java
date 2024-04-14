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
@Table(name = "usuario")
public class usuario {

    @Id //Identificacion del id
    @Column(name = "idUsuario") //Identificacion de la columna
    @GeneratedValue(strategy = GenerationType.AUTO) //Identifica que la variable es autoincrementable

    private int idUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "pass")
    private String pass;
    @Column(name = "identificador")
    private int identificador;
    @Column(name = "idCIA")
    private String idCIA;
    @Column(name = "horas")
    private int horas;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getIdCIA() {
        return idCIA;
    }

    public void setIdCIA(String idCIA) {
        this.idCIA = idCIA;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

}
