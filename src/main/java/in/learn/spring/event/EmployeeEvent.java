package in.learn.spring.event;

import in.learn.spring.event.dto.EmployeeDTO;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * Created by dev on 12/06/18.
 */

@Data
public class EmployeeEvent extends ApplicationEvent{

    private String eventType;
    private EmployeeDTO employee;

    public EmployeeEvent(Object source, String eventType, EmployeeDTO employee) {
        super(source);
        this.eventType = eventType;
        this.employee = employee;
    }
}
