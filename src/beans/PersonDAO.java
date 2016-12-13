package beans;

import tables.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by yevge on 13.12.2016.
 */
@Stateless
public class PersonDAO {
    @PersistenceContext
    EntityManager em;

    public List<Person> findAll() {
        return em.createQuery("select p from Person p").getResultList();
    }
}
