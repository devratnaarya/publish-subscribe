package in.learn.spring.event.controller;

import in.learn.spring.event.dto.EmployeeDTO;
import in.learn.spring.event.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dev on 12/06/18.
 */
@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "employee", method = RequestMethod.POST)
    public @ResponseBody EmployeeDTO save(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.save(employeeDTO);
    }

    @RequestMapping(value = "{id}/employee", method = RequestMethod.GET)
    public @ResponseBody EmployeeDTO get(@PathVariable("id") long id) {
        return employeeService.get(id);
    }
}
