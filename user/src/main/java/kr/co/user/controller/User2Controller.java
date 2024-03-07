package kr.co.user.controller;

import kr.co.user.dto.User2DTO;
import kr.co.user.service.User2Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class User2Controller {

    private final User2Service service;

    public User2Controller(User2Service service) {
        this.service = service;
    }


    @GetMapping("/user2/list")
    public String List(Model model){
        List<User2DTO> users = service.selectUser2s();
        model.addAttribute("users", users);

        return "/user2/list";
    }
}
