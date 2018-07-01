package in.learn.spring.event.processor;

import ch.qos.logback.core.net.SyslogOutputStream;
import in.learn.spring.event.EmployeeEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by dev on 12/06/18.
 */
public class EventProcessor implements ApplicationListener<EmployeeEvent> {

    @Override
    public void onApplicationEvent(EmployeeEvent employeeEvent) {
        System.out.println("Sucessfull tested with employee : " + employeeEvent.getEventType());
    }
}
