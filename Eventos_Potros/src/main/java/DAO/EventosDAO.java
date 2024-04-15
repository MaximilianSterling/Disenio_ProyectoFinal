/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConexionMySQL.conexionMySQL;
import entidades.evento;
import javax.persistence.EntityManager;

/**
 *
 * @author cocob
 */
public class EventosDAO {

    public void insertarEvento(evento evento) {
        EntityManager em = null;
        try {
            em = conexionMySQL.createEntityManager();
            em.getTransaction().begin();
            em.persist(evento);
            em.getTransaction().commit();
            System.out.println("Guardado correctamente");
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e.getMessage());
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
