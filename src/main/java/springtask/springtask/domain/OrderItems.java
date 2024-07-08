package springtask.springtask.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//필요한 라이브러리들
@Entity
@Getter
@Setter

public class OrderItems {
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne //다대다는 위험하니 다대1로 변경해주는 과정
    @JoinColumn(name = "order_id")
    private Order orders;
    private int orderPrice;
    private int count;

}
