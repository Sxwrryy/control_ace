package org.sid.control.repositories;

import org.sid.control.entities.Computer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComputerRepository extends CrudRepository<Computer,Integer> {
    List<Computer> findComputersByProce(String proce);
}
