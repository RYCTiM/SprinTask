package springtask.springtask.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @Embedded
    private String Address;
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
