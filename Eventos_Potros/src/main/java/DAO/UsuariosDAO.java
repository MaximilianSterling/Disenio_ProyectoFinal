/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConexionMySQL.conexionMySQL;
import entidades.usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author cocob
 */
public class UsuariosDAO {

    public void insertarUsuario(usuario usuario) {
        EntityManager em = null;
        try {
            em = conexionMySQL.createEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
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

    public static void main(String[] args) {
        UsuariosDAO udao = new UsuariosDAO();
        usuario us = new usuario();
        
        us.setNombre("Linda");
        us.setPass("98765432");
        us.setIdentificador(1);
        us.setIdCIA("216690");
        us.setHoras(45);
        udao.insertarUsuario(us);
    }
}
