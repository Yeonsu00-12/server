package org.app.belog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmptyController {
    @GetMapping("/hello-world")
    public String Hello() {
        return "Hello World!";
    }
}
