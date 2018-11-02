/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.dao;

import com.agung.springhibernatemaven.model.Role;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface RoleDao {
    public List<Role> getRoles();
    public Role getRole(Integer id);
    public Role saveRole(Role role);
    public Role updateRole(Role role);
    public Role deleteRole(Role role);
}
