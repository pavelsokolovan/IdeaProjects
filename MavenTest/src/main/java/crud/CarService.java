package crud;

import entity.Car;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by psok on 4/7/2016.
 */
public class CarService {
    public static EntityManager entityManager = Persistence.createEntityManagerFactory("MAVENTEST").createEntityManager();

    public static Car add(Car car){
        entityManager.getTransaction().begin();
        Car carFromDB = entityManager.merge(car);
        entityManager.getTransaction().commit();
        return carFromDB;
    }

    public static void delete(long id){
        entityManager.getTransaction().begin();
        entityManager.remove(get(id));
        entityManager.getTransaction().commit();
    }

    public static Car get(long id){
        return entityManager.find(Car.class, id);
    }

    public static List<Car> getAll(){
        TypedQuery<Car> namedQuery = entityManager.createNamedQuery("Car.getAll", Car.class);
        return namedQuery.getResultList();
    }
}
