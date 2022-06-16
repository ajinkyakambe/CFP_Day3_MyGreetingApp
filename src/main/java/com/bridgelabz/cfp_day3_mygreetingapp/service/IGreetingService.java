package com.bridgelabz.cfp_day3_mygreetingapp.service;


import com.bridgelabz.cfp_day3_mygreetingapp.model.Greeting;
import com.bridgelabz.cfp_day3_mygreetingapp.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    List<Greeting> getAllGreetings();
    Greeting editGreeting(Greeting greeting);
    String deleteMessageById(long id);
}
