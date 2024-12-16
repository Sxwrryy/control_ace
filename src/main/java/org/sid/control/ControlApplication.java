package org.sid.control;

import org.sid.control.entities.Computer;
import org.sid.control.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlApplication.class, args);
    }
    @Bean
    CommandLineRunner populateComputers(ComputerRepository computerRepository) {
        return args -> {
            computerRepository.saveAll(
                    List.of(
                            new Computer(1L, "test", 1, 1, 500f, "test"),
                            new Computer(2L, "test2", 1, 1, 500f, "test"),
                            new Computer(3L, "test3", 1, 1, 500f, "test"),
                            new Computer(4L, "test4", 1, 1, 500f, "test")
                    )
            );
        };
    }
}
