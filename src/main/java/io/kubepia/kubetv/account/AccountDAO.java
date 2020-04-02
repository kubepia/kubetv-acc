package io.kubepia.kubetv.account;

import org.apache.ibatis.annotations.Mapper;

/**
 * AccountDAO
 */
@Mapper
public interface AccountDAO {
        public CustomerVO login(String userEmail, String userPW);

        public CustomerVO getUser(String userEmail);

        public int updateUser(String userEmail, String userTel, String userNickName);

        public int health();

}