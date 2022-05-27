package pl.kurs.burdel.task.dao;

import pl.kurs.burdel.task.model.Brothel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BrothelDaoImpl implements BrothelDao {

    private  EntityManagerFactory factory;
    private EntityManager entityManager;

    public BrothelDaoImpl() {
        factory = Persistence.createEntityManagerFactory("myPersistenceUnit2");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Brothel brothel) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(brothel);
        transaction.commit();
    }

    @Override
    public Brothel getBrothel(Long id) {
        return entityManager.find(Brothel.class, id);
    }

    @Override
    public void cleanUp() {
        entityManager.close();
        factory.close();
    }
}
