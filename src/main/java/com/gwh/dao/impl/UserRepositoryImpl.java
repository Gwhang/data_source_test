package com.gwh.dao.impl;

import com.gwh.dao.UserRepository;
import com.gwh.entity.User;
import com.gwh.source.DataSource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户访问数据
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public User load(Integer id) {
        return (User) getCurrentSession().load(User.class,id);
    }
    public User get(Integer id) {
        return (User) getCurrentSession().get(User.class,id);
    }

    public List<User> findAll() {
        String hql = "from user";
        Query query = getCurrentSession().createQuery(hql);
        List<User> users = query.list();
        return users;
    }

    public void persist(User entity) {
        getCurrentSession().persist(entity);
    }

    public Integer save(User entity) {
        return (Integer)getCurrentSession().save(entity);
    }

    public void saveOrUpdate(User entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Integer id) {
        User user=this.load(id);
        getCurrentSession().delete(user);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}
