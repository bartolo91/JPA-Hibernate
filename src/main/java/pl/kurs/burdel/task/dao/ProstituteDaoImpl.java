package pl.kurs.burdel.task.dao;

import pl.kurs.burdel.task.model.Prostitute;

import javax.persistence.*;
import java.util.List;

public class ProstituteDaoImpl implements ProstituteDao {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public ProstituteDaoImpl() {
        factory = Persistence.createEntityManagerFactory("myPersistenceUnit1");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Prostitute prostitute) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(prostitute);
        transaction.commit();
    }

    @Override
    public Prostitute getProstitute(Long id) {
        return entityManager.find(Prostitute.class, id);
    }

    @Override
    public void cleanUp() {
        entityManager.close();
        factory.close();
    }

    @Override
    public List<Prostitute> getAllProstitutes() {
        Query nativeQuery = entityManager.createNativeQuery("SELECT  * FROM  prostitute", Prostitute.class);
        return (List<Prostitute>) nativeQuery.getResultList();
    }
}
