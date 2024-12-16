package org.sid.control.service;

import org.sid.control.dto.ComputerDTO;
import org.sid.control.entities.Computer;
import org.sid.control.mapper.ComputerMapper;
import org.sid.control.repositories.ComputerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService {
    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;

    public ComputerManager(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
        this.computerMapper = new ComputerMapper();
    }

    @Override
    public List<ComputerDTO> getComputersByProce(String process) {
        List<Computer> computers = computerRepository.findComputersByProce(process);
        List<ComputerDTO> computerDTOs = new ArrayList<ComputerDTO>();
        for (Computer computer : computers) {
            computerDTOs.add(computerMapper.toDTO(computer));
        }
        return computerDTOs;
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.toEntity(computerDTO);
        computer = computerRepository.save(computer);

        return computerMapper.toDTO(computer);
    }
}
