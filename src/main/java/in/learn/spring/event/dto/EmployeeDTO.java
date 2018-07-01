package in.learn.spring.event.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by dev on 12/06/18.
 */
@Data
@Entity
@Table(name = "employee")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class EmployeeDTO {


    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Long id;

    private String firstName;

    private String lastName;

    private String designation;

}
