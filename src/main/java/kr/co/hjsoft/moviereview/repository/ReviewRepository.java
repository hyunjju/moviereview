package kr.co.hjsoft.moviereview.repository;

import kr.co.hjsoft.moviereview.entity.Member;
import kr.co.hjsoft.moviereview.entity.Movie;
import kr.co.hjsoft.moviereview.entity.Review;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @EntityGraph(attributePaths = {"member"}, type = EntityGraph.EntityGraphType.FETCH)
    //영화 정보를 가지고 모든 영화의 모든 리뷰를 가져오는 메소드
    List<Review> findByMovie(Movie movie);

    //Member 가 지워질 때 같이 데이터를 지우는 메소드
    void deleteByMember(Member member);

    //Movie 가 지워질 때 같이 데이터를 지우는 메소드
    void deleteByMovie(Movie movie);


}