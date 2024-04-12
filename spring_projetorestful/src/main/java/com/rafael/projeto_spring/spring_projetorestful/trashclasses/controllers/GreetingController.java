package com.rafael.projeto_spring.spring_projetorestful.trashclasses.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.projeto_spring.spring_projetorestful.trashclasses.classes.Greetings;

/*O Spring vai procurar no diretorio a classe RestController ,em seguida vai procurar
 * uma classe mapping
 */
@RestController
public class GreetingController {

    private static final String template = "hello ,%s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greetings greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greetings(counter.incrementAndGet(), String.format(template, name));

    }
}
