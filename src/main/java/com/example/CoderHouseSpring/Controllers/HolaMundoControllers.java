package com.example.CoderHouseSpring.Controllers;


import com.example.CoderHouseSpring.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoControllers {
    private static final String template = "Hello, %s!";

    @GetMapping("/hola")
    public String greeting1() {
        System.out.println("Get request made to /hola");
        return "Hola Mundo";

    }

    @GetMapping("/var1/var2")
    public String greeting2() {
        System.out.println("Get request made to /var1/var2");
        return "hola gola";
    }

    @GetMapping("/animal")
    public Animal animal() {
        System.out.println("Get request made to /var1/var2");
        return new Animal("Frida", 10, true);

    }
}
