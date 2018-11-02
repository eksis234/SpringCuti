/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.Role;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public class RoleDaoImpl implements RoleDao{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Role> getRoles() {
        return sessionFactory.getCurrentSession().createQuery("select l from Role l").list();
    }

    @Override
    public Role getRole(Integer id) {
        return (Role) sessionFactory.getCurrentSession().get(Role.class, id);
    }

    @Override
    public Role saveRole(Role role) {
        sessionFactory.getCurrentSession().save(role);
        return role;
    }

    @Override
    public Role updateRole(Role role) {
        sessionFactory.getCurrentSession().update(role);
        return role;
    }

    @Override
    public Role deleteRole(Role role) {
        sessionFactory.getCurrentSession().delete(role);
        return role;
    }
}
