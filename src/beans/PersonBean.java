package beans;

import tables.Person;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by yevge on 13.12.2016.
 */
@Named
@RequestScoped
public class PersonBean {
    @EJB
    PersonDAO personDAO;

    public List<Person> getPersons() {
        return personDAO.findAll();
    }
}
