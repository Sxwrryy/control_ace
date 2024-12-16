package org.sid.control.service;

import org.sid.control.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {
    List<ComputerDTO> getComputersByProce(String process);
    ComputerDTO saveComputer(ComputerDTO computerDTO);
}
