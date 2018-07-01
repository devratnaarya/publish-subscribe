package in.learn.spring.event.service;

import in.learn.spring.event.dto.EmployeeDTO;

/**
 * Created by dev on 12/06/18.
 */
public interface EmployeeService {

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO save(EmployeeDTO employeeDTO);

    EmployeeDTO get(long id);
}
