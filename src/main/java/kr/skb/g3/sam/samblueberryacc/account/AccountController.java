package kr.skb.g3.sam.samblueberryacc.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 */
@RestController
@RequestMapping(value = "/api")
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountDAO dao;
    

    @PostMapping(value = "/login")
    public @ResponseBody CustomerVO login(@RequestParam String userEmail, @RequestParam String userPw) {
        // TODO: process POST request
        logger.info("loggin userEmail : {}", userEmail);
        CustomerVO user = this.dao.login(userEmail, userPw);
        return user;
    }

    @GetMapping(value = "/user/{userEmail}")
    public @ResponseBody CustomerVO getUser(@PathVariable String userEmail) {
        // TODO: process POST request
        logger.info("get userinfo : {}", userEmail);
        CustomerVO user = this.dao.getUser(userEmail);
        return user;
    }

    @PostMapping(value = "/user")
    public @ResponseBody CustomerVO updateUser(@RequestParam String userEmail, @RequestParam String userPw,
            @RequestParam String userName, @RequestParam String userNickName, @RequestParam String userTel,
            @RequestParam Boolean membership) {
        // TODO: process POST request
        CustomerVO user = new CustomerVO(userEmail, userPw, userName, userNickName, userTel, membership);
        logger.info("update user : {}", user.toString());
        int number = this.dao.updateUser(userEmail, userTel, userNickName);
        if(0 == number){
            return null;
        }else{
            this.dao.getUser(userEmail);
            return user;
        }
        
    }

}