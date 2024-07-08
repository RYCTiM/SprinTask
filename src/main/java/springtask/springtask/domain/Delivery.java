package springtask.springtask.domain;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter@Getter
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private Address address;
//    private Status

}
