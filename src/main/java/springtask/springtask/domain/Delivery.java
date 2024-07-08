package springtask.springtask.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter@Getter
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private String Address;
//    private Status

}
