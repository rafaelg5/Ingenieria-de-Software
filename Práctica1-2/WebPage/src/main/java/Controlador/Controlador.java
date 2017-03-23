/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Mapeo.Persona;
import Mapeo.User;
import Modelo.PersonaDAO;
import Modelo.UserDAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    @Autowired
    UserDAO user_db;
    @Autowired
    PersonaDAO persona_db;

    @RequestMapping(value = "/")
    public String inicio() {
        return "inicio";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView nombre(ModelMap model, HttpServletRequest request) {
        String c = request.getParameter("correo");
        String pass = request.getParameter("password");
        User u = user_db.getUser(c);
        String info = "";
        if (u == null) {
            model.addAttribute("info", info + "No se encontró ningún usuario con ese correo");
        } else if(!u.getPassword().equals(pass)){
            model.addAttribute("info", info + "Contraseña incorrecta!");
        }else{
         Persona p = u.getPersona_user();
            model.addAttribute("info", info + "Usuario: ");
            model.addAttribute("user", u);
            model.addAttribute("persona", p);   
        }
        return new ModelAndView("user", model);
    }

    @RequestMapping(value = "/registro", method = RequestMethod.POST)
    public ModelAndView registro(ModelMap model, HttpServletRequest request) {
        return new ModelAndView("registro", model);
    }
    
    @RequestMapping(value = "/maps", method = RequestMethod.POST)
    public ModelAndView maps(ModelMap model, HttpServletRequest request) {
        return new ModelAndView("maps", model);
    }

    @RequestMapping(value = "/registro2", method = RequestMethod.GET)
    public ModelAndView registro2(ModelMap model, HttpServletRequest request) {

        String n = request.getParameter("nombre");
        String c = request.getParameter("carrera");
        String fn = request.getParameter("fechanac");
        String m = request.getParameter("correo");
        String p = request.getParameter("password");
        
        if (!user_db.exists(m)) {
            Persona persona = new Persona();
            persona.setCarrera(c);
            persona.setFechanac(fn);
            persona.setNombre(n);
            persona_db.guardar(persona);

            User user = new User();
            user.setCorreo(m);
            user.setPassword(p);
            user.setPersona_user(persona);
            user_db.guardar(user);
            
            model.addAttribute("info", "Se ha registrado el usuario: ");
            model.addAttribute("nombre", n);
            model.addAttribute("carrera", c);
            model.addAttribute("fechanac", fn);
            model.addAttribute("correo", m);
            model.addAttribute("password", p);
        } else {
            model.addAttribute("info", "El correo ya está registrado.");
        }
        return new ModelAndView("registro2", model);
    }
}
