package aplicacao;

import entidades.Pet;
import org.hibernate.hql.internal.ast.tree.DisplayableNode;
import  javax.persistence.EntityManager;
import  javax.persistence.EntityManagerFactory;
import  javax.persistence.Persistence;


public class App {
    public static void main(String[] args) {
        Pet p1 = new Pet("Dino", 1996);
        Pet p2 = new Pet("Tenente", 1989);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-sqlserver");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();

        em.close();
    }
}
