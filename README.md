# Publish-Subscribe Channel + Spring

The PublishSubscribeChannel implementation broadcasts any Message sent to it to all of its subscribed handlers. This is most often used for sending Event Messages whose primary role is notification as opposed to Document Messages which are generally intended to be processed by a single handler. 

this example shows how to create message and publish that to their subscribers with help of spring project.
## Getting started
### Prerequisites:
- Java 8
- Maven
- H2


When ever save method calls and creates new entry, a event is published. 
```
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        EmployeeDTO employee = employeeRepository.save(employeeDTO);
        eventManager.createEvent(new EmployeeEvent(this, "Created new Employee", employeeDTO));
        return employee;
    }
```

this is a subscriber class where we can decide to do on event. 
```$xslt
    public void onApplicationEvent(EmployeeEvent employeeEvent) {
        System.out.println("Sucessfull tested with employee : " + employeeEvent.getEventType());
    }
```

we have two classes i.e. `EventManagerImpl` and `EventProcessor`
EventManagerImpl is used as publisher and EventProcessor is process that published message.