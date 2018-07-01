package in.learn.spring.event.manager;

import in.learn.spring.event.EmployeeEvent;

/**
 * Created by dev on 12/06/18.
 */

public interface EventManager {

    void createEvent(EmployeeEvent employeeEvent);
}
