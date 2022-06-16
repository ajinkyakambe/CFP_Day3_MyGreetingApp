package com.bridgelabz.cfp_day3_mygreetingapp.repository;



import com.bridgelabz.cfp_day3_mygreetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}