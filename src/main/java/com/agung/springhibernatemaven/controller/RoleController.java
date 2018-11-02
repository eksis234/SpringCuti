/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.controller;

import com.agung.springhibernatemaven.exception.NotFoundException;
import com.agung.springhibernatemaven.model.Role;
import com.agung.springhibernatemaven.service.RoleService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Lenovo
 */
@Controller
public class RoleController {
    @Autowired
    RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }
    
    @RequestMapping(value = "role",method = RequestMethod.GET)
    public String role(Model model){
        model.addAttribute("roles", roleService.getRoles());
        return "role";
    }
    
    @RequestMapping(value = "tambah3",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("role", new Role());
        return "tambah3";
    }
    
    @RequestMapping(value = "tambah3",method = RequestMethod.POST)
    public String adding(@ModelAttribute("role") Role role){
        roleService.saveRole(role);
        return "redirect:/role";
    }
    
    @RequestMapping(value = "edit3/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id){
        Role role = roleService.getRole(id);
        if(role==null){
            throw new NotFoundException();
        }
        model.addAttribute("role", role);
        return "edit3";
    }
    
    @RequestMapping(value = "edit3",method = RequestMethod.POST)
    public String editing(@ModelAttribute("role") Role role){
        roleService.updateRole(role);
        return "redirect:/role";
    }
    
    @RequestMapping(value = "delete3/{id}",method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id){
        Role role = roleService.getRole(id);
        if(role==null){
            throw new NotFoundException();
        }
        roleService.deleteRole(role);
        return "redirect:/role";
    }
    
//    @RequestMapping(value = "pdf",method = RequestMethod.GET)
//    public String getPdfReport(Model model, HttpServletResponse response){        
//        List<Role> roles = roleService.getRoles();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(roles);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "pdfReport";
//    }
//    
//    @RequestMapping(value = "xls",method = RequestMethod.GET)
//    public String getXlsReport(Model model, HttpServletResponse response){
//        List<Role> roles = roleService.getRoles();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(roles);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "xlsReport";
//    }
    
    
}
