package kr.co.hjsoft.moviereview.repository;

import kr.co.hjsoft.moviereview.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
