package sb.setup.boot_test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestAPI {

    @GetMapping("name")
    public String abc(){
        return "Sagnik Biswas";
    }
}
