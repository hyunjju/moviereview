package kr.co.hjsoft.moviereview.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = "movie")
//항상 Movie 안에서 생성되므로 Embeddable 추가
@Embeddable
//Movie 와 함께 생성되고 수정되므로 별도의 샹성 날짜와
//수정 날짜를 가질 필요가 없음
public class MovieImage{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inum;
    private String uuid;
    private String imgName;
    private String path;

    @ManyToOne(fetch = FetchType.LAZY) //무조건 lazy로
    private Movie movie;
}