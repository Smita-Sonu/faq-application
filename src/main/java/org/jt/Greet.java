package org.jt;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greet {
    @GetMapping("/hello")
    public void getMethodName(PrintWriter pw) {
        pw.println("hello");
    }

}
