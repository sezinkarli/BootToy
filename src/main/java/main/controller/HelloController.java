package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sezin karli (skarligmail.com)
 * @since 3/19/14 3:42 PM
 *        User: Sezin Karli
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/{user}")
    public String handleOne(@PathVariable String user, ModelMap modelMap){
        String helloToken = "Hello " + user;
        modelMap.put("token", helloToken);
        return "welcome-page";
    }
}
