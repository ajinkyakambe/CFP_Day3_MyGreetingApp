package com.bridgelabz.cfp_day3_mygreetingapp.controller;


import com.bridgelabz.cfp_day3_mygreetingapp.model.Greeting;
import com.bridgelabz.cfp_day3_mygreetingapp.model.User;
import com.bridgelabz.cfp_day3_mygreetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    @GetMapping("")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template,name));
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);

    }

    @GetMapping("/findbyid/{id}")
    public Greeting findGreetingById(@PathVariable long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/listall")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PutMapping("/edit")
    public Greeting editGreeting(Greeting greeting) {
        return greetingService.editGreeting(greeting);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMessageById(@PathVariable long id) {
        return this.greetingService.deleteMessageById(id);
    }
}
