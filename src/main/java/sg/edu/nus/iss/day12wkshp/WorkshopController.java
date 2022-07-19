package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WorkshopController {
    
    @RequestMapping(path={ "/workshop"})
    public String test() {
        return "workshop";
    }

    public String testResults(
        @RequestParam(name = "inputNumber", defaultValue = "1") Integer unit,
        Model model) {

        return "workshop";
    }
}
