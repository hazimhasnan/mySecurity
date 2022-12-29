package github.hazimhasnan.myHelp.controller;

//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component
// Tell spring to make this into a bean and inject into spring container
//@Controller
// tell spring that the class response to a url path (Return JSP etc)
//
@RestController
public class HelloController {

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home() {
        return "Hello Hazim Toka";
    }

    @RequestMapping(path = "/myhealth", method = RequestMethod.GET)
    public String myHealth() {
        return "No worries laaa";
    }

    @GetMapping("/homev2")
    public String homev2(){
        return "New and improved Hello";
    }
}
