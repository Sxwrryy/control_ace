package org.sid.control.mapper;

import org.modelmapper.ModelMapper;
import org.sid.control.dto.ComputerDTO;
import org.sid.control.entities.Computer;

public class ComputerMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public ComputerDTO toDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer toEntity(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }
}


