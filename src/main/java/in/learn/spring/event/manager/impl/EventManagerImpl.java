package in.learn.spring.event.manager.impl;

import in.learn.spring.event.EmployeeEvent;
import in.learn.spring.event.dto.EmployeeDTO;
import in.learn.spring.event.manager.EventManager;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * Created by dev on 12/06/18.
 */
@Service
public class EventManagerImpl implements EventManager, ApplicationEventPublisherAware{

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    @Override
    public void createEvent(EmployeeEvent employeeEvent) {
        publisher.publishEvent(employeeEvent);
    }
}
