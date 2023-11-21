package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.UserService;


    @Controller
//    @RequestMapping("/users")
    public class UserController {

        private final UserService userService;

        public UserController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping("/users")
        public String allUsers(Model model) {
            model.addAttribute("users", userService.getAllUsers());
            return "users";
        }
}
