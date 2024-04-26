package ConexionMySQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cocob
 */
public class conexionMySQL {

    private static EntityManagerFactory emf = null;

    public static EntityManager createEntityManager() {
        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("mx.itson_Eventos_Potros_jar_1.0PU");
                System.out.println("conectado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return emf.createEntityManager();
    }
}
