package pl.akademiakodu.springExample;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @GetMapping("/")
    public String add(){

        return "add";
    }

    @GetMapping("/show")
    public String show(@RequestParam String title,
                       @RequestParam String description,
                       @RequestParam String autor,
                       ModelMap modelMap
                       ){
        post post = new post(title,description, autor);
        modelMap.put("post",post);
        return "show";


    }


    }
