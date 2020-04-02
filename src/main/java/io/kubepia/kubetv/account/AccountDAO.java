package io.kubepia.kubetv.account;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * AccountDAO
 */
@Mapper
public interface AccountDAO {
        public CustomerVO loginRequest(@Param("userEmail") String userEmail, @Param("userPW") String userPW);

        public CustomerVO getUser(@Param("userEmail") String userEmail);

        public int updateUser(@Param("userEmail") String userEmail, @Param("userTel") String userTel,
                        @Param("userNickName") String userNickName);

        public int health();

}