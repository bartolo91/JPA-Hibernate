package pl.kurs.dao;

import pl.kurs.model.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDaoImpl implements CarDao {


    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public CarDaoImpl() {

        factory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Car car) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(car);
        transaction.commit();
    }

    @Override
    public Car getCar(Long id) {
        return entityManager.find(Car.class, id);
    }

    @Override
    public void cleanUp() {
        entityManager.close();
        factory.close();
    }
}
