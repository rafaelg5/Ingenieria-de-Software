/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    @RequestMapping(value = "/")
    public String inicio() {
        return "inicio";
    }

    @RequestMapping(value = "/sesion", method = RequestMethod.POST)
    public ModelAndView correo(ModelMap model, HttpServletRequest request) {
        String c = request.getParameter("correo");
        String p = request.getParameter("password");
        model.addAttribute("sesion1", c);
        model.addAttribute("sesion2", p);
        return new ModelAndView("sesion", model);
    }

    @RequestMapping(value = "/registro", method = RequestMethod.POST)
    public ModelAndView registro(ModelMap model, HttpServletRequest request) {
        return new ModelAndView("registro", model);
    }
    
    @RequestMapping(value = "/registro2", method = RequestMethod.GET)
    public ModelAndView registro2(ModelMap model, HttpServletRequest request) {
        String n = request.getParameter("nombre");
        String c = request.getParameter("carrera");
        String fn = request.getParameter("fechanac");
        String m = request.getParameter("correo");
        String p = request.getParameter("password");
        model.addAttribute("nombre", n);
        model.addAttribute("carrera", c);
        model.addAttribute("fechanac", fn);
        model.addAttribute("correo", m);
        model.addAttribute("password", p);
        return new ModelAndView("registro2", model);
    }
    
}
