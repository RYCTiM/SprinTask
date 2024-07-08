package springtask.springtask.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter@Setter@Entity
@MappedSuperclass
public abstract class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID 필드
    @Column(name = "name_id")
    private String name; // &#xC774;&#xB984; &#xD544;&#xB4DC;
    private int price; // 가격 필드
    private int stockQuantity; // 재고 수량 필드
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album; // Album과의 ManyToOne 관계

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book; // Book과의 ManyToOne 관계

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie; // Movie와의 ManyToOne 관계
}
