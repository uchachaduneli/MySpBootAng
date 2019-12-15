package com.spboot.ang;

import com.spboot.ang.model.Role;
import com.spboot.ang.repository.RoleRepository;
import com.spboot.ang.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpBootAngApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpBootAngApplication.class, args);
    }


    // insert first role(ADMIN) by default
    @Bean
    CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository) {
        return args -> {
            Role adminRole = roleRepository.findByRole("ADMIN");
            if (adminRole == null) {
                Role newAdminRole = new Role();
                newAdminRole.setRole("ADMIN");
                roleRepository.save(newAdminRole);
            }
        };
    }
}
