package hib.web.controller;

import hib.Service.CarServiceImpl;
import hib.Service.UserService;
import hib.Service.UserServiceImp;
import hib.dao.UserDaoImp;
import hib.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarController {
    @Autowired
    private final UserService userService;

    public CarController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/user",produces = "text/html; charset=UTF-8")
    public String carList ( Model model) {
        model.addAttribute("user",userService.listUsers());
        return "cars";
    }
    @GetMapping(value = "/newUser" , produces = "text/html; charset=UTF-8")
    public String newCar(Model model){
        model.addAttribute("user",new User());
        return "newUser";
    }
    @PostMapping(value = "/newUser",produces = "text/html; charset=UTF-8")
    public String create(@ModelAttribute("user" )User user) {
        userService.add(user);
        return "redirect:/user";
    }
    @GetMapping(value = "show",produces = "text/html; charset=UTF-8")
    public String show (@RequestParam int id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "show";
    }

    @GetMapping(value = "/index" ,produces = "text/html; charset=UTF-8")
        public String userUpdate(@RequestParam int id , Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "/index";
    }
    @PostMapping(value = "/index",produces = "text/html; charset=UTF-8")
    public String  userUpdate(@ModelAttribute("user") User user){
        userService.updateUser(user);
        return "redirect:user";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id , Model model){
        userService.userDeleteById(id);
        return "redirect:user";
    }




}
