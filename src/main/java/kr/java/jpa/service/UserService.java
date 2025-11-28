package kr.java.jpa.service;

import kr.java.jpa.model.repository.UserInfoRepository;
import kr.java.jpa.model.repository.UserLoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor // 필수 생성자를 자동으로 만들어지게
@Transactional(readOnly = true) // 쓰기가 아닌 transaction을 기본으로
public class UserService {
    private final UserLoginRepository userLoginRepository;
    private final UserInfoRepository userInfoRepository;
    // 생성자 주입 시 final 안만들어도 되는 건 boot, data 기능 X. lombok.


}
