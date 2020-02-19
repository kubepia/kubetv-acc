package kr.skb.g3.sam.samblueberryacc.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CustomerVO
 */
public class CustomerVO {

    private static final Logger logger = LoggerFactory.getLogger(CustomerVO.class);

    CustomerVO(String userEmail, 
    String userPw,
    String userName,
    String userNickName,
    String userTel,
    Boolean membership) {
        this.userEmail = userEmail;
        this.userName =userName;
        this.userTel =userTel;
        this.userPW =userPw;
        this.userNickName =userNickName;
        this.membership = membership;
    }
    CustomerVO() {
        this.userEmail = "userEmail";
        this.userName = "userName";
        this.userTel = "userTel";
        this.userPW = "userPW";
        this.userNickName = "userNickName";
        this.membership = false;
    }

    String userEmail;
    String userName;
    String userTel;
    String userPW;
    String userNickName;
    Boolean membership;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Boolean getMembership() {
        return membership;
    }

    public void setMembership(Boolean membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        logger.info("{} {} {} {} {}", this.userEmail, this.userName, this.userNickName, this.userTel, this.membership);
        return super.toString();
    }

}
