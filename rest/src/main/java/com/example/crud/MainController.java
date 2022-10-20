package com.example.crud;

import com.example.crud.model.Aien;
import com.example.crud.repo.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/add")
    public ModelAndView add(Aien alien){
        repo.save(alien);
        ModelAndView mv = new ModelAndView("added.jsp");
        mv.addObject("obj", alien);
        System.out.println("Added: "+alien);
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update(Aien alien){
        repo.save(alien);
        ModelAndView mv = new ModelAndView("updated.jsp");
        mv.addObject("obj", alien);
        System.out.println("Updated: "+alien);
        return mv;
    }

    @RequestMapping("/fetch")
    public ModelAndView fetch(int id){
        ModelAndView mv = new ModelAndView("found.jsp");
        Aien alien = repo.findById(id).orElse(new Aien());
        mv.addObject("obj", alien);
        System.out.println("Found: "+alien);
        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView delete(int id){
        ModelAndView mv = new ModelAndView("delete.jsp");
        Aien alien = repo.findById(id).orElse(new Aien());
        mv.addObject("obj", alien);
        repo.delete(alien);
        System.out.println("Deleted: "+alien);
        return mv;
    }
}