package in.learn.spring.event.dto.repository;

import in.learn.spring.event.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dev on 12/06/18.
 */

public interface EmployeeRepository extends JpaRepository<EmployeeDTO, Long>{

    EmployeeDTO findTopById(long id);
}
