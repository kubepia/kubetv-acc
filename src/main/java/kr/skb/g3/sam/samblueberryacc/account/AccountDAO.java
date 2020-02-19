package kr.skb.g3.sam.samblueberryacc.account;

import org.apache.ibatis.annotations.Mapper;

/**
 * AccountService
 */
@Mapper
public interface AccountDAO {
        public CustomerVO login(String userEmail, String userPw);
        public CustomerVO getUser(String userEmail);
    
        public int updateUser(String userEmail, String userTel, String userNickName);
        public int health();
    
    
}