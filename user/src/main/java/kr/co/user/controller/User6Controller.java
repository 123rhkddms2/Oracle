package kr.co.user.controller;

import kr.co.user.dto.User6DTO;
import kr.co.user.service.User6Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class User6Controller {
    private final User6Service service;

    public User6Controller(User6Service service) {
        this.service = service;
    }

    @GetMapping("/user6/list")
    public String List(Model model){
        List<User6DTO> users = service.selectUser6s();
        model.addAttribute("users", users);

        return "/user6/list";
    }


}
