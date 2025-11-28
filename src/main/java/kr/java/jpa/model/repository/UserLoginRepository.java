package kr.java.jpa.model.repository;

import kr.java.jpa.model.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository<엔터티클래스명, 키클래스>
public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {

    // save, findById, findAll, delete...
    // 이미 JPQL을 기반해서 추상화

    // 쿼리 메서드 사용으로 알아서 메서드 만들어지게...
    // UserLogin findByUsername(String username);
    // null에 대한 확인을 하도록 강제
    Optional<UserLogin> findByUsername(String username);
    // SELECT * FROM user_login WHERE username = :username

    boolean existsByUsername(String username);
    // SELECT count(*) > 0 FROM user_login WHERE username = :username
}
