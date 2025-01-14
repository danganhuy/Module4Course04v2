package huy.module4course04v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("")
    public String index() {
        return "redirect:/products";
    }
}
