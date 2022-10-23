package htw.berlin.webtech.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorldController {

@GetMapping(path = "/")
    public ModelAndView ShowHelloWorld(){
  return new ModelAndView( "helloworld");
}

}
