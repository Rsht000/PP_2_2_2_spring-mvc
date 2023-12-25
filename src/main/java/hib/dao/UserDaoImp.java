package hib.dao;

import hib.Service.UserService;
import hib.Service.UserServiceImp;
import hib.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> listUsers() {
        TypedQuery<User> namedQuery =  entityManager
                .createQuery("from User ", User.class);
        return namedQuery.getResultList();
    }
    @Override
    public User getUserById(int id) {
        return  listUsers().stream()
                .filter(user -> user.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public void userDeleteById(int id) {
        entityManager.remove(getUserById(id));
    }

}
