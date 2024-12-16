package org.sid.control.web;

import org.sid.control.dto.ComputerDTO;
import org.sid.control.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ComputerGraphQLController {
    private ComputerService service;

    public ComputerGraphQLController(ComputerService service) {
        this.service = service;
    }

    @QueryMapping
    public List<ComputerDTO> getComputersByProce(@Argument String proce) {
        return service.getComputersByProce(proce);
    }

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computer) {
        return service.saveComputer(computer);
    }
 }
