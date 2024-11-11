package com.example.SpringwebDem1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller2 {
    @GetMapping("/hello")
    public String hello(String username  // параметр который идет из сторки запросов
                        ,Model modelka ) {   // можно добавлять атрибуты для передачи в шаблон

        System.out.println("метод хелло");
        System.out.println("username = " +username);
        modelka.addAttribute("x", username); // поместим пару названия_ атрибута значение в словарь
        System.out.println(" модель =" + modelka);
        return "hello";   // название шаблона хелло html

    }

}
