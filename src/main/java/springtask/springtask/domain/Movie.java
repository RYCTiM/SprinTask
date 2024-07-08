package springtask.springtask.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public  class Movie extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_id")
    private String title;

    @Column(name = "director")
    private String director;

    // 기본 생성자
    public Movie() {}
}
