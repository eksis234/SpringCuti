/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.springhibernatemaven.controller;

import com.agung.springhibernatemaven.exception.NotFoundException;
import com.agung.springhibernatemaven.model.Karyawan;
import com.agung.springhibernatemaven.service.KaryawanService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Lenovo
 */
@Controller
public class KaryawanController {

    @Autowired
    KaryawanService karyawanService;

    public void setKaryawanService(KaryawanService karyawanService) {
        this.karyawanService = karyawanService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        //model.addAttribute("lagus", laguService.getLagus());
        return "index";
    }

    @RequestMapping(value = "karyawan", method = RequestMethod.GET)
    public String karyawan(Model model) {
        model.addAttribute("karyawans", karyawanService.getKaryawans());
        return "karyawan";
    }

    @RequestMapping(value = "tambah4", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("karyawan", new Karyawan());
        return "tambah4";
    }

    @RequestMapping(value = "tambah4", method = RequestMethod.POST)
    public String adding(@ModelAttribute("karyawan") Karyawan karyawan) {
        karyawanService.saveKaryawan(karyawan);
        return "redirect:/karyawan";
    }

    @RequestMapping(value = "edit4/{id}", method = RequestMethod.GET)
    public String edit(Model model, @PathVariable("id") Integer id) {
        Karyawan karyawan = karyawanService.getKaryawan(id);
        if (karyawan == null) {
            throw new NotFoundException();
        }
        model.addAttribute("karyawan", karyawan);
        return "edit4";
    }

    @RequestMapping(value = "edit4", method = RequestMethod.POST)
    public String editing(@ModelAttribute("karyawan") Karyawan karyawan) {
        karyawanService.updateKaryawan(karyawan);
        return "redirect:/karyawan";
    }

    @RequestMapping(value = "delete4/{id}", method = RequestMethod.GET)
    public String deleting(@PathVariable("id") Integer id) {
        Karyawan karyawan = karyawanService.getKaryawan(id);
        if (karyawan == null) {
            throw new NotFoundException();
        }
        karyawanService.deleteKaryawan(karyawan);
        return "redirect:/karyawan";
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String successLogin(@RequestParam("email") String email,
            @RequestParam("katasandi") String katasandi,
            HttpSession session,
            ModelMap modelMap) {
        Karyawan k = karyawanService.getByEmail(email);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(k.getKatasandi());
        boolean valid = passwordEncoder.matches(k.getKatasandi(), hashedPassword);
        if (email.equals(k.getEmail()) && valid == true) {
            session.setAttribute("email", email);
            session.setAttribute("id", k.getId());
            session.setAttribute("nama", k.getNama());
            return "home";
        } else {
            modelMap.put("error", "Invalid Account");
            return "redirect:/logout";
        }
    }

    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("email");
        return "index";
    }

//    @RequestMapping(value = "pdf",method = RequestMethod.GET)
//    public String getPdfReport(Model model, HttpServletResponse response){        
//        List<Karyawan> karyawans = karyawanService.getKaryawans();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(karyawans);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "pdfReport";
//    }
//    
//    @RequestMapping(value = "xls",method = RequestMethod.GET)
//    public String getXlsReport(Model model, HttpServletResponse response){
//        List<Karyawan> karyawans = karyawanService.getKaryawans();
//        JRDataSource dataSource=new JRBeanCollectionDataSource(karyawans);
//        
//        model.addAttribute("dataSource", dataSource);
//        return "xlsReport";
//    }
}
