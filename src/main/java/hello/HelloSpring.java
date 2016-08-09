package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by michalina on 09/08/16.
 */
@Controller
public class HelloSpring {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }


}
