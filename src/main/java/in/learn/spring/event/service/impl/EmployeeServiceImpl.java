package in.learn.spring.event.service.impl;

import in.learn.spring.event.EmployeeEvent;
import in.learn.spring.event.dto.EmployeeDTO;
import in.learn.spring.event.dto.repository.EmployeeRepository;
import in.learn.spring.event.manager.EventManager;
import in.learn.spring.event.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dev on 12/06/18.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EventManager eventManager;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EventManager eventManager) {
        this.employeeRepository = employeeRepository;
        this.eventManager = eventManager;
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        if (employeeDTO != null) {
            return employeeRepository.save(employeeDTO);
        }
        return null;
    }

    @Override
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        EmployeeDTO employee = employeeRepository.save(employeeDTO);
        eventManager.createEvent(new EmployeeEvent(this, "Created new Employee", employeeDTO));
        return employee;
    }

    @Override
    public EmployeeDTO get(long id) {
        return employeeRepository.findTopById(id);
    }
}
